package Controller.employee;
import EmplyoeeCollection.com.example.demo.RepositoryEmp.EmployeeRepository;
import EmplyoeeCollection.com.example.demo.model.department;
import EmplyoeeCollection.com.example.demo.model.employee;
import EmplyoeeCollection.com.example.demo.RepositoryEmp.EmployeeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class controllerEmplyoee {
    @Autowired
   private EmployeeRepository employeeRepository;
@GetMapping("name")
    public List<department> getValueemp(){
        return employeeRepository.findAll();
        //
    }


}
