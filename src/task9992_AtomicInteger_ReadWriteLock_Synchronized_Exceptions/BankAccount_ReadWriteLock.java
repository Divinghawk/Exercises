package task9992_AtomicInteger_ReadWriteLock_Synchronized_Exceptions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// https://www.geeksforgeeks.org/readwritelock-interface-in-java/

// Simultaneous processing of processes in threads is possible with each process being terminated by a lock.
// No real-time data

// Read lock and Write lock which allows a thread to lock the ReadWriteLock either for reading or writing. 

// 1. Read lock: If there is no thread that has requested the write lock and the lock for writing, then multiple threads can lock the lock for reading.
// It means multiple threads can read the data at the very moment, as long as there’s no thread to write the data or to update the data.
// 2. Write Lock: If no threads are writing or reading, only one thread at a moment can lock the lock for writing. 
// Other threads have to wait until the lock gets released. It means, only one thread can write the data at the very moment,
// and other threads have to wait.
// Methods: There are two methods that ReadWritelock provides:
//
// 1. Lock readLock()
// 2. Lock writeLock()

class BankAccount_ReadWriteLock {

    private ReentrantReadWriteLock lock ;
    private BankAccount_ReadWriteLock account = new BankAccount_ReadWriteLock();

    ReentrantReadWriteLock ReadWriteLockFacadeAccount(ReentrantReadWriteLock lock) {
       return this.lock = lock;
    }
    
    public  void  deposit(int i){
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            account.deposit(i);
        } finally {
            lock.unlock();
        }
    }

    @SuppressWarnings("unused")
	private  String  withdraw(int i) {
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            return account.withdraw(i);
        } finally {
            lock.unlock();
        }
    }

    public int getBalance(){
        Lock lock = this.lock.readLock();
        lock.lock();
        try {
            return account.getBalance();
        } finally {
            lock.unlock();
        }
    }

    public String toString() {
        Lock lock = this.lock.readLock();
        try {
            return "AccountFacade: " + account.toString();
        } finally {
            lock.unlock();
        }
    }
	
}
