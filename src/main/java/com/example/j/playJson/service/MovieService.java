package com.example.j.playJson.service;

import com.example.j.playJson.domain.ActorJackson;
import com.example.j.playJson.domain.Movie;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  public Movie getOneMovie() {
    List<ActorJackson> actors = new ArrayList<>();
    actors.add(ActorJackson.builder()
        .imdbId("nm2199632")
        .dateOfBirth("01/01/1990")
        .filmography(Arrays.asList("Apocalypto","Beatdown","Wind Walkers"))
        .build());
    return Movie.builder()
        .imdbId("tt0472043")
        .director("Mel Gibson")
        .actors(actors)
        .build();
  }
}
