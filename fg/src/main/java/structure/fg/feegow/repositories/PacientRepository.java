package structure.fg.feegow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import structure.fg.feegow.Entities.Pacient;

public interface PacientRepository extends JpaRepository<Pacient, Long> {
}
