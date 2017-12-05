package hw3;

import java.util.ArrayList;


public class Borders {
    private ArrayList<Countries> countries; 
    private int z;
    public Borders(ArrayList<Countries> countries){
        this.countries = countries;
    }
    
    public boolean isBordering(String c1, String c2){
        
       boolean bordering = false;

       for(int i = 0; i < countries.size(); i++){
           if(countries.get(i).countryName.equals(c1)){
               for (int j = 0; j < countries.get(i).neighborCount; j++){
                   if(countries.get(i).Neighbors[j].equals(c2)){
                       return true;
                   }
               }
           }
       }
        return bordering;
    }
    
} // class