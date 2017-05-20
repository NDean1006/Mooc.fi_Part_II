import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    Scanner reader = new Scanner(System.in);
    Dictionary dict = new Dictionary();

    AirportUI ui = new AirportUI(reader, dict);
    ui.start();
    }
    
}
