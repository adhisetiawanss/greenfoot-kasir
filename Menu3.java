import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu3 extends Actor
{
    public static int harga;
    
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("cumi_kare2.png");          
            getWorld().getBackground().drawImage(HargaM,21,106);
            
            
        }
    }       
}
