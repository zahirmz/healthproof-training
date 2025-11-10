package threading;

public class Thread1 extends Thread {
    Tables t;
    Thread1(Tables t) { 
    	this.t = t;
    	}
    public void run() {
        t.printTable(5);
    }

}
