package com.hmdb.actors;

import java.util.ArrayList;

public class Movie {
  public static ArrayList<Movie> movies= new ArrayList<>();

  public static Integer count = 0;
  
    public Integer id;
    public String title;
    public String description;
    public Integer  year;

    static{
        new Movie(1, "Title 1", "Description1", 2020);
        new Movie(2, "Title 2", "Description2", 2022);
    }
   
    public Movie(Integer id,  String title, String description, Integer  year){
        this.id = count++;
        this.title=title;
        this.description=description;
        this.year =year;

        Movie.movies.add(this);
        
    }

    public ArrayList<Actor> getAllActors() {
        ArrayList<Actor> movieActors = new ArrayList<>();
   
        for (Actor actor : Actor.actors) {
            if (actor.movieId == this.id) {
                movieActors.add(actor);    
            }
        }
         
        return movieActors;
    }
}
