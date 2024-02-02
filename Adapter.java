/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter1;

/**
 *
 * @author hp
 */
public class Adapter implements TargetShape{
    
    
    
    Rectangel recteangel;

    public Adapter(Rectangel recteangel) {
        this.recteangel = recteangel;
    }
    

    @Override
    public void display(int x, int y, int x1, int y1) {
        int xmin=Math.min(x, x1);
        int ymin=Math.min(y, y1);
        int width=Math.abs(x1-x);
        int height=Math.abs(y1-y);
        recteangel.draw(xmin, ymin, width, height);
    }
    
}
