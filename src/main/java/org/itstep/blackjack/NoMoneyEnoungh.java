package org.itstep.blackjack;

public class NoMoneyEnoungh extends Exception {
    public NoMoneyEnoungh() {
    }

    public NoMoneyEnoungh(String message) {
        super(message);
    }

    public NoMoneyEnoungh(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoneyEnoungh(Throwable cause) {
        super(cause);
    }

    public NoMoneyEnoungh(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
