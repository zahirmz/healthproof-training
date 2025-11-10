package threading;

public class OddorEven {
    int num=1; 
    int limit=10; 
    public synchronized void printOdd() {
        while (num<limit) {
            while(num%2 == 0) { 
                try{
                    wait();
                }catch(Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Odd:" + num);
            num++;
            notify(); 
        }
    }

    public synchronized void printEven() {
        while(num<=limit) {
            while(num%2==1) {                 
            	try {
                    wait();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even:" + num);
            num++;
            notify(); 
        }
    }

    public static void main(String[] args) {
        OddorEven oe = new OddorEven();
        Thread t1 = new Thread();
        oe.printOdd();
        Thread t2 = new Thread(); 
        oe.printEven();
        t1.start();
        t2.start();
    }
}
