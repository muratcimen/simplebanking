package com.muratcimen.simplebanking.exceptions;

public class AccountNotFoundException  extends CustomRuntimeException {

    public AccountNotFoundException(String code) {
        super(code);
    }
    public AccountNotFoundException(String code, Object... userNameArgs) {
        super(code, userNameArgs);
    }
}
