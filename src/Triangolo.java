public class Triangolo implements Forma {
    private  double altezza;
    private  double base;

    public Triangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcoloArea() {
        return (base * altezza) / 2;
    }
    }

