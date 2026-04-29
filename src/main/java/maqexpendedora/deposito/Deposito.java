class Deposito{
    private ArrayList<Bebida> lista;
    public Deposito(){
        this.lista= new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b){
        lista.add(b);
    }
    public Bebida getBebida() {
        if (lista.size() == 0) {
            return null;
        } else{
            return lista.remove(0);
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