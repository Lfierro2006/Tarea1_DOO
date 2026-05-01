package deposito;

public class Deposito<T>{ // clase generica
    private ArrayList<T> lista; //se define para que solo maneje del tipo T
    public Deposito(){

        this.lista= new ArrayList<T>();
    } //cuando se hace el arraylist le pasamos el tipo T
    public void addObjeto(T objeto){ //añade el objeto y se comprueba primero que sea del mismo tipo T
        lista.add(objeto);
        }

    public T getObjeto() { // extrae el objeto si hay disponible o regresa null si no
        if (lista.isEmpty()) {
            return null;
        }else{
            return  lista.remove(0);
        }
    }
}







/* Deposito de monedas para unirlo al deposito normal
class DepositoM {
    private ArrayList<Moneda> mlist;

    public DepositoM() {
        this.mlist = new ArrayList<Moneda>();
    }

    public void addMoneda(Moneda m) {
        mlist.add(m);
    }

    public Moneda getMoneda() {
            if (mlist.size() == 0) {
                return null;
            }
            else{
            return mlist.remove(0);
            }
    }
}
 */