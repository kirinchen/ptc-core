package com.domi.ptc_core.model;

import jakarta.persistence.*;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table
public class Reward {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;
}
