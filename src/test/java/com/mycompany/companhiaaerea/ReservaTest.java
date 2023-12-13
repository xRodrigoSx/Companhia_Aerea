package com.mycompany.companhiaaerea;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReservaTest {
        Voo voo = new Voo();
        Reserva reserva = new Reserva(3);
        
        @Test
    public void testValidarReservaComDadosValidos() {
        voo.setOrigem("CidadeA");
        voo.setDestino("CidadeB");
        voo.setData("2023-12-31");

        assertTrue(voo.validarReserva());
    }
    
        @Test
    void testRealizarReserva() {
        voo.realizarRezerva(5);
        assertEquals(45, voo.getNumeroAssentosDisponiveis());
    }
    

    @Test
    void testConfirmarReserva() {
        voo.confirmarReserva(reserva);
        assertEquals("Confirmada", reserva.status);
    }

    @Test
    void testCancelarReserva() {
        voo.realizarRezerva(3);
        assertEquals(47, voo.getNumeroAssentosDisponiveis());

        voo.cancelarReserva(reserva);
        assertEquals(50, voo.getNumeroAssentosDisponiveis());
        assertEquals("Cancelada", reserva.status);
    }

    @Test
    void testGetNumeroAssentosDisponiveis() {
        assertEquals(50, voo.getNumeroAssentosDisponiveis());

        voo.realizarRezerva(8);
        assertEquals(42, voo.getNumeroAssentosDisponiveis());
    }
    
    @Test
    void testFalhanaReserva() {
        
        voo.realizarRezerva(130); //testando falha na reserva por tentativa de reservar mais assentos do que disponíveis
        
        voo.realizarRezerva(0); //testando falha na reserva por tentativa de reservar 0 assentos
    }
}
