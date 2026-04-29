class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVuelto;
    private int precio;
    public static final int COCA =1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    public Expendedor(int numbebidas, int precio){
        this.precio=precio;
        this.coca= new Deposito();
        this.sprite= new Deposito();
        this.monVuelto= new DepositoM();
        for (int i=0; i<numbebidas;i++){
            coca.addBebida(new CocaCola(100+i));
            sprite.addBebida((new Sprite(200+i)));
        }
    }

    public Bebida comprarBebida(Moneda a, int tipo){
        if(a==null)return null;
        Bebida b = null;

        if(a.getValor() >= this.precio){
            if (tipo==COCA){
                b= coca.getBebida();
            } else if (tipo==SPRITE) {
                b= sprite.getBebida();
            } else if (tipo==FANTA) {
                b=fanta.getbebida();
            }

            if (b !=null){ //calcular vuelto a devolver
                int vuelto = a.getValor() - precio;
                int cantMonedas100 = vuelto/100;//cantidad de monedas

                for (int i = 0; i < cantMonedas100; i++) {//se genera la cantidad de monedas y se meten al deposito
                    monVuelto.addMoneda(new Moneda100()); // se crea para el vuelto
                }
                return b;
            }
            else { //en caso de tipo de bebida pedido inexistente o fuera de stock se devuelve la moneda
                monVuelto.addMoneda(a);
                return null;
            }
        }
        else{ // en caso de que no alcanza la plata tambien se devuelve la moneda
            monVuelto.addMoneda(a);
            return null;
        }
    }
    public Moneda getVuelto(){
        return monVuelto.getMoneda();
    }
}

