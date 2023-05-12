package br.senac.sp.Situacao;

import br.senac.sp.model.Estado;
import br.senac.sp.model.Maquina;

public abstract class situacao {

    public abstract Estado verficarEstado();

    public void creditoInsuficiente(Maquina pedido) {
        throw new RuntimeException("Não pode mudar para creditoInsuficiente");
    }

    public void creditoSuficiente(Maquina pedido) {
        throw new RuntimeException("Não pode mudar para situação creditoSuficiente");
    }

    public void Pagar(Maquina pedido) {
        throw new RuntimeException("Não pode mudar para situação pago");

    }
    
}
