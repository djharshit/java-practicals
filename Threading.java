// Threading in java

class Multi extends Thread
{
    public void run() {

        for (int i=0; i<5; i++) {
            System.out.println(i);
        }
    }
}

public class Threading
{
    public static void main(String args[]) {

        Multi t1 = new Multi();
        Multi t2 = new Multi();
        Multi t3 = new Multi();
        t1.start();
        t2.start();
        t3.start();
    }
}
