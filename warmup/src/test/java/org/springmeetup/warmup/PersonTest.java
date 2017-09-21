package org.springmeetup.warmup;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonTest {
	
	@Test
	public void check_person_old_enough() {
		Person person = new Person();
		person.setAge(25);
		
		assertTrue(person.isOldEnough());

		person.setAge(18);
		assertTrue(person.isOldEnough());
	}
	
	@Test
	public void check_person_not_old_enough() {
		Person person = new Person();
		person.setAge(17);
		
		assertFalse(person.isOldEnough());
	}
	

}
