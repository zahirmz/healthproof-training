package threading;

//public class Tables {
//    synchronized void printTable(int n) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(n * i);
//            try {
//                Thread.sleep(400);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//    }
//
//}//Method level synchronization


public class Tables {
    public void printTable(int n) {
        synchronized (this) {  // synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i); // print table value
                try {
                    Thread.sleep(3000); // pause for 3 seconds
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//block level synchronization
}

