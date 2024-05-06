import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        double limiteDiario = scanner.nextDouble();
        

        while(limiteDiario > 0){
            double primeiroSaque = scanner.nextDouble();
            if(primeiroSaque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }else if(primeiroSaque > limiteDiario){
                System.out.println("Limite diario de saque atingido.");
                System.out.println("Transacoes encerradas");
                break;
            }else{
                limiteDiario -= primeiroSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

// TODO: Crie um loop 'for' para iterar sobre os saques:

// TODO: Solicite ao usuário o valor do saque:
           

// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;

           
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            

// TODO: Informe que o saque foi realizado e mostre o limite restante:
              
            }
}
