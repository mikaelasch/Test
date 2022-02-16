package hh.swd20.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.bookstore.domain.Book;
import hh.swd20.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {return (args) -> {
	 Book b = new Book ("1000 Years of Joys and Sorrows"," Ai Weiwei", "2019", "124-245-22", "29,99");
	 Book b1 = new Book ("Acts of Desperation","Megan Nolan", "2020", "624-255-22", "49,99");
	 Book b2 = new Book ("Afterparties","Anthony Veasna So", "2021", "324-275-22", "19,99");
	
	 repository.save(b);
	 repository.save(b1);
	 repository.save(b2);
	
	
	};
	}
}
