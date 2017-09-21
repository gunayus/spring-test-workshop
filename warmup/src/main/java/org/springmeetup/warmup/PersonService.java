package org.springmeetup.warmup;

public class PersonService {

	private final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public Person findById(long id) {
		return personRepository.findOne(id);
	}

}
