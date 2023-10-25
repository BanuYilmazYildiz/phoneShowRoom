package com.banu.PhoneShowRoom.exception;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PhoneShowRoomException extends RuntimeException{

    /*
        sifreler doğru değil
        uername yanlıs sekilde girildi gibi uygulmaya özel exceptionlar buraya yazılır
     */

    private final ErrorType errorType;
    public PhoneShowRoomException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType=errorType;
    }

    public PhoneShowRoomException(ErrorType errorType, String message){
        super(message);
        this.errorType=errorType;
    }

}
