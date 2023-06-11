package com.domi.ptc_core.model;

import com.domi.ptc_core.model.enums.RewardChangeType;
import jakarta.persistence.*;
import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table
public class UserRewardHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userRewardUid;
    private int userId;
    private Double origAmount;
    private Double newAmount;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = JpaConstant.COLUMN_DEFIN_MEDIUM_TEXT)
    private RewardChangeType rewardChangeType = RewardChangeType.MISSION;

}
