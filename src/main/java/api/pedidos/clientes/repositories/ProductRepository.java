package api.pedidos.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import api.pedidos.clientes.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

}
