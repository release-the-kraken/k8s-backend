package rtk.k8s_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rtk.k8s_app.model.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, Integer>{
}