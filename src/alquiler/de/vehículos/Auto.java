package alquiler.de.vehículos;;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, double tarifaBase) {
        super(marca, modelo, tarifaBase);
    }
    
    @Override
    public double calcularCostoAlquiler(int dias) {

        double seguroPorDia = 10;

        return (getTarifaBase() * dias) + (seguroPorDia * dias);
    }
}