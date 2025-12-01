package com.info.moodtrack.service.habito;

import com.info.moodtrack.dto.habito.HabitoCreateDto;
import com.info.moodtrack.dto.habito.HabitoDto;
import com.info.moodtrack.model.Habito;
import com.info.moodtrack.mapper.HabitoMapper;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.info.moodtrack.repository.habito.HabitoRepository;
import org.springframework.stereotype.Service;


@Service
public class HabitoServiceImpl implements HabitoService {

    private HabitoRepository habitoRepository;

    @Autowired
    public HabitoServiceImpl(HabitoRepository habitoRepository) {
        this.habitoRepository = habitoRepository;
    }

    @Override
    public HabitoDto crearHabito(HabitoCreateDto habitoCreateDto) {
       Habito habito = HabitoMapper.toEntity(habitoCreateDto);
       habito = habitoRepository.save(habito);
        return HabitoMapper.toDto(habito);
    }

    @Override
    public Optional <HabitoDto> obtenerPorId(Long id) {
        Optional <Habito> habito = habitoRepository.findById(id);
        if (habito.isPresent()) {
            Habito habitoEntity = habito.get();
            return  Optional.of(HabitoMapper.toDto(habitoEntity));
        } 
            return Optional.empty(); 
           
    }

    

    

}
