package br.com.restaurantefood.pagamentos.client;

import br.com.restaurantefood.pagamentos.model.ItemPedido;
import br.com.restaurantefood.pagamentos.model.Pedido;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("pedidos-ms")
public interface PedidoClient {
    @RequestMapping(method = RequestMethod.PUT, value = "/pedidos/{id}/pago")
    void atualizaPagamento(@PathVariable Long id);

    @RequestMapping(method = RequestMethod.GET, value = "/pedidos/{id}")
    Pedido obterItensPedido(@PathVariable Long id);
}
