import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] candidatos = {"Felipe", "Márcia", "Júlia", "Paulo", "Augusto", "Mônica", "Fabrício", "Juliana", "Fernanda", "Lucas"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        imprimirSelecionados();

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

    static void imprimirSelecionados(){
        String[] candidatos = {"Mônica", "Fabrício", "Juliana", "Fernanda", "Lucas"};
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice +1) + " é o " + candidatos[indice] );
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidatura(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra-proposta");
        } else {
            System.out.println("Ligar para os demais candidatos");
        }
    }
}

