import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.javaqa.MovieManager;

public class MovieManagerTest {

    @Test
    public void addNothing() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOne() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie1");
        String[] expected = {"Movie1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSeveral() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie1");
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie10");
        manager.addMovie("Movie11");
        manager.addMovie("Movie123");
        manager.addMovie("Movie999");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie10", "Movie11", "Movie123", "Movie999"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFiveForLast() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie1");
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie10");
        manager.addMovie("Movie11");


        String[] expected = {"Movie11", "Movie10", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addThreeForLast() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie10");


        String[] expected = {"Movie10", "Movie3", "Movie2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSixForLast() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Movie1");
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie10");
        manager.addMovie("Movie11");
        manager.addMovie("Movie123");

        String[] expected = {"Movie123", "Movie11", "Movie10", "Movie3", "Movie2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addSevenForLast() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie("Movie1");
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie10");
        manager.addMovie("Movie11");
        manager.addMovie("Movie123");
        manager.addMovie("Movie999");

        String[] expected = {"Movie999", "Movie123", "Movie11", "Movie10", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoreThanLimit() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie("Movie1");
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie10");
        manager.addMovie("Movie11");
        manager.addMovie("Movie123");
        manager.addMovie("Movie999");
        manager.addMovie("Movie1999");

        String[] expected = {"Movie1999", "Movie999", "Movie123", "Movie11", "Movie10", "Movie3", "Movie2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addLessThanLimit() {
        MovieManager manager = new MovieManager(7);
        manager.addMovie("Movie1");
        manager.addMovie("Movie2");
        manager.addMovie("Movie3");
        manager.addMovie("Movie10");
        manager.addMovie("Movie11");
        manager.addMovie("Movie123");

        String[] expected = {"Movie123", "Movie11", "Movie10", "Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
