package uz.bnpl.client.exception.cause;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApplicationExceptionCause {

    /**
     * Address related messages
     */
    ADDRESS_EXISTS("address_exists"),

    /**
     * Client related messages
     */
    CLIENT_NOT_FOUND("client_not_found"),
    CLIENT_EXISTS("client_exists");

    private final String message;

}
