package br.senac.sp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.senac.sp.Situacao.Cancelar;
import br.senac.sp.Situacao.CreditoInsuficiente;
import br.senac.sp.Situacao.CreditoSuficiente;
import br.senac.sp.Situacao.inicio;
import br.senac.sp.model.Estado;
import br.senac.sp.model.Maquina;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void deveZerarOSaldoAoCancelar()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00, new Cancelar());
        maquina.cancelar();
        assertTrue(maquina.getSaldo() == 0);
    }

    @Test
    public void deveZerarOSaldoAoSolicitarCafe()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(3.00,new CreditoSuficiente());
        maquina.solicitarCafe();
        assertTrue(maquina.getSaldo() == 0);
    }

    @Test
    public void deveRetornarCreditoInsuficiente()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00,new CreditoInsuficiente());
        maquina.solicitarCafe();

        assertTrue(maquina.verificarEstado().getNome().equals("Crédito insuficiente"));
    }

    @Test
    public void deveRetornarCreditoSuficiente()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(3.00, new CreditoSuficiente());
        maquina.solicitarCafe();
        assertTrue(maquina.getSaldo()>=0);
    }

    @Test
    public void deveRetornarInicial()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00, new inicio());
        maquina.cancelar();
        Estado estado=maquina.verificarEstado();
        assertTrue(estado.getNome().equals("Inicial"));
    }

    @Test
    public void deveRetornarInicialAoCancelar()
    {
        Maquina maquina = new Maquina();
        maquina.inserirMoeda(2.00,new Cancelar());
        maquina.cancelar();
        Estado estado= maquina.verificarEstado();
        assertTrue(estado.getNome().equals("Cancelar"));
        
    }


}
