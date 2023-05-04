package org.example;

import java.util.ArrayList;
import java.util.List;

public class BaseCompuesta extends Base {
    private List<Base> base;

    public BaseCompuesta(String nombre, List<Base> bases) {
        super(nombre);
        this.base = bases;
    }

    public BaseCompuesta(Object nombre) {
        super(nombre.toString());
    }

    public List<Base> getBases() {
        return base;
    }

    public void setBases(List<Base> base) {
        this.base = base;
    }

    @Override
    public int getNumeroDeAmbulancias() {
        int numeroDeAmbulancias = 0;
        for (Base base : base) {
            numeroDeAmbulancias += base.getNumeroDeAmbulancias();
        }
        return numeroDeAmbulancias;
    }

    @Override
    public double getTiempoAsistencia() {
        double tiempoAsistencia = 0;
        for (Base base : base) {
            tiempoAsistencia += base.getTiempoAsistencia();
        }
        tiempoAsistencia /= base.size();
        return tiempoAsistencia;
    }

    public void agregarBase(Base base) {
        this.base.add(base);
    }

    public static class Builder {
        private String nombre;
        private List<Base> base;

        public Builder() {
            base = new ArrayList<>();
        }

        public Builder withNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder withBase(Base base) {
            this.base.add(base);
            return this;
        }

        public Builder withBases(List<Base> base) {
            this.base.addAll(base);
            return this;
        }

        public BaseCompuesta build() {
            return new BaseCompuesta(nombre, base);
        }
    }
}

