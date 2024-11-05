package io.codeexperience.appwiremock.common.exceptions;

import io.codeexperience.appwiremock.common.exceptions.enums.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ClientException extends RuntimeException{
    private final ErrorCode errorCode;


}
