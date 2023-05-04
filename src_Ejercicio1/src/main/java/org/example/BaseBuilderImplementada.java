package org.example;

public abstract class BaseBuilderImplementada implements BaseBuilder {
    private String nombre;
    private int numeroDeAmbulancias;
    private double tiempoAsistencia;

    @Override
    public BaseBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public BaseBuilder setnumeroDeAmbulancias(int numeroDeAmbulancias) {
        this.numeroDeAmbulancias = numeroDeAmbulancias;
        return this;
    }

    @Override
    public BaseBuilder setTiempoAsistencia(double tiempoAsistencia) {
        this.tiempoAsistencia = tiempoAsistencia;
        return this;
    }

    @Override
    public Base build() {
        return new Base(nombre, numeroDeAmbulancias, tiempoAsistencia) {
            @Override
            public int getNumeroDeAmbulancias() {
                return 0;
            }

            @Override
            public double getTiempoAsistencia() {
                return 0;
            }
        };
    }
}
