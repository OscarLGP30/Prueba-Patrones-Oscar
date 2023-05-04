package org.example;

public abstract class ConcreteBaseBuilder implements BaseBuilder {
    private String nombre;
    private int numeroDeAmbulancias;
    private double tiempoAsistencia;

    @Override
    public ConcreteBaseBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public ConcreteBaseBuilder setnumeroDeAmbulancias(int numeroDeAmbulancias) {
        this.numeroDeAmbulancias = numeroDeAmbulancias;
        return this;
    }

    @Override
    public ConcreteBaseBuilder setTiempoAsistencia(double tiempoAsistencia) {
        this.tiempoAsistencia = tiempoAsistencia;
        return this;
    }

    @Override
    public Base build() {
        return (BaseCompuesta) new Base(nombre, numeroDeAmbulancias, tiempoAsistencia);
    }

    @Override
    public ConcreteBaseBuilder setNumeroDeAmbulancias(int i) {
        this.numeroDeAmbulancias = i;
        return this;
    }

    @Override
    public BaseBuilder addBase(Base base2) {
        throw new UnsupportedOperationException("Esta operación no está permitida en una instancia de ConcreteBaseBuilder");
    }
}

