package com.info.moodtrack.service.habito;

import com.info.moodtrack.dto.habito.HabitoCreateDto;
import com.info.moodtrack.dto.habito.HabitoDto;
import java.util.Optional;

public interface HabitoService {

    HabitoDto crearHabito(HabitoCreateDto habitoCreateDto);
    Optional <HabitoDto> obtenerPorId(Long id);
}
