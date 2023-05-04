package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCompuestaBuilder implements BaseBuilder {
    private static final Object nombre = null;
    private List<Base> bases;

    public BaseCompuestaBuilder(Object nombre) {
        super();
        bases = new ArrayList<>();
    }

    public BaseCompuestaBuilder() {
        super();
        bases = new ArrayList<>();
    }

    public void agregarBase(Base base) {
        bases.add(base);
    }

    @Override
    public BaseCompuesta construir() {
        BaseCompuesta baseCompuesta = new BaseCompuesta(nombre);
        for (Base base : bases) {
            baseCompuesta.agregarBase(base);
        }
        return baseCompuesta;
    }
}

