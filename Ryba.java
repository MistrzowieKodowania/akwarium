import greenfoot.*;

public class Ryba extends Actor
{
    boolean zlapana = false; 
    Woda ocean;
    int szybkosc;
    
    public Ryba(){
      ocean = new Woda();
        
    }
        
    public void act() {
      if (zlapana){
            wyciagajRybe();
        } else {
            move(szybkosc); 
            odbicia();
        }
        lapRyby();        
    }
    
    private void odbicia(){
       if(isAtEdge()) {
           if (getY()==0 || getY()==599) setRotation(-getRotation());
           else { 
               setRotation(180-getRotation()); 
               getImage().mirrorVertically(); }
       }  
    }
        
    private void wyciagajRybe(){
           setLocation(getX(), getY()-5);
           if (isAtEdge()) {
               zlapana = false;
               getWorld().removeObject(this);
            }
    }
    
    private void lapRyby(){
        if (Greenfoot.mousePressed(this)){
            zlapana = true;
            getWorld().addObject(new Haczyk(), this.getX(), this.getY());
          } 
        }
            
}
