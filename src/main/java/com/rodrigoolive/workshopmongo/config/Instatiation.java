package com.rodrigoolive.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.rodrigoolive.workshopmongo.domain.Post;
import com.rodrigoolive.workshopmongo.domain.User;
import com.rodrigoolive.workshopmongo.repository.PostRepository;
import com.rodrigoolive.workshopmongo.repository.UserRepository;

@Configuration
public class Instatiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        // Configuração do formato de data
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Limpa os dados existentes no banco
        userRepository.deleteAll();
        postRepository.deleteAll();

        // Cria usuários
        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        // Cria posts
        Post post1 = new Post(null, sdf.parse("01/04/2024"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
        Post post2 = new Post(null, sdf.parse("02/03/2024"), "Bom dia", "Acordei feliz hoje!", maria);

        // Salva os usuários no banco
        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        // Salva os posts no banco
        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
