
import java.util.Scanner;



public class Desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try{
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido.");
        }catch(ContaInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
            scanner.close();
        }finally{
            
        }
    }

    public static class ContaInvalidaException extends Exception{

        @Override
        public String getMessage() {
            return "Numero de conta invalido. Digite exatamente 8 digitos.";
        }
        
        
    }
   
    public static void verificarNumeroConta(String numeroConta) throws ContaInvalidaException { 
        if(numeroConta.length() != 8){
            throw new ContaInvalidaException();
        }
    }
}
