package pe.com.pruebas.mongojtv.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import pe.com.pruebas.mongojtv.model.Employee;
public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
	@Query("{ 'firstName' : {\"$regex\" : ?0 } }")
	List<Employee> findByFirstNameRegex(String firstName);
}
