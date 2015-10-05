import greenfoot.*;

public class Woda extends World
{
       
    public Woda()
    {    
        super(800, 600, 1);
               
    }
    
    private void dodajRybke() {
        Ryba nowa;
        switch(Greenfoot.getRandomNumber(3)) {
           case 0:
           nowa = new Zlota();
           break;
           case 1:
           nowa = new Rekin();
           break;
           default: 
           nowa = new Pretnik();
           }
        addObject (nowa, 10, Greenfoot.getRandomNumber(400)+100);
    }
    
    public void act(){
        if (Greenfoot.mouseClicked(this)) dodajRybke();
        
        if(numberOfObjects() < 3) dodajRybke();
        }
}
