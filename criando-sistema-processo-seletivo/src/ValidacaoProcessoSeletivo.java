import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ValidacaoProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        double salarioBase = 2000.00;

        case1(salarioBase, 1900.00);
        case1(salarioBase, 2000.00);
        case1(salarioBase, 2100.00);

        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
   
        String [] candidatosSelecionados =  case2(candidatos, salarioBase);

        case3(candidatosSelecionados);
        case4(candidatosSelecionados);

        
        
    }

   static void case1(double salarioBase, double salarioPretendido){
        if(salarioPretendido < salarioBase){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioPretendido == salarioBase){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
   }

   static String[] case2(String[] candidatos, double salarioBase){
        int quantidadeSelecionados = 0;
        String[] nomeSelecionados = new String[5];
        for(int i = 0; i < candidatos.length; i++){
            if(valorPretendido() <= salarioBase){
                nomeSelecionados[quantidadeSelecionados] = candidatos[i];
                quantidadeSelecionados +=1;
            }
            if(quantidadeSelecionados>=5){
                return nomeSelecionados;
            }
        }
        return nomeSelecionados;
   }

   static void case3(String[] candidatosSelecionados){
    System.out.println("Listando os candidatos selecionados: ");
        for(int i = 0; i < candidatosSelecionados.length; i++){
            if(candidatosSelecionados[i] != null){
                System.out.println(candidatosSelecionados[i]);
            }
            
        }
   }

   static void case4(String[] candidatosSelecionados){
        for(int i = 0; i < candidatosSelecionados.length; i++){
            int ligacoes = 1;
            while(ligacoes<=3 && candidatosSelecionados[i] != null){
                if(atender()){
                    System.out.println("CONSEGUIMOS CONTATO COM " + candidatosSelecionados[i] + " APÓS " + ligacoes + " TENTATIVA(S)");
                    break;
                }
                ligacoes+=1;
                if(ligacoes>=4){
                    System.out.println("NÃO CONSEGUIMOS CONTATO COM O(A) " + candidatosSelecionados[i]);
                }
            }
        }
   }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender() {
		return new Random().nextInt(3)==1;	
    }

}