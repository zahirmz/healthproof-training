package threading;

public class Justepasteit {

}
package threading;

public class User2 {

}
package com.example;



public class ThreadDemo extends Thread{

public static void main(String[] args) {

ThreadDemo th1=new ThreadDemo();//New Born 

	th1.start();//Runnable

}

public void run()

{

for(int i=1;i<=5;i++)

{

System.out.println(i);

try {

Thread.sleep(3000);

} catch (InterruptedException e) {

e.printStackTrace();

}

}

}

}

---------------------------------------------------------------------------------------------------------------------



package com.example;



public class Demo implements Runnable{



public static void main(String[] args) {

Demo rn=new Demo();

Thread th1=new Thread(rn);

th1.start();

Thread th2=new Thread(rn);

th2.start();

}

@Override

	public void run() {

System.out.println("Runnable Object");

}



}

--------------------------------------------------------------------------------------------------------------------------------

package com.example;



public class Table {

public void print(int x)

{

for(int i=1;i<=5;i++)

{

System.out.println(i*x);

try {

Thread.sleep(3000);

} catch (InterruptedException e) {

// TODO Auto-generated catch block

 e.printStackTrace();

}

}

}

}

-----------------------------------------------------------------------------------------------------------------------

package com.example;



public class A {

Table t;

A(Table t)

{

this.t=t;

}

public void disp()

{

t.print(5);

}



}

-------------------------------------------------------------------------------------------------------------------------------------

package com.example;



public class User2 {

public static void main(String[] args) {

Table tbl=new Table();

A a=new A(tbl);

a.disp();

}

}

