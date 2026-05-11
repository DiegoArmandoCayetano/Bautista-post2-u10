package com.universidad.productos_service.service;

import com.universidad.productos_service.domain.Producto;
import com.universidad.productos_service.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductoService {

    private final ProductoRepository repo;

public ProductoService(ProductoRepository repo) {
    this.repo = repo;
}




    public Producto procesarProducto(String n,
                                     Double p,
                                     Integer s) {

        Producto producto = new Producto();

        if (n == null || n.isBlank()) {
            throw new IllegalArgumentException("nombre requerido");
        }

        if (p == null) {

            throw new IllegalArgumentException("precio requerido");

        } else if (p <= 0) {

            throw new IllegalArgumentException("precio invalido");

        } else if (p > 999999) {

            throw new IllegalArgumentException("precio excesivo");
        }

        if (s == null || s < 0) {
            throw new IllegalArgumentException("stock invalido");
        }

        producto.setNombre(n);
        producto.setPrecio(p);
        producto.setStock(s);

        return repo.save(producto);
    }

    public List<Producto> listar() {
        return repo.findAll();
    }

    public Producto buscar(Long id) {
        return repo.findById(id)
    .orElseThrow(() -> new NoSuchElementException("Producto no encontrado: " + id));
    }
}