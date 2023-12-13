/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.companhiaaerea;


class Reserva {
    int proxId = 1;
    int id;
    int numeroassentos;
    String status;

    public Reserva(int numeroassentos) {
        this.id = proxId++;
        this.numeroassentos = numeroassentos;
    }

    public int getNumeroAssento() {
        return numeroassentos;
    }

    public int getId() {
        return id;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
