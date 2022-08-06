public class productoBelleza implements comprable{

    private String nombre;
    private String marca;
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
        double impuestos = 0.19;
        return impuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
