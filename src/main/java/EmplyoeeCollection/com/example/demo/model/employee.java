package EmplyoeeCollection.com.example.demo.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Transactional
@Table(name = "emplyoees")
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private long id;
    @Column(name="first_Name")
    private String firstName;
    @Column(name="last_Name")
    private String lastName;
    @Column(name="email_Name")
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
    private List<department> departments;

}
