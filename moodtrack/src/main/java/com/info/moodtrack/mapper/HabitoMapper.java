package com.info.moodtrack.mapper;

import com.info.moodtrack.dto.habito.HabitoCreateDto;
import com.info.moodtrack.model.Habito;
import java.util.List;
import com.info.moodtrack.dto.habito.HabitoDto;

public final class HabitoMapper {

    private HabitoMapper() {
    }


    public static HabitoDto toDto(Habito habito) {
        if (habito == null) return null;
        
        HabitoDto habitoDto = new HabitoDto();
        habitoDto.setId(habito.getId());
        habitoDto.setDescripcion(habito.getDescripcion());
        return habitoDto;
    }


    public static Habito toEntity(HabitoCreateDto habitoCreateDto) {
        if (habitoCreateDto == null) return null;
        
        Habito habito = new Habito();
        habito.setDescripcion(habitoCreateDto.getDescripcion());
        habito.setEntradas(List.of());
        //habito.getNivelDeImportanciaEnum()
        return habito; 
        
    }

}
