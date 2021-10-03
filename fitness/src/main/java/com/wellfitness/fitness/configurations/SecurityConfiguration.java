package com.wellfitness.fitness.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.jmx.support.RegistrationPolicy;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/**").permitAll();
        http.csrf().disable();

//        http.csrf().requireCsrfProtectionMatcher(new RequestMatcher() {
//            private Pattern allowedMethods = Pattern.compile("^(GET|HEAD|TRACE|OPTIONS)$");
////            private RegexRequestMatcher apiMatcher = new RegexRequestMatcher("/v[0-9]*/api/.*", null);
//
//            @Override
//            public boolean matches(HttpServletRequest request) {
//                // No CSRF due to allowedMethod
//                if (allowedMethods.matcher(request.getMethod()).matches())
//                    return false;
//
//                // No CSRF due to api call
//                if (new AntPathRequestMatcher("/v1/api/**").matches(request))
//                    return false;
//
//                // CSRF for everything else that is not an API call or an allowedMethod
//                return true;
//            }
//        });
    }

    @Bean
    public SessionRegistry sessionRegistry() {
        return new SessionRegistryImpl();
    }

}