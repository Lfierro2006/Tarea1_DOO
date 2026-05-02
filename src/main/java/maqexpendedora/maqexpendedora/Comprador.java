package maqexpendedora;

import moneda.*;
import producto.*;
public class Comprador{
    private final String sabor;
    private int vuelto;
    public Comprador(Moneda m, Expendedor.nomProduct product, Expendedor exp){
        Producto p= exp.comprarProducto(m,product);
        if(p != null){
            this.sabor=p.consumir();
        } else {
            this.sabor=null;
        }
        this.vuelto=0;
        Moneda monedavuelto = exp.getVuelto();
        while(monedavuelto != null){
            this.vuelto=this.vuelto+ monedavuelto.getValor();
            monedavuelto= exp.getVuelto();
        }
    }
    public int cuantoVuelto(){
        return this.vuelto;
    }
    public String queConsumiste(){
        return  this.sabor;
    }
}

