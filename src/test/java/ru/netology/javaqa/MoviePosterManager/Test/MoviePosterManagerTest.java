package ru.netology.javaqa.MoviePosterManager.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.MovieItem.MovieItem;
import ru.netology.javaqa.MoviePosterManager.MoviePosterManager;

public class MoviePosterManagerTest {
    MovieItem item1 = new MovieItem(1, "Бладшот");
    MovieItem item2 = new MovieItem(2, "Вперед");
    MovieItem item3 = new MovieItem(3, "Отель Белград");
    MovieItem item4 = new MovieItem(4, "Джентельмены");
    MovieItem item5 = new MovieItem(5, "Человек-невидимка");
    MovieItem item6 = new MovieItem(6, "Тролли. Мировой тур");
    MovieItem item7 = new MovieItem(7, "Номер один");
    MovieItem item8 = new MovieItem(8, "Отель «Гранд Будапешт»");
    MovieItem item9 = new MovieItem(9, "Сквозь снег");
    MovieItem item10 = new MovieItem(10, "Криминальное чтиво");
    MovieItem item11 = new MovieItem(11, "Помни");
    MovieItem item12 = new MovieItem(12, "Зеленая книга");

//    MoviePosterManager movieM = new MoviePosterManager(12);

    @Test
    public void FindAllMoveStandartAfisha() {
        MoviePosterManager movieM = new MoviePosterManager(12);
        movieM.addNew(item1);
        movieM.addNew(item2);
        movieM.addNew(item3);
        movieM.addNew(item4);
        movieM.addNew(item5);

        MovieItem[] expected = {item1, item2, item3, item4, item5};
        MovieItem[] actual = movieM.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addNewFilm() {
        MoviePosterManager movieM = new MoviePosterManager();
        movieM.addNew(item1);
        movieM.addNew(item2);
        movieM.addNew(item3);
        movieM.addNew(item4);
        movieM.addNew(item5);
        movieM.addNew(item6);
        movieM.addNew(item7);

        MovieItem[] expected = {item1, item2, item3, item4, item5, item6, item7};
        MovieItem[] actual = movieM.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilmsOverLimit() {
        MoviePosterManager movieM = new MoviePosterManager(5);
        movieM.addNew(item1);
        movieM.addNew(item2);
        movieM.addNew(item3);
        movieM.addNew(item4);
        movieM.addNew(item5);
        movieM.addNew(item6);
        movieM.addNew(item7);
        movieM.addNew(item8);
        movieM.addNew(item9);
        movieM.addNew(item10);
        movieM.addNew(item11);
        movieM.addNew(item12);

        MovieItem[] expected = {item12, item11, item10, item9, item8};
        MovieItem[] actual = movieM.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastMoviesUnderTheLimit() {
        MoviePosterManager movieM = new MoviePosterManager(5);
        movieM.addNew(item1);
        movieM.addNew(item2);
        movieM.addNew(item3);
        movieM.addNew(item4);


        MovieItem[] expected = {item4, item3, item2, item1};
        MovieItem[] actual = movieM.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
