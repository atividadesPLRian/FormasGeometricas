import java.util.Objects;

public class TrianguloRetangulo implements FiguraGeometrica2d{
    private double lado;

    public TrianguloRetangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public String getTipoFigura() {
        return "Triangulo Retângulo";
    }

    @Override
    public double getArea() {
        return  lado * lado * Math.sqrt(3) / 4;
    }

    @Override
    public double getPerimetro() {
        return  3 * lado;
    }

    public int compareTo(FiguraGeometrica2d figura2)
    {
        return Double.compare(this.getArea(), figura2.getArea());
    }

    @Override
    public String toString() {
        return "TrianguloRetangulo{" +
                "lado=" + lado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrianguloRetangulo that = (TrianguloRetangulo) o;
        return Double.compare(lado, that.lado) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lado);
    }
}
