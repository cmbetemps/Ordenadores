import java.util.List;

class Seleção implements Ordenador{
	public void ordenar(Concurso concurso){
		List<Candidato> candidatos = concurso.getCandidatos();
		int n = candidatos.size();
		for (int i = 0; i < n - 1; i++){
				int min_idx = i;
				for (int j = i+1; j < n; j++)
						if (candidatos.get(j).getNota() > candidatos.get(min_idx).getNota())
								min_idx = j;
				Candidato temp = candidatos.get(min_idx);
				candidatos.set(min_idx, candidatos.get(i));
				candidatos.set(i, temp);
		}
	}
}