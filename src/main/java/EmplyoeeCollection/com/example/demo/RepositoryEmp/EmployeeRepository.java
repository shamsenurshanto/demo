package EmplyoeeCollection.com.example.demo.RepositoryEmp;

import EmplyoeeCollection.com.example.demo.model.department;
import EmplyoeeCollection.com.example.demo.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<department,Long> {

}
