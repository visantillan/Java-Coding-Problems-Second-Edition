package com.bookstore;

import com.bookstore.jdbcTemplate.dto.AuthorDto;

import java.util.List;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {

            List<AuthorDto> authors = bookstoreService.fetchAuthorsWithBooksViaJdbcTemplateToDto();

            System.out.println("Number of authors:" + authors.size());

            for (AuthorDto author : authors) {
                System.out.println("Author name: " + author.name()
                        + " | Age: " + author.age() + " | Books: " + author.books());
            }
        };
    }
}
