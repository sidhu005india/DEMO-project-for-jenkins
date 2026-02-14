public class ExceptionHandling
{
    public static void main(String[] args) {


        game game = new game();
        Thread t1 = new Thread(game);
        t1.start();
        for (int i =0 ; i<1000;i++){


            System.out.println("hello");
        }



    }
}








