public class rodado implements comprable {

    private double numeroRuedas;
    private double velocidadMaxima;
    private String color;
    private double costo;

    @Override
    public void caracteristicas(String caracteristica) {

    }

    @Override
    public double definirCosto() {
        return (costo);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioTotal= (costo+(costo*calcularImpuesto()));
        return precioTotal;
    }

    @Override
    public void compras(String comprar) {
        String compra = ("El producto se vendió");
    }

    @Override
    public double calcularImpuesto() {
        double impuestos = 0.20;
        return impuestos;
    }

    public double getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(double numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
