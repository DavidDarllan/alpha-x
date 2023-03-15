package com.market.api.model.core;

import java.util.List;

import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Person {

	private String name;
	private String cpf;
	private String email;
	@OneToMany(mappedBy = "owner")
	private List<PhoneNumber> phoneNumber;
	
}
