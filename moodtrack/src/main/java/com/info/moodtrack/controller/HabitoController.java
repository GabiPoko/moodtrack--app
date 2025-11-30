package com.info.moodtrack.controller;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.info.moodtrack.dto.habito.HabitoCreateDto;
import com.info.moodtrack.dto.habito.HabitoDto;
import com.info.moodtrack.service.habito.HabitoService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/v1/habitos")

public class HabitoController {

    private final HabitoService habitoService;

    @Autowired
    public HabitoController(HabitoService habitoService) {
        this.habitoService = habitoService;
    }

    @PostMapping
    public ResponseEntity <HabitoDto> createHabito(
        @RequestBody HabitoCreateDto habitoCreateDto){
        HabitoDto habitoCreado = habitoService.crearHabito(habitoCreateDto);
        return ResponseEntity.ok(habitoCreado);
        }
    

}
