package threading;

public class Thread2 extends Thread {
    Tables t;
    Thread2(Tables t) { this.t = t; }
    public void run() {
        t.printTable(100);
    }

}
