public class Circulo implements FiguraGeometrica2d {
    private double raio;
    private double pi = Math.PI;

    public Circulo(double raio) {
        this.raio = raio;
    }


    public int compareTo(FiguraGeometrica2d figura2)
    {
        return Double.compare(this.getArea(), figura2.getArea());
    }

    @Override
    public String getTipoFigura() {

        return "Circulo";
    }

    @Override
    public double getArea() {

        return pi*raio*raio;
    }

    @Override
    public double getPerimetro() {

        return 2*pi*raio;
    }
}