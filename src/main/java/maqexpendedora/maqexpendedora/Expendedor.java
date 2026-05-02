package maqexpendedora;

import deposito.Deposito;
import moneda.*;
import producto.*;

public class Expendedor{
    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snicker;
    private Deposito<Producto> chokita;
    private Deposito<Producto> super8;
    private Deposito<Moneda> monVuelto;
    enum nomProduct{
        SNICKER(1,500),
        CHOKITA(2,450),
        SUPER8(3,500),
        COCACOLA(4,1300),
        FANTA(5,1000),
        SPRITE(6,1000);
        private final int precio;
        private final int tipo;
        nomProduct(int tipo,int precio) {
        this.precio=precio;
        this.tipo=tipo;
        }
        private int getPrecio(){
            return precio;
        }
        private int getTipo(){
            return tipo;
        }
    }
    public Expendedor(int numbebidas){
        this.coca= new Deposito<Producto>();
        this.fanta= new Deposito<Producto>();
        this.sprite= new Deposito<Producto>();
        this.snicker= new Deposito<Producto>();
        this.chokita= new Deposito<Producto>();
        this.super8= new Deposito<Producto>();
        this.monVuelto= new Deposito<Moneda>();
        for (int i=0; i<numbebidas;i++){
            snicker.addObjeto(new Fanta(100+i));
            chokita.addObjeto(new Fanta(200+i));
            super8.addObjeto(new Fanta(300+i));
            coca.addObjeto(new CocaCola(400+i));
            fanta.addObjeto(new Fanta(500+i));
            sprite.addObjeto(new Sprite(600+i));
        }
    }

    public Bebida comprarBebida(Moneda a, int tipo){
        if(a==null)return null;
        Bebida b = null;

        if(a.getValor() >= this.precio){
            if (tipo==COCA){
                b= coca.getObjeto();
            } else if (tipo==SPRITE) {
                b= sprite.getObjeto();
            } else if (tipo==FANTA) {
                b=fanta.getObjeto();
            }

            if (b !=null){ //calcular vuelto a devolver
                int vuelto = a.getValor() - precio;
                int cantMonedas100 = vuelto/100;//cantidad de monedas

                for (int i = 0; i < cantMonedas100; i++) {//se genera la cantidad de monedas y se meten al deposito
                    monVuelto.addObjeto(new Moneda100()); // se crea para el vuelto
                }
                return b;
            }
            else { //en caso de tipo de bebida pedido inexistente o fuera de stock se devuelve la moneda
                monVuelto.addObjeto(a);
                return null;
            }
        }
        else{ // en caso de que no alcanza la plata tambien se devuelve la moneda
            monVuelto.addObjeto(a);
            return null;
        }
    }
    public Moneda getVuelto(){
        return monVuelto.getObjeto();
    }
}

