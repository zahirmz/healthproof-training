package threading;
public class User2 {

	public static void main(String[] args) {
        Tables obj = new Tables(); 
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}
