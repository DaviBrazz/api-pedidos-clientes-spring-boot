package api.pedidos.clientes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.pedidos.clientes.entities.Product;
import api.pedidos.clientes.repositories.ProductRepository;

@Service
public class ProductService {
    
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() { 
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
