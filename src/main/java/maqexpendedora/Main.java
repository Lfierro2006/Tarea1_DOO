import maqexpendedora.Comprador;
import moneda.Moneda;
import moneda.Moneda1000;
import maqexpendedora.Expendedor;
public class Main {
    public static void main(String[] args) {
        Expendedor maquina = new Expendedor(99);
        Moneda moneda = new Moneda1000();
        Comprador Juan = new Comprador(moneda, Expendedor.nomProduct.CHOKITA, maquina);


        System.out.println(Juan.queConsumiste());
        System.out.println(Juan.cuantoVuelto());
    }
}
