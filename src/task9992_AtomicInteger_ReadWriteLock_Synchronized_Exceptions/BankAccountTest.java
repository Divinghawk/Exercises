package task9992_AtomicInteger_ReadWriteLock_Synchronized_Exceptions;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class BankAccountTest {

	 private BankAccount_Synchronized bankAccount = new BankAccount_Synchronized();
	
   @Test
   public void newlyOpenedAccountHasEmptyBalance() throws BankAccountActionInvalidException {
        bankAccount.open();
        Assert.assertEquals(0, bankAccount.getBalance());
    }
	
    @Ignore("Remove to run test")
    @Test
    public void canDepositMoney() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(10);
        Assert.assertEquals(10, bankAccount.getBalance());
    }
   
    @Ignore("Remove to run test")
    @Test
    public void canDepositMoneySequentially() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(5);
        bankAccount.deposit(23);
        Assert.assertEquals(28, bankAccount.getBalance());
    }
    
    @Ignore("Remove to run test")
    @Test
    public void canWithdrawMoney() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(10);
        bankAccount.withdraw(5);
        Assert.assertEquals(5, bankAccount.getBalance());
    }
    
    @Ignore("Remove to run test")
    @Test
    public void canWithdrawMoneySequentially() throws BankAccountActionInvalidException {
        bankAccount.open();
        bankAccount.deposit(23);
        bankAccount.withdraw(10);
        bankAccount.withdraw(13);
        Assert.assertEquals(0, bankAccount.getBalance());
    }
    
//    @Ignore("Remove to run test")
//    @Test
//   public void cannotWithdrawMoneyFromEmptyAccount() {
//        bankAccount.open();
//       Assert.assertThrows(BankAccountActionInvalidException.class)
//           .isThrownBy(() -> bankAccount.withdraw(5))
//            .withMessage("Cannot withdraw money from an empty account");
//    }
    
//    @Ignore("Remove to run test")
//    @Test
//    public void cannotWithdrawMoreMoneyThanYouHave() throws BankAccountActionInvalidException {
//        bankAccount.open();
//        bankAccount.deposit(6);
//        assertThatExceptionOfType(BankAccountActionInvalidException.class)
//            .isThrownBy(() -> bankAccount.withdraw(7))
//            .withMessage("Cannot withdraw more money than is currently in the account");
//    }
    
//    @Ignore("Remove to run test")
//    @Test
//    public void cannotDepositNegativeAmount() {
//        bankAccount.open();
//        assertThatExceptionOfType(BankAccountActionInvalidException.class)
//            .isThrownBy(() -> bankAccount.deposit(-1))
//            .withMessage("Cannot deposit or withdraw negative amount");
//    }
    
//    @Ignore("Remove to run test")
//    @Test
//    public void cannotWithdrawNegativeAmount() throws BankAccountActionInvalidException {
//        bankAccount.open();
//        bankAccount.deposit(105);
//        assertThatExceptionOfType(BankAccountActionInvalidException.class)
//            .isThrownBy(() -> bankAccount.withdraw(-5))
//            .withMessage("Cannot deposit or withdraw negative amount");
//    }
    
//    @Ignore("Remove to run test")
//    @Test
//    public void cannotGetBalanceOfClosedAccount() throws BankAccountActionInvalidException {
//        bankAccount.open();
//        bankAccount.deposit(10);
//        bankAccount.close();
//        assertThatExceptionOfType(BankAccountActionInvalidException.class)
//            .isThrownBy(bankAccount::getBalance)
//            .withMessage("Account closed");
//    }
    
//    @Ignore("Remove to run test")
//    @Test
//    public void cannotDepositMoneyIntoClosedAccount() {
//        bankAccount.open();
//        bankAccount.close();
//        assertThatExceptionOfType(BankAccountActionInvalidException.class)
//            .isThrownBy(() -> bankAccount.deposit(5))
//            .withMessage("Account closed");
//    }
    
//    @Ignore("Remove to run test")
//    @Test
//    public void cannotWithdrawMoneyFromClosedAccount() throws BankAccountActionInvalidException {
//        bankAccount.open();
//        bankAccount.deposit(20);
//        bankAccount.close();
//        assertThatExceptionOfType(BankAccountActionInvalidException.class)
//            .isThrownBy(() -> bankAccount.withdraw(5))
//            .withMessage("Account closed");
//    }
    
//    @Ignore("Remove to run test")
//    @Test
//    public void bankAccountIsClosedBeforeItIsOpened() {
//        assertThatExceptionOfType(BankAccountActionInvalidException.class)
//            .isThrownBy(bankAccount::getBalance)
//            .withMessage("Account closed");
//    }
    
//    @Ignore("Remove to run test")
//    @Test
//    public void canAdjustBalanceConcurrently() throws BankAccountActionInvalidException, InterruptedException {
//        bankAccount.open();
//        bankAccount.deposit(1000);
//        for (int i = 0; i < 10; i++) {
//            adjustBalanceConcurrently();
//            assertThat(bankAccount.getBalance()).isEqualTo(1000);
//        }
//    }
    
//    private void adjustBalanceConcurrently() throws BankAccountActionInvalidException, InterruptedException {
//        Random random = new Random();
//        Thread[] threads = new Thread[1000];
//        for (int i = 0; i < 1000; i++) {
//            threads[i] = new Thread(() -> {
//                try {
//                    bankAccount.deposit(5);
//                    Thread.sleep(random.nextInt(10));
//                    bankAccount.withdraw(5);
//                } catch (BankAccountActionInvalidException e) {
//                    fail("Exception should not be thrown: " + e.getMessage());
//                } catch (InterruptedException ignored) {
//                }
//            });
//            threads[i].start();
//        }
//        for (Thread thread : threads) {
//            thread.join();
//        }
//    }

}
