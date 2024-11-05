package io.codeexperience.appwiremock.common.exceptions;

import io.codeexperience.appwiremock.common.exceptions.enums.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class WiremockException extends RuntimeException {
    private final ErrorCode errorCode;
}

