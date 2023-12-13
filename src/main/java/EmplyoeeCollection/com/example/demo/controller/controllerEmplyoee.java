package EmplyoeeCollection.com.example.demo.controller;


import EmplyoeeCollection.com.example.demo.RepositoryEmp.EmployeeRepository;
import EmplyoeeCollection.com.example.demo.model.employee;
import EmplyoeeCollection.com.example.demo.model.department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/")
public class controllerEmplyoee {
    @Autowired
   private EmployeeRepository employeeRepository;
@GetMapping("name")
    public List<department> getValueemp(){
        return employeeRepository.findAll();
    }
//push
    @PostMapping("add")
    public ResponseEntity<String> postData(@RequestBody department data) {

        employeeRepository.save(data);
        return ResponseEntity.ok("Data received successfully");
    }


}
