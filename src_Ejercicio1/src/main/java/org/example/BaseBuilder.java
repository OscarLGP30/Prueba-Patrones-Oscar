package org.example;

public interface BaseBuilder {


    BaseBuilder setNombre(String nombre);
    BaseBuilder setnumeroDeAmbulancias(int numeroDeAmbulancias);
    BaseBuilder setTiempoAsistencia(double tiempoAsistencia);

    Base build();

    BaseCompuesta construir();

    ConcreteBaseBuilder setNumeroDeAmbulancias(int i);

    BaseBuilder addBase(Base base2);
}

