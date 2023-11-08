package com.salao.atendimento.controller;

import com.salao.atendimento.entity.Services;
import com.salao.atendimento.record.ServicesRequestDTO;
import com.salao.atendimento.record.ServicesResponseDTO;
import com.salao.atendimento.repository.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agendamento")
public class SchedulingController {

    @Autowired
    private ServicesRepository servicesRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<ServicesResponseDTO> getAll(){
        return servicesRepository.findAll().stream().map(ServicesResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveService(@RequestBody ServicesRequestDTO servicesRequestDTO){
        Services services = new Services(servicesRequestDTO);
        servicesRepository.save(services);

    }


}
