package br.com.restaurantefood.pagamentos.repository;

import br.com.restaurantefood.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
