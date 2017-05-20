import java.util.HashMap;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Unicron
 */
public class Dictionary {
    
    private HashMap<String, String> Dictionary;
    
    
    public Dictionary(){
        this.Dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if (this.Dictionary.containsKey(word)){
            return this.Dictionary.get(word);     
        }else {
            return null;
        }
    }
    
    public void add(String word, String translation){
        this.Dictionary.put(word, translation );
        
    }
    
    public int amountOfWords(){
        return this.Dictionary.size();
    }
    
    public ArrayList<String> translationList(){
       ArrayList<String> translationList = new ArrayList<String>();

        for (String key : this.Dictionary.keySet()) {
            String value = this.Dictionary.get(key);

            String toAddToTranslationList = key + " = " + value;
            translationList.add(toAddToTranslationList);
        }
        return translationList;
    }
}
