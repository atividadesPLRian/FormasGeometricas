import java.util.ArrayList;
import java.util.List;

public class RepositorioFigurasGeometricas2d {
    List<FiguraGeometrica2d> figurasGeometricas = new ArrayList<>();

    public String adicionaFiguraGeometrica2d(FiguraGeometrica2d figura)
    {
        figurasGeometricas.add(figura);
        return figura.getTipoFigura();
    }

    public void deletaFiguraGeometrica2d(int posicao)
    {
        figurasGeometricas.remove(posicao);
    }

    public double recuparaArea(int posicao)
    {
        return figurasGeometricas.get(posicao).getArea();
    }

    public double recuparaPerimetro(int posicao)
    {
        return figurasGeometricas.get(posicao).getPerimetro();
    }

    public String recuparaTipo(int posicao)
    {
        return figurasGeometricas.get(posicao).getTipoFigura();
    }

}