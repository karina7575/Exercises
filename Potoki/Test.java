package Potoki;

public class Test
{
    public static void main(String[] args) {
        myThread myThread = new myThread();
        myThread.start();
        System.out.println("Hello from main thread");

    }
}
class myThread extends Thread
{
public void run()
{
    for(int i = 0; i < 1000; i++)
        System.out.println("Hello from MyThread");
}
















}
