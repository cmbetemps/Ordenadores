//import java.util.ArrayList;
import java.util.List;

class Inserção implements Ordenador {
		public void ordenar(Concurso concurso) {
				List<Candidato> candidatos = concurso.getCandidatos();
				for (int i = 1; i < candidatos.size(); i++) {
						Candidato key = candidatos.get(i);
						int j = i - 1;
						while (j >= 0 && key.getNota() > candidatos.get(j).getNota()) {
								candidatos.set(j + 1, candidatos.get(j));
								j--;
						}
						candidatos.set(j + 1, key);
				}
		}
}