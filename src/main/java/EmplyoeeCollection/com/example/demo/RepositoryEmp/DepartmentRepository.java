package EmplyoeeCollection.com.example.demo.RepositoryEmp;

import EmplyoeeCollection.com.example.demo.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DepartmentRepository extends JpaRepository<employee,Long> {

    @Query(
            value = "UPDATE `DBs`.`emplyoees` SET `last_name` = 'Khan' WHERE (`emp_id` = ?1);",
            nativeQuery = true)
    void findAllActiveUsersNative(Long tmp);

    @Modifying
    @Query("update employee u set u.firstName = ?1, u.lastName = ?2 where u.id = ?3")
    void setUserInfoById(String firstname, String lastname, Long id);
}
