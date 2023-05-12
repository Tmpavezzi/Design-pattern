package br.senac.sp.Situacao;

import br.senac.sp.model.Estado;

public class CreditoInsuficiente  extends situacao{

    
    @Override
    public Estado verficarEstado(){
        return new Estado("Crédito insuficiente");
    }
}
