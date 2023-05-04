package org.example;

public class DispositivoEntradaFactory implements ComponenteFactory {

    @Override
    public DispositivoEntrada crearComponente(String nombreFabricante, String modelo, double precioVenta,
                                              String tipoConector, List<Integer> puertosValidos) {
        return new DispositivoEntrada(nombreFabricante, modelo, precioVenta, tipoConector, puertosValidos);
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

