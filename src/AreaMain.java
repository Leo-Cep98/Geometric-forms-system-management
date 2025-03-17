public class AreaMain {
    public static void main(String[] args){
        Circulo circulo = new Circulo("Blanco",18.9);
        Circulo circulo1 = new Circulo("Negro", 14.2);
        Rectangulo rectangulo = new Rectangulo("Blanco",18.3,10);
        Rectangulo rectangulo1 = new Rectangulo("Negro", 8.9,20.3);

        System.out.println("\nEl área del circulo 1 es ..."+ circulo.calcularArea()+"\nY el color es...");
        circulo.mostrarColor();
        System.out.println("\nEl área del circulo 2 es ... "+circulo1.calcularArea()+"\nY el color es...");
        circulo1.mostrarColor();
        System.out.println("\nEl área del rectangulo 1 es ... "+rectangulo.calcularArea()+"\nY el color es...");
        rectangulo.mostrarColor();
        System.out.println("\nEl área del rectangulo 2 es ... "+rectangulo1.calcularArea()+"\nY el color es...");
        rectangulo1.mostrarColor();
    }
}
