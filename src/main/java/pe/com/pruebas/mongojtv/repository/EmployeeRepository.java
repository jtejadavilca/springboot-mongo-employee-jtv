package pe.com.pruebas.mongojtv.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.pruebas.mongojtv.model.Employee;
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}
