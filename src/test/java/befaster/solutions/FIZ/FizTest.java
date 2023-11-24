package befaster.solutions.FIZ;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizTest {
	private FizzBuzzSolution fiz;

	@BeforeEach
	public void setUp() {
		fiz = new FizzBuzzSolution();
	}

	@Test
	public void compute_sum() {
		assertThat(fiz.fizzBuzz2(55), equalTo("buzz"));
	}
}

