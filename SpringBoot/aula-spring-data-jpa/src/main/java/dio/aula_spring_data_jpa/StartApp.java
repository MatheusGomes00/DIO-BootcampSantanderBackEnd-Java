package dio.aula_spring_data_jpa;

import dio.aula_spring_data_jpa.model.UserEntity;
import dio.aula_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        UserEntity user = new UserEntity();
        user.setName("Matheus");
        user.setUsername("gomes");
        user.setPassword("1234");


        repository.save(user);

        for(UserEntity u: repository.findAll()){
            System.out.println(u);
        }
    }
}
