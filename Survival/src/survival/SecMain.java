package survival;

import java.util.ArrayList;
import java.util.Random;
import static survival.Survival.SCAN;

/**
 *
 * @author panbe
 */
public class SecMain {

    public static void playerStat(Player player) {
        System.out.println("-------------------------");
        System.out.println(player.getName() + "'s stats");
        System.out.println(player.getHunger() + "/" + player.getMaxHunger() + " Hunger");
        System.out.println(player.getHealth() + "/" + player.getMaxHealth() + " Health");
        System.out.println(player.getThrist() + "/" + player.getMaxThrist() + " Thrist");
        System.out.println(player.getEnergy() + "/" + player.getMaxEnergy() + " Energy");
        if (player.getHealth() >=80 && player.getHunger() >= 80 && player.getEnergy() >= 80 && player.getThrist()>=80) {
            System.out.println("");
            System.out.println("You feel pretty good");
        }
        System.out.println("--------------------------");

    }
    
    public static boolean inventoryManagement(Player player) {
        int selectedItem;
                SecMain.cls(); //clear screen
                Survival.checkInventory(player.getInventory()); //check inventory
                
                selectedItem = Survival.getInt0(player.getInventory().size())-1;
                if (selectedItem == -1) {return true;}
                if (selectedItem != -1) {
                
                Survival.printItemB(player.getInventory().get(selectedItem));
                
                //action
                //
                System.out.println("-----------------------------------");
                if (player.getInventory().get(selectedItem) instanceof Consumable) {
                    System.out.println("-0 do nothing");
                    System.out.println("-1 consume");
                    switch (Survival.getInt0(1)) {
                        case 0:
                            break;
                        case 1:
                            
                            Action.consume(player, (Consumable) player.getInventory().get(selectedItem));
                            
                            break;
                        }
                    }    
                }
                return false;
    }
    
    public static void tileInfo(MapTile[][] map, Player player) {
        System.out.println(map[player.getPosx()][player.getPosy()].getTileName());
        System.out.println(map[player.getPosx()][player.getPosy()].getTileDesc());
        System.out.println("Position "+player.getPosx()+","+player.getPosy());
    }
    
    public static MapTile getCurrentTile(MapTile[][] map, Player player) {
        return map[player.getPosx()][player.getPosy()];
        
    }
    
    public static boolean moving(MapTile[][] map, Player player) {
        boolean pass = true;
        do {
            pass = true;
        System.out.println("Where to?");
        System.out.println("0- Return");
        System.out.println("1- North");
        System.out.println("2- South");
        System.out.println("3- West");
        System.out.println("4- East");
        switch (Survival.getInt0(4)) {
            case 0:
                pass = true;
                return true;
                
            case 1:
                if (canMove(map, player,0,-1)) {
                    player.setPosy(player.getPosy()-1);
                    System.out.println("You moved to north");
                    
                }
                else {System.out.println("Can't move that way");
                pass = false;
                ptc();
                }
                break;
            case 2:
                if (canMove(map, player,0,1)) {
                    player.setPosy(player.getPosy()+1);
                    System.out.println("You moved to south");
                }
                else {System.out.println("Can't move that way");
                pass = false;
                ptc();
                }
                break;
            case 3:
                if (canMove(map, player,-1,0)) {
                    player.setPosx(player.getPosx()-1);
                    System.out.println("You moved to west");
                }
                else {System.out.println("Can't move that way");
                pass = false;
                ptc();
                }
                break;
            case 4:
                if (canMove(map, player,1,0)) {
                    player.setPosx(player.getPosx()+1);
                    System.out.println("You moved to east");
                }
                else{ System.out.println("Can't move that way");
                pass = false;
                ptc();
                }
                break;
            default:
        } 
              System.out.println(pass); 
        } while (pass == false);
        return false;
    }
    
    public static boolean canMove(MapTile[][] map, Player player, int x,int y) {
        if (player.getPosx()+x<map[0].length && player.getPosx()+x>=0 &&player.getPosy()+y<map.length && player.getPosy()+y>=0) {
            return true;
            
        }
        else return false;
    }

    public static int getRandom100() {
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        return randomInt;
    }
    
    public static void ptc() {
        System.out.println("  'Press to Continu'");
       SCAN.nextLine();
        //SCAN.next();
    }
    
    public static void cls() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public static void sleeping(Player player) {
        player.setEnergy(player.getMaxEnergy());
        System.out.println("You rest");
    }
    
    public static void craftingExe(Player player) {
        System.out.println("***Crafting Menu***");
        System.out.println("");
        
        System.out.println("0- Back");
        System.out.println("1- Handmade Bandage");
        
        switch (Survival.getInt0(100)) {
            case 0:
                break;
            case 1:
                
                break;
        }
    }
    
    public static int containItem(ArrayList<Item> inventory, int id) {
        int numbersOf= 0;
        for (int i = 0; i < inventory.size(); i++) {
            if ( inventory.get(i).getId() == id) 
                numbersOf++;
        }
        return numbersOf;
    }
}
