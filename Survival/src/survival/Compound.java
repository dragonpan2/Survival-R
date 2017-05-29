/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;

import java.util.ArrayList;

/**
 *
 * @author panbe
 */
public class Compound {
    private ArrayList<Item> CompInv;
    private ArrayList<CraftingStation> CompStationInv;
    private ArrayList<Infrastructure> ComInfraInv;
    private int CompDefense;
    private int CompHealth;
    private int CompWater;
    private int CompFood;
    private int CompSurvivor;
    public enum PlayerAccess {
        OWNED, NOWNED, ACCESS, BANNED
    }
    private PlayerAccess playerAccess;
    private String CompName;

    public Compound(ArrayList<Item> CompInv, ArrayList<CraftingStation> CompStationInv, ArrayList<Infrastructure> ComInfraInv, int CompDefense, int CompHealth, int CompWater, int CompFood, int CompSurvivor, PlayerAccess playerAccess, String CompName) {
        this.CompInv = CompInv;
        this.CompStationInv = CompStationInv;
        this.ComInfraInv = ComInfraInv;
        this.CompDefense = 0;
        this.CompHealth = 1;
        this.CompWater = 0;
        this.CompFood = 0;
        this.CompSurvivor = 0;
        this.playerAccess = playerAccess;
        this.CompName = "CompName";
    }

    
    

    
    
    
    
}
