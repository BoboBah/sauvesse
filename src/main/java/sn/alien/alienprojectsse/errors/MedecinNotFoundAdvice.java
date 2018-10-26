package sn.alien.alienprojectsse.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MedecinNotFoundAdvice {


    @ResponseBody
    @ExceptionHandler(MedecinNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)

    String MendecinNotFoundHandler(MedecinNotFoundException e)
    {


        return e.getMessage();
    }
}
