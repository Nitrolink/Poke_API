package com.Foundry.pokeGateway;

import com.Foundry.pokeGateway.pokemon.Pokemon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PokeGatewayController {
    private final String NASA_API = "https://api.nasa.gov/planetary/apod/?api_key=";
    private final String POKE_API = "https://pokeapi.co/api/v2";
    private final String NASA_API_KEY="SYbbgZhoTZxJIn1ZOdkabDbpGdYnh2PR97Sgpoww";

    private APOD apod;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
                apod = restTemplate.getForObject(NASA_API + NASA_API_KEY, APOD.class);
        };
    }

    @GetMapping("/")
    public String rootRoute(){
        return "Welcome Home";
    }

    @GetMapping(value = "date/{date}")
    public String dateChange(@PathVariable String date, RestTemplate restTemplate){
        apod = restTemplate.getForObject(NASA_API + NASA_API_KEY+ "&date=" + date, APOD.class);
        return "Date Changed to " + date;
    }

    @GetMapping("/apod")
    public Object apod() {
        return apod;

    }
    @GetMapping("/pokemon/{id}")
    public Object poke(@PathVariable String id, RestTemplate restTemplate) {
        Pokemon poke = restTemplate.getForObject(POKE_API + id, Pokemon.class);
        return poke;
    }

}
