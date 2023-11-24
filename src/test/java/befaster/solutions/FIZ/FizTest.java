package befaster.solutions.FIZ;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumSolutionTest {
	private FizzBuzzSolution fiz;

	@BeforeEach
	public void setUp() {
		fiz = new FizzBuzzSolution();
	}

	@Test
	public void compute_sum() {
		assertThat(sum.compute(1, 1), equalTo(2));
	}
}
