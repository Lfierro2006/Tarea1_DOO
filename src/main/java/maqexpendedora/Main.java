import maqexpendedora.*;
import moneda.*;
public class Main {
    public static void main(String[] args) {
        Expendedor maquina = new Expendedor(99);
        Comprador Juan = new Comprador(new Moneda1000(), Expendedor.nomProduct.SNICKER, maquina);
        Comprador J = new Comprador(new Moneda500(), Expendedor.nomProduct.CHOKITA, maquina);
        Comprador Jjj = new Comprador(new Moneda100(), Expendedor.nomProduct.SUPER8, maquina);
        Comprador Jjjj = new Comprador(new Moneda1500(), Expendedor.nomProduct.COCACOLA, maquina);
        Comprador Jjjjj = new Comprador(new Moneda500(), Expendedor.nomProduct.FANTA, maquina);
        Comprador Jjjjjj = new Comprador(new Moneda1000(), Expendedor.nomProduct.SPRITE, maquina);
        System.out.println(Juan.queConsumiste());
        System.out.println(Juan.cuantoVuelto());
        System.out.println();
        System.out.println(J.queConsumiste());
        System.out.println(J.cuantoVuelto());
        System.out.println();
        System.out.println(Jjj.queConsumiste());
        System.out.println(Jjj.cuantoVuelto());
        System.out.println();
        System.out.println(Jjjj.queConsumiste());
        System.out.println(Jjjj.cuantoVuelto());
        System.out.println();
        System.out.println(Jjjjj.queConsumiste());
        System.out.println(Jjjjj.cuantoVuelto());
        System.out.println();
        System.out.println(Jjjjjj.queConsumiste());
        System.out.println(Jjjjjj.cuantoVuelto());
    }
}
