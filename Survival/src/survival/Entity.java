/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survival;


/**
 *
 * @author panbe
 */
public abstract class Entity {
    private int id;
    private String name;
    private String description;
    
    public Entity(int id, String name) {
        this.id=id;
        this.name = name;
    }
    
    public Entity(int id, String name, String description) {
        this.id=id;
        this.name = name;
        this.description = this.description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    
}
