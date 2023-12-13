package com.mycompany.companhiaaerea;

import java.util.ArrayList;
import java.util.List;

public class Voo {

    String origem;
    String destino;
    String data;
    int numeroassentos;
    List<Reserva> reservas;

    public Voo(String origem, String destino, String data, int numeroassentos) {
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.numeroassentos = numeroassentos;
        this.reservas = new ArrayList<>();
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumeroassentos() {
        return numeroassentos;
    }

    public void setNumeroassentos(int numeroassentos) {
        this.numeroassentos = numeroassentos;
    }
    
    

    public void realizarReserva(int numassentos) {
        if (validarReserva()) {
            if (numassentos > 0 && numassentos <= numeroassentos) {
                Reserva reserva = new Reserva(numassentos);
                reservas.add(reserva);
                numeroassentos -= numassentos;
                System.out.println("Reserva realizada");
            } else {
                System.out.println("Numero de assentos indisponível");
            }
        } else {
            System.out.println("Erro na rezerva");
        }
    }

    public boolean validarReserva() {
        if (this.origem.isEmpty() || this.destino.isEmpty() || this.data.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void confirmarReserva(Reserva reserva) {
        reserva.setStatus("Confirmada");
    }

    public void cancelarReserva(Reserva reserva) {
        numeroassentos += reserva.getNumeroAssento();
        reservas.remove(reserva);
        reserva.setStatus("Cancelada");
    }

    public int getNumeroAssentosDisponiveis() {
        return numeroassentos;
    }
}
