package app.repository;

import app.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat, Long> {

    List<Cat> findTop10ByOrderByVotesDesc();
}
