package org.example;

public abstract class ComponenteFactory {
    public abstract UnidadCentral crearUnidadCentral(String fabricante, String modelo, double precio);
    public abstract DispositivoEntrada crearDispositivoEntrada(String fabricante, String modelo, double precio, String tipoConector, List<Integer> puertosValidos);
    public abstract DispositivoSalida crearDispositivoSalida(String fabricante, String modelo, double precio, List<Integer> puertosValidos);
    public abstract ImpresoraLaser crearImpresoraLaser(String fabricante, String modelo, double precio, List<Integer> puertosValidos, String tipoCartucho, int numPaginasDesdeUltimoCambio);
}

