package task.weak1;//Inheritence TASK3

import java.util.Scanner;
class MusicPlayer {

 public void play(String songName) {
     System.out.println("Playing: " + songName);
 }
}
class MP3Player extends MusicPlayer {
 @Override
 public void play(String songName) {
     System.out.println("Playing MP3 file: " + songName);
 }
}

class CDPlayer extends MusicPlayer {
 @Override
 public void play(String songName) {
     System.out.println("Playing CD: " + songName);
 }
}


class StreamingPlayer extends MusicPlayer {
 @Override
 public void play(String songName) {
     System.out.println("Streaming song online: " + songName);
 }
}

public class MusicPlayerDemo {
 public static void main(String[] args) {
 
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the song name to play: ");
     String songName = scanner.nextLine();
     System.out.println("Choose music player type:");
     System.out.println("1. MP3 Player");
     System.out.println("2. CD Player");
     System.out.println("3. Streaming Player");
     int choice = scanner.nextInt();
     MusicPlayer player = null;
     switch (choice) {
         case 1:
             player = new MP3Player();
             break;
         case 2:
             player = new CDPlayer();
             break;
         case 3:
             player = new StreamingPlayer();
             break;
         default:
             System.out.println("Invalid choice. Defaulting to MP3 Player.");
             player = new MP3Player();
             break;
     }
 
     player.play(songName);  
     scanner.close();
 }
}
