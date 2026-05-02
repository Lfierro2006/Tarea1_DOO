package producto;

abstract class Snicker extends Dulce {
    public Snicker(int serie) {
        super(serie);
    }

    @Override
    public String consumir() {
        return "snicker";
    }
}