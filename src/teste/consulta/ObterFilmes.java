package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.heranca.Aluno;
import teste.muitospramuitos.Ator;
import teste.muitospramuitos.Filme;

public class ObterFilmes {
	
	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);
		
		System.out.println(filmes.size());
		for (Filme filme : filmes) {
			System.out.println(filme.getNome() + " => " + filme.getNota());
			
			for (Ator ator : filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
		
		DAO<Aluno> daoAluno = new DAO<>(Aluno.class);
		List<Aluno> alunos = daoAluno.consultar("nomeDosAlunos", "nome", "João", "matricula", 345L);
		System.out.println(alunos.size());
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
	
		
	}

}
	