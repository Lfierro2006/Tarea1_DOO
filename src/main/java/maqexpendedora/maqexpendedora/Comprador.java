package maqexpendedora;

import moneda.*;
import producto.*;

import static maqexpendedora.Comprador.CualProducto.FANTA;
import static maqexpendedora.Comprador.TipoProducto.*;

public class Comprador{
    private String sonido;
    private int vuelto;
    enum TipoProducto{ BEBIDA, DULCE}
    enum CualProducto{ SNICKER, SUPER8, TERCERDULCE, COCACOLA, FANTA, SPRITE}
    public Comprador(Moneda m, TipoProducto tipoProducto,CualProducto cualProducto ,Expendedor exp){
        switch (tipoProducto){

        }
        if(p != null){
            this.sonido=b.beber();
        } else {
            this.sonido=null;
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
    public String queBebiste(){
        return  this.sonido;
    }
}

