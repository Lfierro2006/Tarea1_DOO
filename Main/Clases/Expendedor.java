class Expendedor{
    private int precio;
    private Deposito coca;
    private Deposito sprite;
    private Deposito monVu;
    public static final int COCA=1;
    public static final int SPRITE=2;
    
    public Expendedor(int numBebidas,int precio){
        this.precio=precio;
        coca=new Deposito();
        sprite=new Deposito();
        monVu=new Deposito();
        
        for(int i=0;i<numBebidas;i++){
            coca.addBebida(new CocaCola(i+100));
        }
        
        for (int i=0;i<numBebidas;i++){
            sprite.addBebida(new Sprite(i+200));
        }
    
    }
