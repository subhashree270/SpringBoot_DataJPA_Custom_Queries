package in.subha.dto;

public class CustomerDto {
	
	private String name;
	private Integer age;
	
	public CustomerDto(String name,Integer age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "CustomerDto [name=" + name + ", age=" + age + "]";
	}
	
	

}
