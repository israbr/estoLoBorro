package com.java101.parking;

public class Coche {

    private String matricula;
    private String horaDeEntrada;
    private String horaDeSalida;

    public Coche(final String matricula, final String horaDeEntrada, final String horaDeSalida) {
        this.matricula = matricula;
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
    }

    public String getMatricula() {
        return matricula;
    }
}
