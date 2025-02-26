package kodlama.io.rentacar.repository;

import kodlama.io.rentacar.entities.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, Integer> {
    //    @Nonnull
//    Maintenance findById(int id);
    Maintenance findMaintenanceByCarIdAndIsCompletedFalse(int carId);

    boolean existsByCarIdAndIsCompletedIsFalse(int carId);
}
