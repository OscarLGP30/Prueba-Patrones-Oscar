package org.example;

public class Base {
    private String nombre;
    private int numeroDeAmbulancias;
    private double tiempoAsistencia;

    public Base(String nombre, int numeroDeAmbulancias, double tiempoAsistencia) {
        this.nombre = nombre;
        this.numeroDeAmbulancias = numeroDeAmbulancias;
        this.tiempoAsistencia = tiempoAsistencia;
    }

    public Base(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroDeAmbulancias() {
        return numeroDeAmbulancias;
    }

    public double getTiempoAsistencia() {
        return tiempoAsistencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroDeAmbulancias(int numeroDeAmbulancias) {
        this.numeroDeAmbulancias = numeroDeAmbulancias;
    }

    public void setTiempoAsistencia(double tiempoAsistencia) {
        this.tiempoAsistencia = tiempoAsistencia;
    }

    @Override
    public String toString() {
        return "Base{" +
                "nombre='" + nombre + '\'' +
                ", numeroDeAmbulancias=" + numeroDeAmbulancias +
                ", tiempoAsistencia=" + tiempoAsistencia +
                '}';
    }

}