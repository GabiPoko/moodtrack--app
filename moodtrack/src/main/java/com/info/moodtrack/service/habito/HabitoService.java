package com.info.moodtrack.service.habito;

import com.info.moodtrack.dto.habito.HabitoCreateDto;
import com.info.moodtrack.dto.habito.HabitoDto;

public interface HabitoService {

    HabitoDto crearHabito(HabitoCreateDto habitoCreateDto);
}
