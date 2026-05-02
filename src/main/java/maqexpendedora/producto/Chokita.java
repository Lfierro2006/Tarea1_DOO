package producto;

abstract class Chokita extends Dulce {
    public Chokita(int serie) {
        super(serie);
    }

    @Override
    public String consumir() {
        return "chokita";
    }
}