package saude.api.api.repository;

import saude.api.api.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {

}