package cs425.mediaStream.BadWords.repository;

import cs425.mediaStream.BadWords.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByEmail(String email);
}
