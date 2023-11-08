package com.salao.atendimento.record;

import com.salao.atendimento.entity.Services;

public record ServicesResponseDTO(Long id, String name, String description, Double price, String imgUrl) {
    public ServicesResponseDTO(Services entity){
        this(entity.getId(), entity.getName(), entity.getDescription(), entity.getPrice(), entity.getImgUrl());
    }
}
