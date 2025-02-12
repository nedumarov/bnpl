package uz.bnpl.client.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import uz.bnpl.client.exception.cause.ApplicationExceptionCause;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ApplicationException extends RuntimeException {
    public ApplicationException(ApplicationExceptionCause applicationExceptionCause) {
        super(applicationExceptionCause.getMessage());
    }
}