/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocamilocastrooliveros.modelo;

/**
 *
 * @author SALA DESARROLLO 1
 */
public class Invitacion {
    private Evento elEvento;
    private Persona elInvitado;
    private boolean estado;
    private Persona quienInvita;

    public Evento getElEvento() {
        return elEvento;
    }

    public void setElEvento(Evento elEvento) {
        this.elEvento = elEvento;
    }

    public Persona getElInvitado() {
        return elInvitado;
    }

    public void setElInvitado(Persona elInvitado) {
        this.elInvitado = elInvitado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Persona getQuienInvita() {
        return quienInvita;
    }

    public void setQuienInvita(Persona quienInvita) {
        this.quienInvita = quienInvita;
    }

    @Override
    public String toString() {
        return "Invitacion{" + "elEvento=" + elEvento + ", elInvitado=" + elInvitado + ", estado=" + estado + ", quienInvita=" + quienInvita + '}';
    }
    
    
}
