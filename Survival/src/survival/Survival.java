
package survival;

import survival.Reboot.Infrastructure;
import survival.Reboot.CraftingStation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author panbe
 */
public class Survival {

    public static Scanner SCAN = new Scanner(System.in);
    public static  Item[] gameItem = Init.gameInit();
    public static void main(String[] args) throws IOException {
        
        
        
        boolean endGame = false;
        int selection1; 
        int selectedItem = 0;
        int dayActual = 1;
        
        ArrayList<Item> inventory = new ArrayList();
        ArrayList<Item> compInv = new ArrayList();
        ArrayList<CraftingStation> compCTInv = new ArrayList();
        ArrayList<Infrastructure> infrastructureInv = new ArrayList();
        
        MapTile[][] map = new MapTile[2][2];
        
        MapTile tile00 = new MapTile(null,null,null,0,0,null,null,null);
        MapTile tile01 = new MapTile(null,null,null,0,0,null,null,null);
        MapTile tile10 = new MapTile(null,null,null,0,0,null,null,null);
        MapTile tile11 = new MapTile(null,null,null,0,0,null,null,null);
        map[0][0] = tile00;
        map[0][1] = tile01;
        map[1][0] = tile10;
        map[1][1] = tile11;
  //String tileName,- String tilePoint, String tileDesc, int dangerLvl, int riskLvl, ArrayList<PointOfIntrest> POI, ArrayList<Item> GroundItem, Compound compound)
        
        
        map[0][0].setTileName("Home");
        map[0][0].setTilePoint("HOME");
        map[0][0].setTileDesc(" Home sweet home");
        
        map[0][1].setTileName("Residence");
        map[0][1].setTilePoint("RESIDENCE");
        map[0][1].setTileDesc(" Some residencial houses");
        
        map[1][1].setTileName("Yuan's Houses");
        map[1][1].setTilePoint("YUANS_HOUSES");
        map[1][1].setTileDesc(" Yuan's Houses, maybee there's metal inside");
        
        map[1][0].setTilePoint("COFFEE_SHOP");
        map[1][0].setTileName("Coffee Shop");
        map[1][0].setTileDesc("Internet and Beans...");
//        map[1][0].setTilePoint("COFFEE_SHOP");
        
       // Player player = new Player(0,"amba", 100, 100, 100, 100, 100, 100, 100, 100, inventory);
        Player player = new Player(100,100,100,100,100,100,0,0,0,"amba",100,100,inventory);
      
       
        
        Compound playerCompound = new Compound(compInv,compCTInv,infrastructureInv,0,1,0,0,0,Compound.PlayerAccess.OWNED,"The Compound");
        
        player.getInventory().add(gameItem[1]);
        player.getInventory().add(gameItem[1]);
        
        //end of initialisation
        //-------------------------------------
        
        MainMenu MM = new MainMenu();
        //Window window = new Window();
        
        //start of game loop
        
        do {
            
            boolean secLoop = true;
            
            do { //secondaire loop

        SecMain.playerStat(player);
        
        SecMain.tileInfo(map, player);

        //week menu -> put into method later
        System.out.println("*************");
        System.out.println("Day " +dayActual);
        System.out.println("0- End game ");
        System.out.println("1- Inventory");
        System.out.println("2- Scavenge current area");
        System.out.println("3- Move");
        System.out.println("4- Sleep");
        System.out.println("5- Crafting");
        //week menu end
        switch (getInt0(5)) {
            case 0: endGame = endGameNow();
            if (endGame == true) {secLoop= false;}
                break;
            case 1:
               secLoop= SecMain.inventoryManagement(player);
               secLoop= true;
                break;
            case 2:
                SecMain.getCurrentTile(map, player).scavengeTile(inventory, gameItem);
                secLoop= false;
                break;
            case 3:
                secLoop = SecMain.moving(map,player);
                break;
            case 4:
                SecMain.sleeping(player);
                secLoop = false;
                break;
            case 5:
                
                break;
               
            default:
                
        }
        
            } while(secLoop == true);
        
        //playerStat(player); //print player stats again

       // SecMain.ptc();
        player.setHunger(player.getHealth()-10);
        player.setThrist(player.getThrist()-25);
        player.setEnergy(player.getEnergy()-15);
        dayActual++;
        //end of a week?
        
        SecMain.cls();

        }   while(!endGame);
        //end of game loop
        System.out.println("Game Over");
        
        //end of main
    }
    
    public static int getInt(int max) {
        String chaine; //Chaine qui reçoit la réponse
        int choix = 0; //Int qui correspond au choix de l'utilisateur
        boolean erreur; //Boolean qui permet la redemande du choix de l'utilisateur
        do {//Ce do while continue tant que l'utilisateur écrire pas ce qui est demandé
            erreur = false;
            chaine = SCAN.nextLine();
            try {
                choix = Integer.parseInt(chaine);

            } catch (NumberFormatException e) {//Si autre chose que des nombres est présent dans chaîne
                System.out.println("Vous avez écrit des caratères non-numériques.");
                erreur = true;
            }

            if ((choix < 1 || choix > max) && erreur == false) {
                //Si le choix est plus grand que le max ou plus petit que 1
                System.out.println("Vous avez écrit une valeur qui n'est pas permise (entre " + 1 + " et " + max + ")");
                erreur = true;
            }

            if (erreur) {
                //Si une faute est commise
                System.out.println("Veuillez retaper votre réponse.");
            }

        } while (erreur);
        
        return choix;

    }
    
    public static int getInt0(int max) {
        String chaine; //Chaine qui reçoit la réponse
        int choix = 0; //Int qui correspond au choix de l'utilisateur
        boolean erreur; //Boolean qui permet la redemande du choix de l'utilisateur
        do {//Ce do while continue tant que l'utilisateur écrire pas ce qui est demandé
            erreur = false;
            chaine = SCAN.nextLine();
            try {
                choix = Integer.parseInt(chaine);

            } catch (NumberFormatException e) {//Si autre chose que des nombres est présent dans chaîne
                System.out.println("Vous avez écrit des caratères non-numériques.");
                erreur = true;
            }

            if ((choix < 0 || choix > max) && erreur == false) {
                //Si le choix est plus grand que le max ou plus petit que 1
                System.out.println("Vous avez écrit une valeur qui n'est pas permise (entre " + 1 + " et " + max + ")");
                erreur = true;
            }

            if (erreur) {
                //Si une faute est commise
                System.out.println("Veuillez retaper votre réponse.");
            }

        } while (erreur);
        
        return choix;

    }
    
    public static void checkInventory(ArrayList<Item> Inventory) {
        for (int i = 0; i < Inventory.size(); i++) {
          //  System.out.println(i+" "+ Inventory.get(i));
//            Inventory.get(i).printStat;
            System.out.println("--------------------------");
            System.out.println("Slot" +(i+1));
            printItemB(Inventory.get(i));
            
        }
        System.out.println("-----------");
    }
    
    public static void printItemB(Item item) {
        
        System.out.println(item.getName());
        System.out.println(item.getDescription());
        if (item instanceof Consumable) {
        printItem((Consumable)item);
        }
        if (item instanceof Weapon) {
        printItem((Weapon)item);
        }
        if (item instanceof Tool) {
        printItem((Tool)item);
        }
    }
    
    public static void printItem(Consumable consumable) {
        if (consumable.getAddHunger() != 0) {
            System.out.println(consumable.getAddHunger() +" Hunger");
        }
        if (consumable.getAddEnergy()!= 0) {
            System.out.println(consumable.getAddEnergy()+" Energy");
        }
        if (consumable.getAddHealth()!= 0) {
            System.out.println(consumable.getAddHealth()+" Health");
        }
        if (consumable.getAddThirst()!= 0) {
            System.out.println(consumable.getAddThirst()+" Thirst");
        }
        
        
    }
    
    public static void printItem(Weapon weapon) {
        //System.out.println(weapon.getName()+"Hunger");
    }
    
    public static void printItem(Tool tool) {
      //  System.out.println(tool.get +"Hunger");
    }
    
    public static void playerStat(Player player) {
        System.out.println("-------------------------");
        System.out.println(player.getName()+"'s stats");
        System.out.println(player.getHunger()+"/"+player.getMaxHunger()+" Hunger");
        System.out.println(player.getHealth()+"/"+player.getMaxHealth()+" Health");
        System.out.println(player.getThrist()+"/"+player.getMaxThrist()+" Thrist");
        System.out.println(player.getEnergy()+"/"+player.getMaxEnergy()+" Energy");
        System.out.println("--------------------------");
        
    }
    
    public static boolean endGameNow() {
        System.out.println("1- To continue");
        System.out.println("2- to EndGame");
        switch(getInt(2)) {
            case 1:
                return false;
                
            case 2:
                return true;
            default:
        }
        return false;
    }
    
    
    
}
