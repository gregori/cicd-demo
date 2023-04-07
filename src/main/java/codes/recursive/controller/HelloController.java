package codes.recursive.controller;

import io.micronaut.http.annotation.*;

@Controller("/hello")
public class HelloController {

    @Get(produces="text/plain")
    public String index() {
        return "Example Response";
    }
}