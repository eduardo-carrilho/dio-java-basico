import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble(); 
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500; 

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:

        if(saque > saldo + limiteChequeEspecial){
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }else if(saque > saldo && saque <= saldo + limiteChequeEspecial){
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        }else{
            System.out.println("Transação realizada com sucesso.");
        }

            // TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
          

                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                scanner.close(); 
            }
            
        }
        
