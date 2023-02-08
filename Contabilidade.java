package contabilidade;

import java.util.Scanner;


public class Contabilidade {

   
    public static void main(String[] args)  {
      // INICIANDO O SCANNER
      Scanner sc = new Scanner(System.in);
      
      byte menu = 0;
      
                System.out.println("Nome da empresa: ");
                String nome = sc.nextLine();
                
                // INICIANDO A LISTA LOCALIZADA NA CLASSE PAGAMENTO
                Pagamento pagamento = new Pagamento(nome);
                
      while(menu != 3){
          System.out.println("\n\n\t___MENU___");
          System.out.println("\n1 - Calcular Impostos" + "\n2 - Total" + "\n3 - Sair");
          System.out.print("\nEscolha a opção numero: ");
          menu = sc.nextByte();
          System.out.println("\n\n\n");
    
          if(menu == 1){
              System.out.println("\n\n\t___CALCULAR IMPOSTO___");
              System.out.println("\n1 - PIS \n2 - IPI \n3 - Voltar");
              System.out.print("\nEscolha a opção numero: ");
              byte imp = sc.nextByte();   
              System.out.println("\n\n\n");
                           
              
              if(imp == 1){
                System.out.println("\n\n\t___PIS___\n");
                    System.out.print("Total Debito: R$ ");
                    double a = sc.nextDouble();
                        System.out.print("Total Credito: R$ ");
                        double b = sc.nextDouble();
                double valor = valorPIS(a, b); 
                pagamento.adionaImposto(new PIS(valor));   
                System.out.println("Cadastro efetuado!\n\n\n");
              }
              
              if(imp == 2){
                System.out.println("\n\n\t___IPI___\n");
                    System.out.print("Valor do Produto: R$ ");
                    double a = sc.nextDouble();
                        System.out.print("Valor do Frete: R$ ");
                        double b = sc.nextDouble();
                            System.out.print("Valor do Seguro: R$ ");
                            double c = sc.nextDouble();
                                System.out.print("Outras despesas: R$ ");
                                double d = sc.nextDouble();
                double valor = valorIPI(a,b,c,d);
                pagamento.adionaImposto(new IPI(valor)); 
                  System.out.println("Cadastro efetuado!\n\n\n");
              }
              
          }// FIM DO MENU CALCULAR IMPOSTOS
          
          if(menu == 2){
              pagamento.mostraImpostos();
              System.out.println("\n\nAperte ENTER para continuar");
              sc.nextLine(); sc.nextLine();
              System.out.println("\n\n\n");
          }
         
          if(menu == 3){
              break;
          }
                 
      }// FIM DO WHILE
             
        
      sc.close();
    }
    
    public static double valorIPI(double a, double b, double c, double d){
        return a + b + c + d;
    }
    
    public static double valorPIS(double a, double b){
        return a - b;
    }
    
}