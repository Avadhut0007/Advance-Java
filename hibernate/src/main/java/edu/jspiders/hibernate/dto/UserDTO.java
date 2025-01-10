package edu.jspiders.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Data
@Entity
public class UserDTO {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long mobile;
	private String password;
	
	

}
