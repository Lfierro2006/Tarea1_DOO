abstract class Bebida{
    private int serie;

    public Bebida (int serie){
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }
    public abstract String beber();

}
class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie);
    }

    public String beber() {
        return "sprite";
    }
}
