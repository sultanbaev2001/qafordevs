package sfera.qafordevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sfera.qafordevs.entity.DeveloperEntity;

import java.util.List;

public interface DeveloperRepository extends JpaRepository<Integer, DeveloperEntity> {

    DeveloperEntity findByEmail(String email);

    @Query(value = "select d from Developer d where d.status='ACTIVE' and d.specialty = ?1")
    List<DeveloperEntity> findAllActiveDevelopersBySpecialty(String specialty);

}
