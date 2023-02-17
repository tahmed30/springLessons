package tahmed30.springLessons.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Set;

/**   created for my Spring Boot lesson Tariku **/

@Entity
public class Author {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String firstName;
     private String lastName;

     public Long getId() {
          return id;
     }

     @ManyToMany(mappedBy = "authors" )
     private Set<Book> books;

     public Set<Book> getBooks() {
          return books;
     }

     public void setBooks(Set<Book> books) {
          this.books = books;
     }

     public void setId(Long id) {
          this.id = id;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }
}