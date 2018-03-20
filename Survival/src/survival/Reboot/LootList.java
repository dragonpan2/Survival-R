/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival.Reboot;

import java.util.Random;
import survival.Item;

/**
 *
 * @author panbe
 */


///IS DONE YEAH
public class LootList {
   private  int[] itemIDArray;
   private  int[] quantityArray;
   private  int[]  chanceArray;
   private int[] chanceSumArray;

    public LootList() {
    }

    public LootList(int[] itemIDArray, int[] quantityArray, int[] chanceArray) {
        this.itemIDArray = itemIDArray;
        this.quantityArray = quantityArray;
        this.chanceArray = chanceArray;

    }
    
   
   public void generateChanceSum() {
       for (int i = 0; i < chanceArray.length; i++) {
           chanceSumArray[i] = chanceArray[i];
           if (i != 0) {
               chanceSumArray[i]+=chanceSumArray[i-1];
           }
       }
   }
   
   public int[] getLoot() {
       Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        
        for (int i = 0; i < chanceSumArray.length; i++) {
            
           if (randomInt <= chanceSumArray[i]) {
                int[] loot = {itemIDArray[i],quantityArray[i]};
               return loot;
           }
       }
         int[] loot2 = {0,0};
         return loot2;
   }
   
}
