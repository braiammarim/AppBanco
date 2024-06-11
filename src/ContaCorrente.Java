package com.unimetrocamp.banco.model;

public class ContaCorrente extends Conta {

    private float tarifa;
    private float cpmf;

    public ContaCorrente() {

    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public float getCpmf() {
        return cpmf;
    }

    public void setCpmf(float cpmf) {
        this.cpmf = cpmf;
    }
}