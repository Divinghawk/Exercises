package task9992_AtomicInteger_ReadWriteLock_Synchronized_Exceptions;

// https://www.geeksforgeeks.org/synchronization-in-java/

//Only one thread can execute at a time. 
//sync_object is a reference to an object
//whose lock associates with the monitor. 
//The code is said to be synchronized on
//the monitor object

// synchronized(sync_object){
// Access shared variables and other
// shared resources
//}

class BankAccount_Synchronized {

    private final String insufficientFunds = "Cannot withdraw more money than is currently in the account";
    private final String emptyAccount = "Cannot withdraw money from an empty account";
    private final String negativeAmount = "Cannot deposit or withdraw negative amount";
    private final String accountClosed = "Account closed";
    private int balance;
    private boolean active;
    
    	BankAccount_Synchronized() {}
    
    	public void open() {
    		active = true;
    	}
    	
    	public synchronized int getBalance() throws BankAccountActionInvalidException {
    		if (!active) {
            throw new BankAccountActionInvalidException(accountClosed);
    		}
    		return balance;
    	}
    	
    	public synchronized void deposit(int amount) throws BankAccountActionInvalidException {
    		if (!active) {
            throw new BankAccountActionInvalidException(accountClosed);
    		}
    		if (amount < 0) {
    			throw new BankAccountActionInvalidException(negativeAmount);
    		}
    		balance += amount;
        
	    	}
    	
	    public synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
    		if (!active) {
    			throw new BankAccountActionInvalidException(accountClosed);
    		}
    		if (amount < 0) {
    			throw new BankAccountActionInvalidException(negativeAmount);
    		}
    		if (balance < amount) {
    			String message = balance == 0 ? emptyAccount : insufficientFunds;
    			throw new BankAccountActionInvalidException(message);
    		}
    		balance -= amount;       
    	}
    
    	public void close() {
    		active = false;
    	}
}
