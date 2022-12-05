package task9992_AtomicInteger_ReadWriteLock_Synchronized_Exceptions;

@SuppressWarnings("serial")
class BankAccountActionInvalidException extends Exception {

    BankAccountActionInvalidException(String message) {
        super(message);
    }
}
