package Lock;

public class ThreadClass {

    public static void main(String[] args) {


     BankAcc bankAcc = new BankAcc();

     Runnable runnable = ()->{

             try {
                 bankAcc.withdraw(50);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }

     };
     Thread t1 = new Thread(runnable);
     t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();




    }





}
