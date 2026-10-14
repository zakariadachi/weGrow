package ma.wegrow.repository;
 import ma.wegrow.model.Departement;
 import org.springframework.data.jpa.repository.JpaRepository;
 import java.util.Optional;
public interface DepartementRepository extends JpaRepository<Departement, Long> {
 Optional<Departement> findByNom(String nom);
}
