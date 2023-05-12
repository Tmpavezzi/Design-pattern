package br.senac.sp.model;

import br.senac.sp.Situacao.situacao;

public class Maquina {

    
    private double saldo;
    private situacao situacao;
    private static final double PRECO = 3.00;


    public void inserirMoeda(double valor, situacao situacao) {
        this.saldo += valor;
        this.situacao=situacao;
        if(this.saldo>=PRECO){
            this.saldo-=PRECO;
        }
    }

    public void solicitarCafe() {
       if(this.saldo>=PRECO){
        this.saldo-=PRECO;
       }
    }

    public Estado verificarEstado(){
        return situacao.verficarEstado();
    }

    public void cancelar() {
             this.saldo = 0;
    }

    public void creditoInsuficiente(){
        situacao.creditoInsuficiente(this);
    }

    public void creditoSuficiente(){
        situacao.creditoSuficiente(this);
    }

    public situacao geSituacao(){
        return situacao;
    }

    public void  setSituacao(situacao situacao){
          this.situacao=situacao;
    }

   
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(){
        this.saldo=saldo;
    }
    
    
}
