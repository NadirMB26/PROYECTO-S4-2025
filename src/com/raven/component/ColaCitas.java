package com.raven.component;

import co.edu.unicolombo.poo.Vet.Domain.Model.Cita;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ColaCitas {

    private NodoCita frente;
    private NodoCita fin;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public ColaCitas() {
        this.frente = null;
        this.fin = null;
    }

    public void encolar(Cita cita) {
        NodoCita nuevo = new NodoCita(cita);
        if (frente == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }

    // Desencola todas las citas cuya hora de salida ya pasó
    public void desencolarPorHora() {
        LocalTime ahora = LocalTime.now();

        while (frente != null) {
            String horaSalidaStr = frente.getCita().getHoraSalida();

            if (horaSalidaStr != null && !horaSalidaStr.isEmpty()) {
                try {
                    LocalTime horaSalida = LocalTime.parse(horaSalidaStr, formatter);

                    if (horaSalida.isBefore(ahora) || horaSalida.equals(ahora)) {
                        if (frente.getSiguiente() == null) {
                            frente = null;
                            fin = null;
                        } else {
                            frente = frente.getSiguiente();
                            frente.setAnterior(null);
                        }
                    } else {
                        break; // la siguiente cita aún no debe salir
                    }

                } catch (DateTimeParseException e) {
                    System.err.println("Formato de hora inválido en la cita: " + horaSalidaStr);
                    break; // evita eliminar citas si la hora está mal formateada
                }
            } else {
                break; // no hay hora válida para comparar
            }
        }
    }

    public Cita verFrente() {
        return (frente != null) ? frente.getCita() : null;
    }

    public NodoCita getFrente() {
        return this.frente;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void imprimirCola() {
        NodoCita aux = frente;
        System.out.println("\nCitas en cola:");
        while (aux != null) {
            Cita c = aux.getCita();
            System.out.println("Cita ID: " + c.getIdcita() + " - Cliente: " + c.getCedulacliente()
                    + " - Salida: " + c.getHoraSalida() + " - Diagnóstico: " + c.getDescrip());
            aux = aux.getSiguiente();
        }
    }

    public int tamaño() {
        int count = 0;
        NodoCita aux = frente;
        while (aux != null) {
            count++;
            aux = aux.getSiguiente();
        }
        return count;
    }
}
