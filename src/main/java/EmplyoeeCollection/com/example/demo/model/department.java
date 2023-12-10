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
@Table(name = "department")
public class department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="deptCode")
    private long deptCode;
    @Column(name="deptName")
    private String deptName;





}
