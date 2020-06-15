package cs425.mediaStream.BadWords.repository;

import cs425.mediaStream.BadWords.domain.DirtyWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DirtyWordRepository extends JpaRepository<DirtyWord, Integer>{
	
	public List<DirtyWord> findAll();
}
