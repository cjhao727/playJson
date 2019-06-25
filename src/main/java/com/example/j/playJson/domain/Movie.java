package com.example.j.playJson.domain;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movie {
  private String imdbId;
  private String director;
  private List<ActorJackson> actors;
}
