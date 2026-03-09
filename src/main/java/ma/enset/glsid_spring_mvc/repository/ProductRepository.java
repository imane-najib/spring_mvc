package ma.enset.glsid_spring_mvc.repository;

import ma.enset.glsid_spring_mvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByNameContainsIgnoreCase(String Name);
}
