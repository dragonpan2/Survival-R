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
public class MapTile {
    private String tileName;
    private String tilePoint;
    private String tileDesc;
    private int dangerLvl;
    private int riskLvl;
    private ArrayList<PointOfIntrest> POI;
    private ArrayList<Item> GroundItem;
    private Compound compound;

//    public MapTile(String tileName, String tilePoint, String tileDesc, int dangerLvl, int riskLvl) {
//        this.tileName = tileName;
//        this.tilePoint = tilePoint;
//        this.tileDesc = tileDesc;
//        this.dangerLvl = dangerLvl;
//        this.riskLvl = riskLvl;
//    }

    

    public MapTile(String tileName, String tilePoint, String tileDesc, int dangerLvl, int riskLvl, ArrayList<PointOfIntrest> POI, ArrayList<Item> GroundItem, Compound compound) {
        this.tileName = tileName;
        this.tilePoint = tilePoint;
        this.tileDesc = tileDesc;
        this.dangerLvl = dangerLvl;
        this.riskLvl = riskLvl;
        this.POI = POI;
        this.GroundItem = GroundItem;
        this.compound = compound;
    }

    public String getTileDesc() {
        return tileDesc;
    }

    public void setTileDesc(String tileDesc) {
        this.tileDesc = tileDesc;
    }
    
    

    public void setTilePoint(String tilePoint) {
        this.tilePoint = tilePoint;
    }

    public String getTilePoint() {
        return tilePoint;
    }

    public String getTileName() {
        return tileName;
    }

    public int getDangerLvl() {
        return dangerLvl;
    }

    public int getRiskLvl() {
        return riskLvl;
    }

    public ArrayList<PointOfIntrest> getPOI() {
        return POI;
    }

    public ArrayList<Item> getGroundItem() {
        return GroundItem;
    }

    public Compound getCompound() {
        return compound;
    }

    public void setTileName(String tileName) {
        this.tileName = tileName;
    }

    public void setDangerLvl(int dangerLvl) {
        this.dangerLvl = dangerLvl;
    }

    public void setRiskLvl(int riskLvl) {
        this.riskLvl = riskLvl;
    }

    public void setPOI(ArrayList<PointOfIntrest> POI) {
        this.POI = POI;
    }

    public void setGroundItem(ArrayList<Item> GroundItem) {
        this.GroundItem = GroundItem;
    }

    public void setCompound(Compound compound) {
        this.compound = compound;
    }
    
    public void scavengeTile(ArrayList<Item> inventory, Item[] gameItem) {
        
        if(this.tilePoint=="COFFEE_SHOP") {
            inventory.add(gameItem[5]);
            inventory.add(gameItem[6]);
            if (SecMain.getRandom100() > 60) {
                inventory.add(gameItem[5]);
            }
        }
    }
    
    
    
    
}
