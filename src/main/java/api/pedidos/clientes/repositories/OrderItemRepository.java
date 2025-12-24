package api.pedidos.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import api.pedidos.clientes.entities.OrderItem;
import api.pedidos.clientes.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}