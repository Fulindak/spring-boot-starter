package custom.exception.starter.controller;

import custom.exception.starter.exception.CurrencyFileWriteException;
import custom.exception.starter.exception.ErrorResponse;
import custom.exception.starter.exception.ForbiddenException;
import custom.exception.starter.exception.IllegalCurrencyTypeException;
import custom.exception.starter.exception.InvalidStatusException;
import custom.exception.starter.exception.InvalidValueException;
import custom.exception.starter.exception.ResourceNotAvailableException;
import custom.exception.starter.exception.ResourceNotFoundException;
import custom.exception.starter.exception.UploadException;
import custom.exception.starter.exception.ValueAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleException(Exception e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(ValueAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorResponse handleIllegalState(ValueAlreadyExistsException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleResourceNotFound(ResourceNotFoundException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(ResourceNotAvailableException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleResourceNotAvailable(ResourceNotAvailableException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleMethodArgumentNotValid(MethodArgumentNotValidException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleIncorrectDataType(HttpMessageNotReadableException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(InvalidValueException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleInvalidValue(InvalidValueException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(ForbiddenException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorResponse handleForbidden(ForbiddenException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(InvalidStatusException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleInvalidStatus(InvalidStatusException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }


    @ExceptionHandler(IllegalCurrencyTypeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleIllegalCurrencyType(IllegalCurrencyTypeException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(CurrencyFileWriteException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleCurrencyFileWrite(CurrencyFileWriteException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }

    @ExceptionHandler(UploadException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleUpload(UploadException e) {
        return new ErrorResponse(e.getMessage(), e.getClass().getSimpleName(), e.getStackTrace()[0].getClassName());
    }
}
