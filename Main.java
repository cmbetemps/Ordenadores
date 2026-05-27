public class Main {
    public static void main(String[] args) {
        Concurso concurso = new Concurso();
        Candidato candidato1 = new Candidato("12345678901", 7.5);
        Candidato candidato2 = new Candidato("98765432101", 8.0);
        Candidato candidato3 = new Candidato("01234567890", 6.5);
        Candidato candidato4 = new Candidato("90817263645", 5.5);
        Candidato candidato5 = new Candidato("81723263645", 7.0);
        concurso.adicionarCandidato(candidato1);
        concurso.adicionarCandidato(candidato2);
        concurso.adicionarCandidato(candidato3);
        concurso.adicionarCandidato(candidato4);
        concurso.adicionarCandidato(candidato5);
      
        // Sort using bubble sort
        concurso.definirOrdenador(new Bolha());
        Long tempoInicial = System.nanoTime();
        concurso.ordenar();
        Long tempoFinal = System.nanoTime();
        System.out.println("Candidatos ordenados por \"bolha\" (em " + (tempoFinal - tempoInicial) + " nanosegundos):");
        concurso.printCandidatos();

        concurso = new Concurso(); // reinicia a variável concurso para o próximo ordenador
        candidato1 = new Candidato("12345678901", 7.5);
        candidato2 = new Candidato("98765432101", 8.0);
        candidato3 = new Candidato("01234567890", 6.5);
        candidato4 = new Candidato("90817263645", 5.5);
        candidato5 = new Candidato("81723263645", 7.0);
        concurso.adicionarCandidato(candidato1);
        concurso.adicionarCandidato(candidato2);
        concurso.adicionarCandidato(candidato3);
        concurso.adicionarCandidato(candidato4);
        concurso.adicionarCandidato(candidato5);
      
        // Sort using insertion sort
        concurso.definirOrdenador(new Inserção());
        tempoInicial = System.nanoTime();
        concurso.ordenar();
        tempoFinal = System.nanoTime();
        System.out.println("\nCandidatos ordenados por \"inserção\" (em " + (tempoFinal - tempoInicial) + " nanosegundos):");
        concurso.printCandidatos();


        concurso = new Concurso(); // reinicia a variável concurso para o próximo ordenador
        candidato1 = new Candidato("12345678901", 7.5);
        candidato2 = new Candidato("98765432101", 8.0);
        candidato3 = new Candidato("01234567890", 6.5);
        candidato4 = new Candidato("90817263645", 5.5);
        candidato5 = new Candidato("81723263645", 7.0);
        concurso.adicionarCandidato(candidato1);
        concurso.adicionarCandidato(candidato2);
        concurso.adicionarCandidato(candidato3);
        concurso.adicionarCandidato(candidato4);
        concurso.adicionarCandidato(candidato5);

        // Sort using seletion sort
        concurso.definirOrdenador(new Seleção());
        tempoInicial = System.nanoTime();
        concurso.ordenar();
        tempoFinal = System.nanoTime();
        System.out.println("\nCandidatos ordenados por \"seleção\" (em " + (tempoFinal - tempoInicial) + " nanosegundos):");
        concurso.printCandidatos();
        
    }
}