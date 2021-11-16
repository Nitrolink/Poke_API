package com.Foundry.pokeGateway;

import com.Foundry.pokeGateway.pokemon.*;
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
    private final String refURL = "http://127.0.0.1:3001/";

    private APOD apod;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
                apod = restTemplate.getForObject(NASA_API + System.getenv("NASA_API_KEY"), APOD.class);
        };
    }

    @GetMapping("/")
    public String rootRoute(){
        return "Welcome Home";
    }

    @GetMapping(value = "apod/date/{date}")
    public String dateChange(@PathVariable String date, RestTemplate restTemplate){
        apod = restTemplate.getForObject(NASA_API + System.getenv("NASA_API_KEY")+ "&date=" + date, APOD.class);
        return "Date Changed to " + date;
    }

    @GetMapping("/apod")
    public APOD apod() {
        return apod;

    }
    @GetMapping("/pokemon/{id}")
    public Pokemon poke(@PathVariable String id, RestTemplate restTemplate) {
        Pokemon poke = restTemplate.getForObject(POKE_API + "/pokemon/" +id, Pokemon.class);
        for (PokemonAbility abil: poke.getAbilities()) {
            String[] strSplit = abil.getAbility().getUrl().split("/");
            String newURL = refURL + "ability/" + strSplit[strSplit.length - 1];
            abil.getAbility().setUrl(newURL);
        }
        for (NamedAPIResource form: poke.getForms()) {
            String[] strSplit = form.getUrl().split("/");
            String newURL = refURL + "pokemon-form/" + strSplit[strSplit.length - 1];
            form.setUrl(newURL);
        }
        for (PokemonType type : poke.getTypes()) {
            String[] strSplit = type.getType().getUrl().split("/");
            String newURL = refURL + "type/" + strSplit[strSplit.length - 1];
            type.getType().setUrl(newURL);
        }
        return poke;
    }

    @GetMapping("/ability/{id}")
    public Ability ability(@PathVariable String id, RestTemplate restTemplate){
        Ability abil = restTemplate.getForObject(POKE_API + "/ability/" + id ,Ability.class);
        return abil;
    }

    @GetMapping("/pokemon-form/{id}")
    public PokemonForm pokeform(@PathVariable String id, RestTemplate restTemplate){
        PokemonForm form = restTemplate.getForObject(POKE_API + "/pokemon-form/" + id ,PokemonForm.class);
        for (PokemonFormType ftype : form.getTypes()) {
            String[] strSplit = ftype.getType().getUrl().split("/");
            String newURL = refURL + "type/" + strSplit[strSplit.length - 1];
            ftype.getType().setUrl(newURL);
        }
        return form;
    }

    @GetMapping("/type/{id}")
    public Type type(@PathVariable String id, RestTemplate restTemplate){
        Type type = restTemplate.getForObject(POKE_API + "/type/" + id ,Type.class);
        return type;
    }
}
