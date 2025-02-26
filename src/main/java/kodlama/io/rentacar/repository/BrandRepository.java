package kodlama.io.rentacar.repository;

import kodlama.io.rentacar.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// CRUD operations
@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
    boolean existsByNameIgnoreCase(String name);
}
