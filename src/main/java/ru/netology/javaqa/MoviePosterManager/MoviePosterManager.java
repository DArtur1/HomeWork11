package ru.netology.javaqa.MoviePosterManager;

import ru.netology.javaqa.MovieItem.MovieItem;

public class MoviePosterManager {
    private MovieItem[] kinoAfisha = new MovieItem[0];
    private int kinoAfishaLimitLength;

    public MoviePosterManager(){
        this.kinoAfishaLimitLength = 5;
    }
    public MoviePosterManager(int kinoAfishaLimitLength){
        this.kinoAfishaLimitLength = kinoAfishaLimitLength;
    }
    public void addNew(MovieItem item){
        MovieItem[] tmp = new MovieItem[kinoAfisha.length + 1];
        for(int i =0; i < kinoAfisha.length; i++){
            tmp[i] = kinoAfisha[i];
        }
        tmp[tmp.length - 1] = item;
        kinoAfisha = tmp;
    }
    public MovieItem[] findAll(){
        return kinoAfisha;
    }

    public MovieItem[] findLast(){
        int resultLenght;
        if (kinoAfisha.length < kinoAfishaLimitLength){
            resultLenght = kinoAfisha.length;
        } else{
            resultLenght = kinoAfishaLimitLength;
        }
        MovieItem[] revers = new MovieItem[resultLenght];
        for(int i = 0; i < revers.length; i++){
            revers[i] = kinoAfisha[kinoAfisha.length - 1 - i];
        }
        return revers;
    }

}
