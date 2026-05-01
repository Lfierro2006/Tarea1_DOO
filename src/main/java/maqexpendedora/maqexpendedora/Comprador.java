package maqexpendedora;
import maqexpendedora.moneda.Moneda;
import bebida.Bebida;
class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida b= exp.comprarBebida(m, cualBebida);

        if(b != null){
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

