package dio.aula_spring_data_jpa.repository;

import dio.aula_spring_data_jpa.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
