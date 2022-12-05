package task9992_AtomicInteger_ReadWriteLock_Synchronized_Exceptions;

import java.util.concurrent.atomic.AtomicInteger;

// https://www.geeksforgeeks.org/atomicinteger-for-lock-free-algorithms-in-java/

// Real-Time data processing
// Bank accounts are reconciled in real time to enable 
// the most up-to-date data, but requires more computing power than the other methods.

// Lock-Free Algorithms is one of the mechanisms in which thread-safe access to shared data 
// is possible without the use of Synchronization primitives like mutexes. 
// Multi-threaded applications have shared resources that may be passed among different threads used in the application. 

class BankAccount_AtomicInteger {

    private AtomicInteger balance = new AtomicInteger();

    public void deposit(int i) {
        balance.addAndGet(i);
    }

    public boolean withdraw(int amount) {
        while (true) {
            int currentValue = balance.get();
            if (currentValue < amount)  // do not allow overdrawing
//                return false; // don't wait for money
                continue; // wait for money in spinning mode
            if (balance.compareAndSet(currentValue, currentValue-amount))
                return true;
        }
    }

    public int getBalance() {
        return balance.get();
    }

    public String toString() {
        return "Konto mit Stand: " + balance.get();
    }
	
}
