package org.example;

public class DispositivoSalidaFactory implements ComponenteFactory {

    @Override
    public DispositivoSalida crearComponente(String nombreFabricante, String modelo, double precioVenta,
                                             List<Integer> puertosValidos) {
        return new DispositivoSalida(nombreFabricante, modelo, precioVenta, puertosValidos);
    }

    public UnidadCentral crearUnidadCentral(String fabricante, String modelo, double precio) {
        return null;
    }

    public DispositivoEntrada crearDispositivoEntrada(String fabricante, String modelo, double precio, String tipoConector, List<Integer> puertosValidos) {
        return null;
    }

    public DispositivoSalida crearDispositivoSalida(String fabricante, String modelo, double precio, List<Integer> puertosValidos) {
        return null;
    }

    public ImpresoraLaser crearImpresoraLaser(String fabricante, String modelo, double precio, List<Integer> puertosValidos, String tipoCartucho, int numPaginasDesdeUltimoCambio) {
        return null;
    }
}

