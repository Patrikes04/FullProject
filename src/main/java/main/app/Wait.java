package main.app;


public class Wait {
    public static void exe(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
