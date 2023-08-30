import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"Felipe", "Márcia", "Júlia", "Paulo", "Augusto", "Mônica", "Fabrício", "Juliana", "Fernanda", "Lucas"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
        
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O Candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void entrandoEmContato(String candidato) {
        int TentativaRealizada = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                TentativaRealizada++;
            }
        } while (continuarTentando && TentativaRealizada < 3);

        if (atendeu) {
            System.out.println("Conseguiu contato com " + candidato + " na tentativa " + TentativaRealizada);}
            else {
                System.out.println("Não conseguiu contato com " + candidato + ". Número máximo de tentativas: " + TentativaRealizada);
            }
    }  

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
