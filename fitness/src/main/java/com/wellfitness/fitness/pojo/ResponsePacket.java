package com.wellfitness.fitness.pojo;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponsePacket<T> {

    private int errorCode;
    public boolean success;
    private String message;
    private T responsePacket;
    private List<String> listOfErrors;

    public ResponsePacket(int errorCode, String message, T responsePacket) {
        this.errorCode = errorCode;
        this.message = message;
        this.responsePacket = responsePacket;
        success = errorCode <= 0;
    }

    public ResponsePacket(int errorCode, String message, T responsePacket, List<String> listOfErrors) {
        this.errorCode = errorCode;
        this.message = message;
        this.responsePacket = responsePacket;
        this.listOfErrors = listOfErrors;
        success = errorCode <= 0;
    }

}
