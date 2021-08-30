public class SampleDemo  implements Runnable{

    private Thread t;
    private String threadname;

    SampleDemo(String threadname){
        this.threadname = threadname;
    }

    public void run(){
        while(true){
            System.out.println(threadname);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void start(){
        if(t == null){
            t = new Thread(this.threadname);
            t.start();
            t.run();
        }
    }
}



