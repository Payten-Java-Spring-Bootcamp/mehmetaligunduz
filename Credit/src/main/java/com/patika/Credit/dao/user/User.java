package com.patika.Credit.dao.user;
import com.patika.Credit.dao.BaseEntity;
import com.patika.Credit.dao.credit.Credit;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
@Table(name = "users")
public class User extends BaseEntity implements Serializable {
    @Column(nullable = false)
    private String TRIdNumber;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private double salary;

    @Column(nullable = false)
    private String phone;

    @OneToMany(mappedBy = "user")
    private List<Credit> creditList;

}
