package br.com.alura.mvc.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.alura.mvc.mudi.model.Pedido;

@Repository//faz com que o Spring gerencie essa interface
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
}
