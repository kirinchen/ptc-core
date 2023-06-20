package com.domi.ptc_core.model;


import jakarta.persistence.*;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table
public class MissionReward {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer rewardId;
    private String missionUid;
    private int rewardAmount;

}
