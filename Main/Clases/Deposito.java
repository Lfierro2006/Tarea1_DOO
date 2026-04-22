package Clases;
import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> al;
    private ArrayList<Moneda> mon;
    
    public Deposito(){
        al= new ArrayList();
        mon=new ArrayList();
    }
    
    public void addBebida(Bebida b){
        al.add(b);
    }
    
    public Bebida getBebida(){
        if(al.size()==0){
            return null;
        }else{
            return al.remove(0);
        }
    }
    
    public void addMoneda(Moneda m){
        mon.add(m);
    }
    
    public Moneda getMoneda(){
        if(mon.size()==0){
            return null;
        }else{
            return mon.remove(0);
        }
    }
  
}
