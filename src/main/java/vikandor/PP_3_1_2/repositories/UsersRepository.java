package vikandor.PP_3_1_2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vikandor.PP_3_1_2.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
}
