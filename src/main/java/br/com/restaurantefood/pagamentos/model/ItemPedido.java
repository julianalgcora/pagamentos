package br.com.restaurantefood.pagamentos.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedido {
    private Long id;
    private Integer quantidade;
    private String descricao;
}
