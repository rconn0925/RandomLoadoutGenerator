/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomloadoutgenerator;

/**
 *
 * @author Ross
 */




public class RandomLoadoutGenerator {
    Perk firstPerk;
    Perk secondPerk;
    Perk thirdPerk;

    /**
     * @param args the command line arguments
     */
    public RandomLoadoutGenerator(){
        firstPerk = Perk.getRandom();
    
        
        secondPerk = Perk.getRandom();
        
        while(secondPerk.equals(firstPerk)){
            secondPerk = Perk.getRandom();
        }
        
        thirdPerk = Perk.getRandom();
         while(thirdPerk.equals(firstPerk) || thirdPerk.equals(secondPerk)){
            thirdPerk = Perk.getRandom();
        }
        
        System.out.println("Perks: " + firstPerk + ", " + secondPerk + ", " + thirdPerk);
        System.out.println("Airdrop: " + Airdrop.getRandom());
        
    }
    
    
    public static void main(String[] args) {
        RandomLoadoutGenerator RLG = new RandomLoadoutGenerator();
     
      
    }
    
}
