import maqexpendedora.Comprador;
import moneda.Moneda;
import moneda.Moneda1000;
import maqexpendedora.Expendedor;
public class Main {
    public static void main(String[] args) {
        Expendedor maquina = new Expendedor(5, 300);
        Moneda moneda = new Moneda1000();
        Comprador Juan = new Comprador(moneda, 1, maquina);


        System.out.println(Juan.queBebiste());
        System.out.println(Juan.cuantoVuelto());
    }
}
