package api.pedidos.clientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import api.pedidos.clientes.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
