package com.unimetrocamp.banco.model;

public class ContaPoupanca extends Conta {

    private float rendimento;

    public ContaPoupanca() {

    }

    public float getRendimento() {
        return rendimento;
    }

    public void setRendimento(float rendimento) {
        this.rendimento = rendimento;
    }
}