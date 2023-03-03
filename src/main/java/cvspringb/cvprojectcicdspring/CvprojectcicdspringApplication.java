package cvspringb.cvprojectcicdspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CvprojectcicdspringApplication {
	@GetMapping("welcome")
	public String getMessage(){
		return "Bienvenue a vous";
	}
	public static void main(String[] args) {
		SpringApplication.run(CvprojectcicdspringApplication.class, args);
	}

}
