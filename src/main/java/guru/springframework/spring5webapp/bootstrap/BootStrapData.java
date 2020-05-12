package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner
{
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepositor;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepositor, PublisherRepository publisherRepository)
    {
        this.authorRepository = authorRepository;
        this.bookRepositor = bookRepositor;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("---------------Started in Bootstrap------------------");
        Publisher pub = new Publisher("Klonowa", "Katowice", "Slaskie", "40-175");
        publisherRepository.save(pub);
        System.out.println("Publisher count: " + publisherRepository.count());

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Drive Desing", "1234ssd");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(pub);
        pub.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepositor.save(ddd);
        publisherRepository.save(pub);//save again as i changed it


        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE", "1124sds");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(pub);
        pub.getBooks().add(noEJB);


        authorRepository.save(rod);
        bookRepositor.save(noEJB);
        publisherRepository.save(pub);


        System.out.println("books assinged to Publisher: " + pub.getBooks().size());

        System.out.println(" ++++++++Number of books: "+ bookRepositor.count());

    }
}
