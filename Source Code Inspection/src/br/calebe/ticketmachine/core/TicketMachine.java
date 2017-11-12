package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException("o papel moeda é invalido");
        }
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        return null;
    }
    
   public void atualizarSaldo() throws SaldoInsuficienteException {
      if (saldo < valor) {
          throw new SaldoInsuficienteException("O seu saldo é insuficiente");
      }else if(saldo > valor){
           
      } else{
      
      }
   }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
          throw new SaldoInsuficienteException("O seu saldo é insuficiente");
        }
        
        saldo = saldo - valor;
        String result = "*****************\n";
        result += "*** R$ " + valor + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
