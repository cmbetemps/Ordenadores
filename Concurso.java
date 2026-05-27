import java.util.ArrayList;
import java.util.List;
class Concurso {
		private List<Candidato> candidatos;
		private Ordenador ordenador;
		public Concurso() {
				candidatos = new ArrayList<Candidato>();
				definirOrdenador(new Bolha());
		}
		public void definirOrdenador(Ordenador ordenador){
			this.ordenador = ordenador;
		}
		public void ordenar(){
			this.ordenador.ordenar(this);
		}
	
		public void adicionarCandidato(Candidato candidato) {
				candidatos.add(candidato);
		}

		public List<Candidato> getCandidatos() {
				return candidatos;
		}
		public void printCandidatos(){
			System.out.print("[");
			for(Candidato candidato : candidatos){
				System.out.print("(CPF: " + candidato.getCpf() + ", Nota: " + candidato.getNota()+ ") ");
			}
			System.out.println("]");
		}
}