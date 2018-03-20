/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival.Reboot;

/**
 *
 * @author panbe
 */
public class CraftingStation {
    private String type;   //gathering, crafting
    private String subType;  // actual types
    private int grade;
    private String name;
    private int posX;
    private int posY;
    private boolean isHide;
    private boolean isBuild;

    public CraftingStation() {
        this.type = type;
        this.subType = subType;
        this.grade = grade;
        this.name = name;
        
        
    }
    
    public void activeCraftingStation(CraftingStation cs, Player player) { //+tool
        //depend of the available Craftingstaion and player skill allow player to create object
        
        //use craftingstation for gathering station too? or allow it to gather resource without material?
        //opt for combined station
        
        //start of the fonction here
        if ("craft".equals(cs.type)) {
            
        }
    }
    
}
