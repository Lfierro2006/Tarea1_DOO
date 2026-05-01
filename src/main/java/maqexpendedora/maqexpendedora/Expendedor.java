package maqexpendedora;

import deposito.Deposito;
import moneda.Moneda;
import moneda.Moneda100;
import producto.Bebida;
import producto.CocaCola;
import producto.Sprite;
import producto.Fanta;


public class Expendedor{
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Moneda> monVuelto;
    private int precio;
    public static final int COCA =1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    public Expendedor(int numbebidas, int precio){
        this.precio=precio;
        this.coca= new Deposito<Bebida>();
        this.sprite= new Deposito<Bebida>();
        this.fanta= new Deposito<Bebida>();
        this.monVuelto= new Deposito<Moneda>();
        for (int i=0; i<numbebidas;i++){
            coca.addObjeto(new CocaCola(100+i));
            sprite.addObjeto(new Sprite(200+i));
            fanta.addObjeto(new Fanta((300+i)));
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

