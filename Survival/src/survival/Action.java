/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

/**
 *
 * @author Bowen
 */
public class Action {
    
    
    public static void consume(Player player, Consumable consumable){
        if (player.getInventory().contains(consumable)){
        player.setHealth(player.getHealth()+consumable.getAddHealth());
        player.setEnergy(player.getEnergy()+consumable.getAddEnergy());
        player.setHunger(player.getHunger()+consumable.getAddHunger());
        player.setThrist(player.getThrist()+consumable.getAddThirst());
        player.getInventory().remove(consumable);
        }
        
    }
    
    public static boolean canCraft(Player player, Item item){
        if (item.isCraftable()){
                player.getInventory().containsAll(item.getResources());
          }
        return false;
    }
    
    public static boolean combat(Player player, Mob ennemy){
    player.setHealth(player.getHealth()-getDamage(player,ennemy));
    ennemy.setHealth(ennemy.getHealth()-getDamage(ennemy,player));
    if (player.getHealth()<=0 || ennemy.getHealth()<=0){
        return true;
    }
    else{return false;
    }
    
    }
    
    public static boolean win(Player player, Mob ennemy){
        if (player.getHealth()>0 && ennemy.getHealth()<=0){
            return true;
        }
        else{return false;
        }
    }
    
    private static int getDamage(Mob attacker, Mob defender){
        int damage;
        int defense;
        damage = attacker.getAttack();
        defense = defender.getDefense();
        return FMath.Fzero(damage-defense);
    }
    
    public static void updateCombat(Mob mob){
        mob.setAttack(mob.getStrength());
        mob.setDefense(mob.getEndurance());
    }
    
    public static void buy(Player player, Mob merchant, Item item, int payment){
        if (canBuy(player, merchant, item, payment)){
            player.getInventory().add(item);
            merchant.getInventory().remove(item);
            player.setGold(player.getGold()-payment);
            System.out.println("You have bought "+item.getName()+" for "+payment+" gold.");
        }
        else System.out.println("Sorry, but you cannot buy that item.");
    }
            
    private static boolean canBuy(Player player, Mob merchant,Item item, int payment){
        boolean isBuy;
        if (payment<item.getValue() || player.getGold()<payment || merchant.getInventory().contains(item)==false){isBuy=false;}
        else{isBuy=true;};
        return isBuy;
    }
    
    public static void sell(Player player, Mob merchant, Item item){
        if (canSell(player, merchant, item)){
            player.getInventory().remove(item);
            player.setGold(player.getGold()+item.getValue());
            System.out.println("You have sold "+item.getName()+" for "+item.getValue()+" gold.");
        }
        else System.out.println("Sorry, but you cannot sell that item.");
    }
    
    private static boolean canSell(Player player, Mob merchant,Item item){
        boolean isSell;
        if (merchant.getGold()<item.getValue() || player.getInventory().contains(item)==false){isSell=false;}
        else{isSell=true;};
        return isSell;
    }
    
    
    
}
