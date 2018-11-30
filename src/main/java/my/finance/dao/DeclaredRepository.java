package my.finance.dao;

import my.finance.domain.Declared;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeclaredRepository extends JpaRepository<Declared, Long> {
}
