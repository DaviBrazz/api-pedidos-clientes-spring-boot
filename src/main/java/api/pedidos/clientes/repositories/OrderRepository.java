package api.pedidos.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import api.pedidos.clientes.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

}
