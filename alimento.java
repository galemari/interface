import java.util.Date;

public class alimento implements comprable{


    private String name;
    private Date fechaExpiracion;
    private double costo;

    @Override
    public void caracteristicas(String caracteristica) {

    }

    @Override
    public double definirCosto() {

        return costo;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioTotal= (costo+(costo*calcularImpuesto()));
        return precioTotal;
    }

    @Override
    public void compras(String comprar)  {
        String compra = ("El producto se vendió");
    }

    @Override
    public double calcularImpuesto() {
        double impuesto = 0.19;
        return impuesto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


}
