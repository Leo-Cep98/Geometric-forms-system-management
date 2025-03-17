public abstract class Forma implements CalcularArea{
    protected String color;
    public Forma(String color){
        this.color=color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void mostrarColor(){
        System.out.println(getColor());
    }
}
