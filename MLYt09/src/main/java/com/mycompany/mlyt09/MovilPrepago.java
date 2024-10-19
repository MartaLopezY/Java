package com.mycompany.mlyt09;

public class MovilPrepago {

    public long numeroMovil;
    protected float costeEstablecLlamada;
    protected float costeMinutoLlamada;
protected float costeConsumoMB;
    protected float saldo;

    MovilPrepago(long nM, float cEL, float cML, float cMB, float s) {
        numeroMovil = nM;
        costeEstablecLlamada = cEL;
        costeMinutoLlamada = cML;
        costeConsumoMB = cMB;
        saldo = s;
    }

    MovilPrepago(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    MovilPrepago() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void efectuarLlamada(int segundos) {
        saldo -= Math.round(
                (costeEstablecLlamada + costeMinutoLlamada / 60f * segundos) * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public void navegar(int mb) {
        saldo -= Math.round(costeConsumoMB * mb * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public boolean recargar(int importe) {
        if (importe % 5 == 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    public float consultarSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        String linea = String.format("El número de móvil es:%d y el saldo actual: %f", numeroMovil, saldo);
        return linea;
    }
} //fin 
