package maqexpendedora;

import deposito.Deposito;
import moneda.*;
import producto.*;

public class Expendedor{
    private final Deposito<Producto> coca;
    private final Deposito<Producto> sprite;
    private final Deposito<Producto> fanta;
    private final Deposito<Producto> snicker;
    private final Deposito<Producto> chokita;
    private final Deposito<Producto> super8;
    private final Deposito<Moneda> monVuelto;
    protected enum nomProduct{
        SNICKER(1,500),
        CHOKITA(2,400),
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
        public int getPrecio(){
            return precio;
        }
        public int getTipo(){
            return tipo;
        }
    }
    public Expendedor(int numProductos){
        this.coca= new Deposito<Producto>();
        this.fanta= new Deposito<Producto>();
        this.sprite= new Deposito<Producto>();
        this.snicker= new Deposito<Producto>();
        this.chokita= new Deposito<Producto>();
        this.super8= new Deposito<Producto>();
        this.monVuelto= new Deposito<Moneda>();
        for (int i=0; i<numProductos;i++){
            snicker.addObjeto(new Fanta(100+i));
            chokita.addObjeto(new Fanta(200+i));
            super8.addObjeto(new Fanta(300+i));
            coca.addObjeto(new CocaCola(400+i));
            fanta.addObjeto(new Fanta(500+i));
            sprite.addObjeto(new Sprite(600+i));
        }
    }

    public Producto comprarProducto(Moneda a,nomProduct product){
        //ACÁ VA UNA EXCEPCIÓN!!!!11!111!
        //PagoIncorrectoException
        if(a==null)return null;
        Producto p = null;

        if(a.getValor() >= product.precio){
            switch (product){
                case SNICKER: p=snicker.getObjeto();break;
                case CHOKITA:p=chokita.getObjeto();break;
                case SUPER8:p=super8.getObjeto();break;
                case COCACOLA:p=coca.getObjeto();break;
                case FANTA:p=fanta.getObjeto();break;
                case SPRITE:p=sprite.getObjeto();break;
            }
            if (p !=null){ //calcular vuelto a devolver
                int vuelto = a.getValor() - product.precio;
                int cantMonedas100 = vuelto/100;//cantidad de monedas

                for (int i = 0; i < cantMonedas100; i++) {//se genera la cantidad de monedas y se meten al deposito
                    monVuelto.addObjeto(new Moneda100()); // se crea para el vuelto
                }
                return p;
            }
            //ACÁ VA UN EXCEPTION
            // NoHayProductoException
            else { //en caso de tipo de bebida pedido inexistente o fuera de stock se devuelve la moneda
                monVuelto.addObjeto(a);
                return null;
            }
        }
        //ACÁ VA UN EXCEPTION!!!
        //PagoInsuficienteException
        else{ // en caso de que no alcanza la plata tambien se devuelve la moneda
            monVuelto.addObjeto(a);
            return null;
        }
    }
    public Moneda getVuelto(){
        return monVuelto.getObjeto();
    }
}