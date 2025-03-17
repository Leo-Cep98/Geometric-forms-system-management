public class Circulo extends Forma implements CalcularArea {
    private double radio;
    public Circulo(String color, double radio){
        super(color);
        this.radio=radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
}
