
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Unicron
 */
public class AirportUI {

    private Dictionary dict;
    private Scanner read;

    public AirportUI(Scanner reader, Dictionary dictionary) {
        this.dict = dictionary;
        this.read = reader;
    }

    public void start() {
        statement();
        while (true) {

            System.out.print("Statement: ");
            String input = read.nextLine().trim();
            
            if (input.equalsIgnoreCase("add")){
                add();
            }
            
            if (input.equalsIgnoreCase("translate")){
                translate();
            }
            

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement\n");

            }
        }
    }

    public void statement() {
        
        System.out.println("Statement:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks for a word and prints its translation");
        System.out.println("quit - quit the text user interface\n");
    }
    
    public void add(){
        System.out.print("In Finnish: ");
            String input1 = read.nextLine().trim();
        
        System.out.print("Translation: ");
            String input2 = read.nextLine().trim();
            
        this.dict.add(input1, input2);

    }
    
    public void translate(){
        System.out.print("Give a word: ");
            String input = read.nextLine().trim();
        System.out.println("Translation: " + this.dict.translate(input));
            
    }
}
