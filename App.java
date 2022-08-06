public class App {

    public static void main(String[] args) {

        rodado motocicleta = new rodado();
        rodado carro = new rodado();
        alimento pan = new alimento();
        productoBelleza rimel = new productoBelleza();

        //colocando los datos de rodado 1
        motocicleta.setNumeroRuedas(2);
        motocicleta.setVelocidadMaxima(90);
        motocicleta.setColor("rojo");
        motocicleta.setCosto(1690000);

        //colocando los datos de rodado 2
        carro.setNumeroRuedas(4);
        carro.setVelocidadMaxima(447);
        carro.setColor("plateado");
        carro.setCosto(14000000);
        //colocando los datos de alimento
        pan.setName("Pan integral");
        pan.setFechaExpiracion(04/08/2022);
        pan.setCosto(1000);
        //colocando los datos de rimel
        rimel.setNombre("Rimel negro");
        rimel.setMarca("EleganceStyle");
        rimel.setCosto(3000);

        //obtener precio final
        motocicleta.calcularImpuesto();
        motocicleta.calcularPrecioFinal();

    }
}
