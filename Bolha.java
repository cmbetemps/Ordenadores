//import java.util.ArrayList;
import java.util.List;

class Bolha implements Ordenador {

		public void ordenar(Concurso concurso) {
				boolean swapped=false;
				List<Candidato> candidatos = concurso.getCandidatos();
				for (int i = 0; i < candidatos.size() - 1; i++) {
					for (int j = 0; j < candidatos.size() - i - 1; j++) {
						//System.out.println(""+candidatos.get(j).getNota()+" <-> " + candidatos.get(j + 1).getNota());
						if (candidatos.get(j).getNota() < candidatos.get(j + 1).getNota()) {
							Candidato temp = candidatos.get(j);
							candidatos.set(j,candidatos.get(j + 1));
							candidatos.set(j + 1,temp);
							swapped=true;
						}
						//concurso.printCandidatos();
					}
					if (swapped == false) break;
				}
		}
}