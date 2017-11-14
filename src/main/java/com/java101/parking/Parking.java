package com.java101.parking;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {

        final boolean hayCoche = true;
        final boolean hayCocheQueriendoSalir = true;
        final Scanner teclao = new Scanner(System.in);


        String parkingFuncionando = teclao.nextLine();

        final SensorDeLaPuerta sensorDeLaPuerta = new SensorDeLaPuerta();
        final SensorDeSalida sensorDeSalida = new SensorDeSalida();

        final BaseDeDatosDeCochesAparcados baseDeDatosDeCochesAparcados = new BaseDeDatosDeCochesAparcados();

        while ("y".equals(parkingFuncionando)) {

            final int hayVenioUnCoche = (int) (Math.random() * 100);

            if (hayVenioUnCoche < 25) {
                final Coche coche = sensorDeLaPuerta.getCoche();
                baseDeDatosDeCochesAparcados.stock(coche);
            }

            final boolean casualmenteQuiereSalir = (int) (Math.random() * 100) < 33;

            if (baseDeDatosDeCochesAparcados.hayCoche() && casualmenteQuiereSalir) {
                final Coche cocheQueQuiereSalir = sensorDeSalida.getCoche();
                baseDeDatosDeCochesAparcados.destock(cocheQueQuiereSalir);
            }

            parkingFuncionando = teclao.nextLine();
        }


    }
}
