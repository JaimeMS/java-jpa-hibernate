package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio-jpa");
		EntityManager em =  emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 1L);
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
		
	}

}
