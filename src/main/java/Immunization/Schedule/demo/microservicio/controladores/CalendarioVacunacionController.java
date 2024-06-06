package Immunization.Schedule.demo.microservicio.controladores;

import Immunization.Schedule.demo.microservicio.modelos.VacunaDTO;
import Immunization.Schedule.demo.microservicio.servicios.CalendarioVacunacionService;
import Immunization.Schedule.demo.microservicio.modelos.User;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CalendarioVacunacionController {

    @Autowired
    private CalendarioVacunacionService calendarioVacunacionService;

    @PostMapping("/calendario-vacunacion")
    public ResponseEntity<?> generarCalendarioVacunacion(@RequestBody User usuario) throws MessagingException {
        List<VacunaDTO> vacunasRecomendadas = calendarioVacunacionService.generarCalendarioVacunacion(usuario);
        return ResponseEntity.status(HttpStatus.OK).body(vacunasRecomendadas);
    }

    @GetMapping("/calendario-vacunacion")
    public ResponseEntity<?> generarCalendarioVacunacion1() throws MessagingException {
        return ResponseEntity.status(HttpStatus.OK).body("hola");
    }
}