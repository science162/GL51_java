package gl51.projet.java;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/student")
public class StudentController {

    @Get("/")
    public Student index() {
        return new Student("Mouaffo", "Albert");
    }
    }