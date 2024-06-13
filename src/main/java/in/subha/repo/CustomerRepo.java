package in.subha.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import in.subha.dto.CustomerDto;
import in.subha.entity.Customer;
import jakarta.transaction.Transactional;

public interface CustomerRepo extends CrudRepository<Customer,Integer>{
	//insert
	@Modifying
	@Transactional
	@Query("insert into Customer(name,gender,age) select :name,:gender,:age")
	public void saveCustomer(@Param("name")String name,@Param("gender") String gender,@Param("age") Integer age);
	
	//update
	@Transactional
	@Modifying
	@Query("update Customer c Set c.name=:name ,c.gender=:gender,c.age=:age where id=:id")
	public void updateCustomer(@Param("id") Integer id,@Param("name") String name,@Param("gender") String gender,@Param("age") Integer age);
	
	//Projection
	@Query("select new in.subha.dto.CustomerDto(name,age) from Customer ")
	public List<CustomerDto> findProjection();
	
	
	
	
	
	
	
}
