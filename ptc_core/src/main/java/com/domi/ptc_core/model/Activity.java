package com.domi.ptc_core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table
public class Activity {

    @Id
    @Column(nullable = false)
    private String uid;

    private String name;

}
