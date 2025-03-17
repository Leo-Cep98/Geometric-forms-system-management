public class Rectangulo extends Forma implements CalcularArea{
    private double base;
    private double altura;
    public Rectangulo(String color, double base, double altura){
        super(color);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }
}
