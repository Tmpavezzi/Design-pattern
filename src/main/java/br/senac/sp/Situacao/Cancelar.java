package br.senac.sp.Situacao;

import br.senac.sp.model.Estado;

public class Cancelar extends situacao {

    
    @Override
    public  Estado verficarEstado(){
        return new Estado("Cancelar");
    }
    
}
