package com.teste.springbootBackend;

import com.teste.springbootBackend.model.User;
import com.teste.springbootBackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

        @Autowired
        private UserRepository userRepository;
        
        @Override
        public void run(String... args) throws Exception {
            this.userRepository.save(new User("Ana", "Green", "ana@gmail.com"));
            this.userRepository.save(new User("Bob", "Blue", "bob@gmail.com"));
            this.userRepository.save(new User("Alex", "Orange", "alex@gmail.com"));
        }

}
