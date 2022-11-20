package com.sda.testingbasics.arrays;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ArrayExampleTest {

	@Test
	void shouldReturnArrayWithDistinctElements() {
		//given
		//create array ["a", "b", "a", "c"]
		String[] withDuplicates = {"a", "b", "a", "c"};

		//when
		String[] distinctArray = ArrayExample.removeDuplicates(withDuplicates);

		//then
		//distinctArray = ["a", "b", "c"]
		//assertEquals(distinctArray, new String[]{"a", "b", "c"});
		assertThat(distinctArray)
				.containsExactlyInAnyOrder("a", "b", "c");
	}

}