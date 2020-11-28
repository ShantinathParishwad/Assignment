package assignmentTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import assignmentCode.AssignmentCode;

public class AreaOfTriangleTest {

	@Test
	public void test() {
		AssignmentCode assign = new AssignmentCode();
		assertEquals(2, assign.AreaOfTriangle(1, 4));
	}

}
