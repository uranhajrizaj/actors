package com.hmdb.actors;

import java.util.ArrayList;

public class Actor {
    public static ArrayList<Actor> actors= new ArrayList<>();
    
    public static Integer count = 0;
    
    public Integer id;
    public String name;
    public String lastname;
    public String birthday;
    public Integer movieId;
     

    static{
        new Actor(1,"Pet","Doe","01.02.1995",1);
        new Actor(2,"James","Smith","07.05.1998",1);
        new Actor(3,"Peter","Bob","01.02.1990",2);
        new Actor(4,"Will","Doe","01.06.1992",2);
    }

    public Actor(Integer id,String name,String lastname,String birthday, Integer movieId){
        this.id = count++;
        this.name=name;
        this.lastname=lastname;
        this.birthday=birthday;
        this.movieId=movieId;

        Actor.actors.add(this);

    }
}
