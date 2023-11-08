package com.salao.atendimento.entity;

import com.salao.atendimento.record.ServicesRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "services")
@Table(name = "services")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    public Services(ServicesRequestDTO servicesRequestDTO) {
        this.name = servicesRequestDTO.name();
        this.description = servicesRequestDTO.description();
        this.price = servicesRequestDTO.price();
        this.imgUrl = servicesRequestDTO.imgUrl();
    }
}
