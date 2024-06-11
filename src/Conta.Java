package com.unimetrocamp.banco.model;

public class Conta {

    //ATRIBUTOS

    private String codigo;
    private float saldo;
    private Cliente cliente;

    //MÉTODOS

    public Conta() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(float valor ) {
        saldo = saldo + valor;
    }

    public void sacar( float valor ) {
        saldo = saldo - valor;
    }

}