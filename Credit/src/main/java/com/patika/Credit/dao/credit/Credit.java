package com.patika.Credit.dao.credit;

import com.patika.Credit.common.enumeration.Status;
import com.patika.Credit.dao.BaseEntity;
import com.patika.Credit.dao.user.User;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "credit")
@Table(name = "credits")

public class Credit extends BaseEntity implements Serializable {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = true)
    private double amountCredit;

    @ManyToOne
    @JoinColumn(
            name = "userId",
            referencedColumnName = "id"
    )
    private User user;
}
