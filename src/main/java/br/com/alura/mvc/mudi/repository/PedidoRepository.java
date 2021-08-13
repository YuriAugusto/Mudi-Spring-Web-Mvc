package br.com.alura.mvc.mudi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import br.com.alura.mvc.mudi.model.Pedido;

@Repository//faz com que o Spring crie instâncias da classe toda vez que alguém injetar a dependência
public class PedidoRepository {
	
	@PersistenceContext//injeção de dependência
	private EntityManager entityManager;//usado pela JPA
	
	public List<Pedido> recuperaTodosOsPedidos(){
		Query query = entityManager.createQuery("SELECT p FROM Pedido p", Pedido.class);
		return query.getResultList();
	}

}
