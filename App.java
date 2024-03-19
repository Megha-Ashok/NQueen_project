import java.util.Scanner;

import board.Board;
import game.Game;
import player.Player;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the player name");
        String name = obj.nextLine();
        System.out.println("enter the age of the player");
        int age = obj.nextInt();
        Player p = new Player(name, age);
        System.out.println("Player name is:" + p.getplayername());
        Board b = new Board(7);

        Game g = new Game(b);
        g.play();
    }
}
