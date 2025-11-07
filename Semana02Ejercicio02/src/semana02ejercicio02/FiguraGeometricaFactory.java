package semana02ejercicio02;

public class FiguraGeometricaFactory {
    public FiguraGeometrica generaFigura(String tipoFigura){
        if(tipoFigura == null){
            return null;
        }
        if(tipoFigura.equalsIgnoreCase("CIRCULO")){
            return new Circulo();
        }else if(tipoFigura.equalsIgnoreCase("CUADRADO")){
            return new Cuadrado();
        }else if(tipoFigura.equalsIgnoreCase("RECTAGULO")){
            return new Rectangulo();
        }
        return null;
    }
}
