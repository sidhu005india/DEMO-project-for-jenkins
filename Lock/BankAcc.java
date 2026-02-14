package Lock;

public class BankAcc {

    private int balance = 50;

    public synchronized void withdraw(int amount ) throws InterruptedException {

        System.out.println("attempting to withdraw money");
        if(balance>= amount){
            System.out.println(Thread.currentThread().getName()+" withdrawing......");
            Thread.sleep(2000);
            balance = balance - amount;

        }else{
            System.out.println(Thread.currentThread().getName()+" insufficient balance......");

        }




    }






}
