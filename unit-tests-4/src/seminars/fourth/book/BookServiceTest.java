package seminars.fourth.book;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    private BookService bookService;
    private BookRepository bookRepositoryMock;

    @BeforeEach
    void setUp(){

    // создаём мок-объект для BookRepository
        bookRepositoryMock = mock (BookRepository.class);
    // передаём mok - объект
        bookService = new BookService(bookRepositoryMock);
    }
    @AfterEach
    void tearDown(){
        bookService = null;
    }

    @Test
    @DisplayName("Проверяем метод поиска книги по id")
    void testFindBookById() {
        // настройка mock - объекта
        when(bookRepositoryMock.findById("123"))
                .thenReturn(new Book("123", "TestBook", "TestAuthor"));
        // вызываем тестируемый метод
        Book result = bookService.findBookById("123");
        // проверяем утверждения

        assertEquals("TestBook", result.getTitle());
        assertEquals("TestAuthor", result.getAuthor());
    }
    @Test
    @DisplayName("Проверяем метод поиска книг из нашего списка")
    void testFindAllBooks() {
        // настройка mock - объекта
        when(bookRepositoryMock.findAll())
                .thenReturn(List.of(new Book("123", "TestBook", "TestAuthor")));
        // вызываем тестируемый метод
        List<Book> result = bookService.findAllBooks();
        // проверяем утверждения
        assertEquals(1, result.size());
        assertEquals("TestBook", result.get(0).getTitle());
        assertEquals("TestAuthor", result.get(0).getAuthor());
    }

}
