package com.jwtmy.jwt_security.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
    @ControllerAdvice
    @SuppressWarnings({"checkstyle:AbbreviationAsWordInName", "PMD.TooManyMethods"})
    public class ExceptionRestHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(Exception.class)
//    public final ResponseEntity<ExceptionResponse> handleAllExceptions(final Exception exception, final WebRequest request) {
//        log.error("Unexpected error", exception);
//        final ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ErrorMessages.UNEXPECTED_ERROR.getMessage(),
//                request.getDescription(false));
//        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    @ExceptionHandler(OilTypeRegistryNotFoundException.class)
//    public final ResponseEntity<ExceptionResponse> handleOilTypeRegistryNotFoundException(final WebRequest request) {
//        final ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(),
//                ErrorMessages.ERROR_OIL_TYPE_REGISTRY_NOT_FOUND_ON_DATABASE.getMessage(), request.getDescription(false));
//        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
//    }

}
