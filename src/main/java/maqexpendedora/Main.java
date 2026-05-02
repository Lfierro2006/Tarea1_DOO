import maqexpendedora.*;
import moneda.*;
public class Main {
    public static void main(String[] args) {
        // Crear expendedora con stock inicial de 2 productos por tipo
        Expendedor exp = new Expendedor(2);

        System.out.println("---------- CASOS NORMALES ----------");

        // Compra exitosa de CocaCola con Moneda1500
        Comprador c1 = new Comprador(new Moneda1500(), Expendedor.nomProduct.COCACOLA, exp);
        System.out.println("Compró: " + c1.queConsumiste() + " | Valor: "+ Expendedor.nomProduct.COCACOLA.getPrecio()+ " | Moneda:1500 | Vuelto: " + c1.cuantoVuelto());

        // Compra exitosa de Snicker con Moneda1000
        Comprador c2 = new Comprador(new Moneda1000(), Expendedor.nomProduct.SNICKER, exp);
        System.out.println("Compró: " + c2.queConsumiste() +" | Valor: "+Expendedor.nomProduct.SNICKER.getPrecio()+ " | Moneda:1000 | Vuelto: " + c2.cuantoVuelto());

        // Compra exitosa de Fanta con Moneda1000 (precio exacto)
        Comprador c3 = new Comprador(new Moneda1000(), Expendedor.nomProduct.FANTA, exp);
        System.out.println("Compró: " + c3.queConsumiste() +" | Valor: "+Expendedor.nomProduct.FANTA.getPrecio()+" | Moneda:1000 | Vuelto: " + c3.cuantoVuelto());

        // Compra exitosa de Sprite con Moneda1500
        Comprador c10 = new Comprador(new Moneda1500(), Expendedor.nomProduct.SPRITE, exp);
        System.out.println("Compró: " + c10.queConsumiste() +" | Valor: "+Expendedor.nomProduct.SPRITE.getPrecio()+" | Moneda:1500 | Vuelto: " + c10.cuantoVuelto());

        System.out.println("\n---------- PRUEBAS DE EXCEPCIONES ----------");

        // 1. Pago incorrecto (moneda nula)
        System.out.println("\n--- Caso 1: Moneda nula ---");
        Comprador c4 = new Comprador(null, Expendedor.nomProduct.SPRITE, exp);
        System.out.println("Queria comprar:"+ Expendedor.nomProduct.SPRITE+" | Valor:"+Expendedor.nomProduct.SPRITE.getPrecio()+"| Moneda:null | vuelto: " + c4.cuantoVuelto()+" | Resultado: " + c4.queConsumiste());

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