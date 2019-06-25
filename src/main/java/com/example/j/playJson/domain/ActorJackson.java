package com.example.j.playJson.domain;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ActorJackson {
  private String imdbId;
  private String dateOfBirth;
  private List<String> filmography;
}
