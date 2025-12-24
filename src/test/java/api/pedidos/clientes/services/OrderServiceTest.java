package api.pedidos.clientes.services;

import api.pedidos.clientes.entities.Order;
import api.pedidos.clientes.repositories.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderService orderService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnAllOrders() {
        Order o1 = new Order(1L, null, null, null);
        Order o2 = new Order(2L, null, null, null);

        when(orderRepository.findAll()).thenReturn(Arrays.asList(o1, o2));

        List<Order> result = orderService.findAll();

        assertEquals(2, result.size());
        verify(orderRepository, times(1)).findAll();
    }

    @Test
    void shouldReturnOrderById() {
        Order order = new Order(1L, null, null, null);
        when(orderRepository.findById(1L)).thenReturn(Optional.of(order));

        // Act
        Order result = orderService.findById(1L);

        // Assert
        assertNotNull(result);
        assertEquals(order, result);
        verify(orderRepository, times(1)).findById(1L);
    }

    @Test
    void shouldThrowExceptionWhenOrderNotFound() {
        when(orderRepository.findById(999L)).thenReturn(Optional.empty());

        assertThrows(java.util.NoSuchElementException.class, () -> {
            orderService.findById(999L);
        });

        verify(orderRepository, times(1)).findById(999L);
    }
}

