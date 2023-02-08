package contabilidade;

import java.util.ArrayList;
import java.util.List;


public class Pagamento {
    
    private String nome;
    //private ArrayList<Interface> lista;
    private List<Interface> lista = new ArrayList<>(); 

    
    
    public Pagamento(String nome) {
        this.nome = nome;
    }

    Pagamento() {
           }
     
    
    public void adionaImposto(Interface imposto) {
    lista.add(imposto);
  }

 
    public void mostraImpostos() {
        double total = 0;
        System.out.println("\n\t___" + nome + "___");
        for(Interface a : lista){
            total += a.calcularImposto();
            System.out.printf("\n%s: R$ %.2f", a.descricao(), a.calcularImposto());
        }
        System.out.printf("\nTOTAL: R$ %.2f", total);
    } 
      
    
    
    
    
    /*
   
    
    // ADICIONAR DADOS NA LISTA
    public void adionaImposto(Interface imposto){
        this.lista.add(imposto);
    }
    
    
   
    */
    
        }

