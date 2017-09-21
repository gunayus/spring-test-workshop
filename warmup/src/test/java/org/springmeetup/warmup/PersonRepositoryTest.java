package org.springmeetup.warmup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestApp.class)
public class PersonRepositoryTest {

	@Autowired
	PersonRepository personRepository;
	
	@Test
	public void should_insert_a_new_row() {
		Person person = new Person();
		person.setAge(30);
		
		personRepository.save(person);
		
		assertTrue(personRepository.count() == 1);
		
		Person personSaved = personRepository.findOne(1l);
		assertNotNull(personSaved);
		assertEquals(30, personSaved.getAge());
		
	}
}
