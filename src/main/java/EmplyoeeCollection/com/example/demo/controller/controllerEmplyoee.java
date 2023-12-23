package EmplyoeeCollection.com.example.demo.controller;


import EmplyoeeCollection.com.example.demo.RepositoryEmp.DepartmentRepository;
import EmplyoeeCollection.com.example.demo.RepositoryEmp.EmployeeRepository;
import EmplyoeeCollection.com.example.demo.model.department;
import EmplyoeeCollection.com.example.demo.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/")
public class controllerEmplyoee {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("name")
    public List<department> getValueemp() {
        return employeeRepository.findAll();
    }

    //push
    @PostMapping("add")
    public ResponseEntity<String> postData(@RequestBody department data) {
        employeeRepository.save(data);
        return ResponseEntity.ok("Data received successfully");
    }

    @GetMapping("update")
    public Optional<department> updateValueemp() {
        Long tmp = 13L;
        return employeeRepository.findById(tmp);
    }

     @PutMapping("updateEmp")
    public void  updateemp(@RequestBody employee UpdatedData) {
         Long tmp = UpdatedData.getId();
         String tmp2 = UpdatedData.getFirstName();
         String tmp3= UpdatedData.getLastName();
         String tmp4= UpdatedData.getEmail();

       departmentRepository.save(UpdatedData);


    }




}
