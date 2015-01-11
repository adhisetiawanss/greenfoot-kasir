import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu5 extends Actor
{

    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("kikil2.png");          
            getWorld().getBackground().drawImage(HargaM,21,106);
            
              GreenfootImage Hargams = new GreenfootImage("kikil3.png");          
            getWorld().getBackground().drawImage(Hargams ,700,390);
            
        }
    }
}
