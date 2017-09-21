package org.springmeetup.warmup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

	@InjectMocks
	private PersonService personService;

	@Mock
	private PersonRepository personRepository;
	
	@Test
	public void find_person_with_id_1() {
		Person person_1 = new Person();
		person_1.setId(1l);
		
		when(personRepository.findOne(1l)).thenReturn(person_1);

		Person person = personService.findById(1l);
		
		assertNotNull(person);
		assertEquals(1, person.getId().longValue());
	}

	@Test
	public void find_person_with_id_2() {
		Person person_2 = new Person();
		person_2.setId(2l);
		
		when(personRepository.findOne(2l)).thenReturn(person_2);

		Person person = personService.findById(2l);
		
		assertNotNull(person);
		assertEquals(2, person.getId().longValue());
	}
}
