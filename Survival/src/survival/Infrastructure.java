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
public class Infrastructure {
    
    private String type;
    private int grade;
    private String name;

    public Infrastructure(String type, int grade, String name) {
        this.type = type;
        this.grade = grade;
        this.name = name;
    }
    
    public void produce(ArrayList compInv) {
        
        
        
    }

    public String getType() {
        return type;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
