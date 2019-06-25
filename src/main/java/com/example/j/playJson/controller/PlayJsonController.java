package com.example.j.playJson.controller;


import com.example.j.playJson.domain.Movie;
import com.example.j.playJson.service.MovieService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/play")
public class PlayJsonController {
  @Autowired
  private MovieService movieService;

  @RequestMapping(method = RequestMethod.GET)
  public String hi() {
    return "Hi Jojo!";
  }

  @RequestMapping(value = "/movie", method = RequestMethod.GET)
  public Movie movie() {
    return movieService.getOneMovie();
  }

  @RequestMapping(value = "/mapping", method = RequestMethod.GET)
  public String mapping() {
    Map<String, String> map = new HashMap<>();
    map.put("key", "value");

    ObjectMapper mapper = new ObjectMapper();
    try {
      return mapper.writerWithDefaultPrettyPrinter()
          .writeValueAsString(map);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }

    return "";
  }
}
