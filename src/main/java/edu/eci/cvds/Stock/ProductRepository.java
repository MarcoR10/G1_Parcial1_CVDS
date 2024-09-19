package edu.eci.cvds.Stock;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByName(@Param("name") String name);
}
