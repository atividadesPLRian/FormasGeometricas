public class Quadrado implements FiguraGeometrica2d {
    private double lado;


    public Quadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public String getTipoFigura() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
        return 4*lado;
    }
}