package org.example;

public class HPComponenteFactory extends ComponenteFactory {
    @Override
    public UnidadCentral crearUnidadCentral(String fabricante, String modelo, double precio) {
        return new HPUnidadCentral(fabricante, modelo, precio);
    }

    @Override
    public DispositivoEntrada crearDispositivoEntrada(String fabricante, String modelo, double precio, String tipoConector, List<Integer> puertosValidos) {
        return new HPDispositivoEntrada(fabricante, modelo, precio, tipoConector, puertosValidos);
    }

    @Override
    public DispositivoSalida crearDispositivoSalida(String fabricante, String modelo, double precio, List<Integer> puertosValidos) {
        return new HPDispositivoSalida(fabricante, modelo, precio, puertosValidos);
    }

    @Override
    public ImpresoraLaser crearImpresoraLaser(String fabricante, String modelo, double precio, List<Integer> puertosValidos, String tipoCartucho, int numPaginasDesdeUltimoCambio) {
        return new HPImpresoraLaser(fabricante, modelo, precio, puertosValidos, tipoCartucho, numPaginasDesdeUltimoCambio);
    }
}

