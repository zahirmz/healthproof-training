package task.weak1;//Interface Task 2
interface Playable {
	 void startGame();
	 void stopGame();
}


abstract class GameConsole implements Playable {
	 String consoleName;
	 public GameConsole(String consoleName) {
	     	this.consoleName = consoleName;
	 }
	 public void displayConsole() {
	     	System.out.println("Console Name: " + consoleName);
	 }
	
	 public abstract void showGameType();
}
class PS5 extends GameConsole {
	 public PS5() {
	     	super("PS5");
	 }
	 @Override
	 public void startGame() {
	     	System.out.println("PS5 is starting the game...");
	 }
	
	 @Override
	 public void stopGame() {
	     	System.out.println("PS5 is stopping the game...");
	 }	
	 @Override
	 public void showGameType() {
		 	System.out.println("PS5 supports next-gen action games like 'Spider-Man: Miles Morales'");
	 }
}

class Xbox extends GameConsole {
	 public Xbox() {
	     super("Xbox Series X");
	 }
	
	 @Override
	 public void startGame() {
	     System.out.println("Xbox is starting the game...");
	 }
	
	 @Override
	 public void stopGame() {
	     System.out.println("Xbox is stopping the game...");
	 }
	
	 @Override
	 public void showGameType() {
	     System.out.println("Xbox supports high-performance gaming like 'Halo Infinite'");
	 }
}

class NintendoSwitch extends GameConsole {
	 public NintendoSwitch() {
	     super("Nintendo Switch");
	 }
	 @Override
	 public void startGame() {
	     System.out.println("Nintendo Switch is starting the game...");
	 }
	 @Override
	 public void stopGame() {
	     System.out.println("Nintendo Switch is stopping the game...");
	 }
	
	 @Override
	 public void showGameType() {
	     System.out.println("Nintendo Switch is great for portable gaming with titles like 'The Legend of Zelda: Breath of the Wild'");
	 }
}
public class GamingConsoleDemo {
	public static void main(String[] args) {
	     GameConsole ps5 = new PS5();
	     GameConsole xbox = new Xbox();
	     GameConsole nintendoSwitch = new NintendoSwitch();
	     ps5.displayConsole();
	     ps5.showGameType();
	     ps5.startGame();
	     ps5.stopGame();
	
	     System.out.println();  
	
	     xbox.displayConsole();
	     xbox.showGameType();
	     xbox.startGame();
	     xbox.stopGame();
	
	     System.out.println();  
	
	     nintendoSwitch.displayConsole();
	     nintendoSwitch.showGameType();
	     nintendoSwitch.startGame();
	     nintendoSwitch.stopGame();
	}
}
