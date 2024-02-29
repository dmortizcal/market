package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(Long idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Long cantidadStock, boolean estado);
}
