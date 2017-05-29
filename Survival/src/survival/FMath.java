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
public class FMath {
    public static int Fzero(int x) {
    if (x<0){
    x=0;
    }
    return x;
}
    
    public static int max(int x, int max) {
        if (x>=max){
            x=max;
        }
        return x;
    }
    
     
    
}
