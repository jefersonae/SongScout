package br.alura.songscout;

import br.alura.songscout.principal.Principal;
import br.alura.songscout.repository.ArtistaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SongScoutApplication implements CommandLineRunner {

	private ArtistaRepository repositorio;
	public static void main(String[] args) {
		SpringApplication.run(SongScoutApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
