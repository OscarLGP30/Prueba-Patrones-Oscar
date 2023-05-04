package org.example;

public class Main {
    public static void main(String[] args) {
        // Creamos tres bases
        Base base1 = new BaseBuilder() {
            @Override
            public BaseBuilder setNombre(String nombre) {
                return null;
            }

            @Override
            public BaseBuilder setnumeroDeAmbulancias(int numeroDeAmbulancias) {
                return null;
            }

            @Override
            public BaseBuilder setTiempoAsistencia(double tiempoAsistencia) {
                return null;
            }

            @Override
            public Base build() {
                return null;
            }

            @Override
            public BaseCompuesta construir() {
                return null;
            }

            @Override
            public ConcreteBaseBuilder setNumeroDeAmbulancias(int i) {
                return null;
            }

            @Override
            public BaseBuilder addBase(Base base2) {
                return null;
            }
        }
                .setNombre("Villanueva de la Cañada")
                .setNumeroDeAmbulancias(2)
                .setTiempoAsistencia(10)
                .build();

        Base base2 = new BaseBuilder() {
            @Override
            public BaseBuilder setNombre(String nombre) {
                return null;
            }

            @Override
            public BaseBuilder setnumeroDeAmbulancias(int numeroDeAmbulancias) {
                return null;
            }

            @Override
            public BaseBuilder setTiempoAsistencia(double tiempoAsistencia) {
                return null;
            }

            @Override
            public Base build() {
                return null;
            }

            @Override
            public BaseCompuesta construir() {
                return null;
            }

            @Override
            public ConcreteBaseBuilder setNumeroDeAmbulancias(int i) {
                return null;
            }

            @Override
            public BaseBuilder addBase(Base base2) {
                return null;
            }
        }
                .setNombre("Alcobendas")
                .setNumeroDeAmbulancias(3)
                .setTiempoAsistencia(12)
                .build();

        Base base3 = new BaseBuilder() {
            @Override
            public BaseBuilder setNombre(String nombre) {
                return null;
            }

            @Override
            public BaseBuilder setnumeroDeAmbulancias(int numeroDeAmbulancias) {
                return null;
            }

            @Override
            public BaseBuilder setTiempoAsistencia(double tiempoAsistencia) {
                return null;
            }

            @Override
            public Base build() {
                return null;
            }

            @Override
            public BaseCompuesta construir() {
                return null;
            }

            @Override
            public ConcreteBaseBuilder setNumeroDeAmbulancias(int i) {
                return null;
            }

            @Override
            public BaseBuilder addBase(Base base2) {
                return null;
            }
        }
                .setNombre("Hospital Clínico Universitario Puerta de Hierro")
                .setNumeroDeAmbulancias(4)
                .setTiempoAsistencia(15)
                .build();

        // Creamos dos bases compuestas
        BaseCompuesta baseCompuesta1 = (BaseCompuesta) new BaseCompuestaBuilder() {
            @Override
            public BaseBuilder setNombre(String nombre) {
                return null;
            }

            @Override
            public BaseBuilder setnumeroDeAmbulancias(int numeroDeAmbulancias) {
                return null;
            }

            @Override
            public BaseBuilder setTiempoAsistencia(double tiempoAsistencia) {
                return null;
            }

            @Override
            public Base build() {
                return null;
            }

            @Override
            public ConcreteBaseBuilder setNumeroDeAmbulancias(int i) {
                return null;
            }

            @Override
            public BaseBuilder addBase(Base base2) {
                return null;
            }
        }
                .setNombre("Majadahonda")
                .addBase(base2)
                .addBase(base3)
                .build();

        BaseCompuesta baseCompuesta2 = (BaseCompuesta) new BaseCompuestaBuilder() {
            @Override
            public BaseBuilder setNombre(String nombre) {
                return null;
            }

            @Override
            public BaseBuilder setnumeroDeAmbulancias(int numeroDeAmbulancias) {
                return null;
            }

            @Override
            public BaseBuilder setTiempoAsistencia(double tiempoAsistencia) {
                return null;
            }

            @Override
            public Base build() {
                return null;
            }

            @Override
            public ConcreteBaseBuilder setNumeroDeAmbulancias(int i) {
                return null;
            }

            @Override
            public BaseBuilder addBase(Base base2) {
                return null;
            }
        }
                .setNombre("Tres Cantos")
                .addBase(base1)
                .addBase(baseCompuesta1)
                .build();

        // Calculamos el número de ambulancias y el tiempo medio de asistencia para cada base
        System.out.println("Número de ambulancias y tiempo medio de asistencia para cada base:");
        System.out.println(base1.getNombre() + ": " + base1.getNumeroDeAmbulancias() + " ambulancias, " + base1.getTiempoAsistencia() + " minutos");
        System.out.println(base2.getNombre() + ": " + base2.getNumeroDeAmbulancias() + " ambulancias, " + base2.getTiempoAsistencia() + " minutos");
        System.out.println(base3.getNombre() + ": " + base3.getNumeroDeAmbulancias() + " ambulancias, " + base3.getTiempoAsistencia() + " minutos");
        System.out.println(baseCompuesta1.getNombre() + ": " + baseCompuesta1.getNumeroDeAmbulancias() + " ambulancias, " + baseCompuesta1.getTiempoAsistencia() + " minutos");
        System.out.println(baseCompuesta2.getNombre() + ": " + baseCompuesta2.getNumeroDeAmbulancias() + " ambulancias, " + baseCompuesta2.getTiempoAsistencia() + " minutos");
    }
}

