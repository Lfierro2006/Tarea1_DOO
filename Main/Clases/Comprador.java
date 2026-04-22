class Comprador{
    private String sonido;
    private int vuelto;
    
    public Comprador(Moneda m,int cualBebida,Expendedor exp){
        Bebida b= exp.comprarBebida(m,cualBebida);
        
        if(b!=null){
            this.sonido=b.beber();
        }

        Moneda c=exp.getVuelto();
        
        while(c!=null){
            vuelto=vuelto+c.getValor();
            c=exp.getVuelto();
        }
    }
    
    public int cuantoVuelto(){
        return vuelto;
    }
    
    public String queBebiste(){
        return sonido;
    }

}
