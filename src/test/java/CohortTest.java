import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CohortTest {
    Student empty;

    @Before
    public void setUp(){
        empty = new Student(213891273,"Larry");
        empty.addGrade(5);


    }

    @Test
    public void testAddStudents() {
        Cohort cohort = new Cohort();
        assertEquals(0,cohort.getStudents().size());
        cohort.addStudent(empty);
        assertEquals(1, empty.grades.size());
        assertSame("Larry",cohort.getStudents().get(0).getName());

    }

    @Test
    public void testGetStudents() {
        Student empty1 = new Student(213891274, "Terry");
        empty1.addGrade(100);
        Cohort cohort = new Cohort();
        cohort.addStudent(empty);
        cohort.addStudent(empty1);
        assertSame(2,cohort.getStudents().size());
    }

    @Test
    public void testGetCohortsAverage() {
        Student terry = new Student(123456,"Terry");
        Student jerry = new Student(1234567,"Jerry");
        Student barry = new Student(12345678,"Barry");

        terry.addGrade(100);
        terry.addGrade(80);
        terry.addGrade(75);

        jerry.addGrade(50);
        jerry.addGrade(50);
        jerry.addGrade(50);

        barry.addGrade(75);

        empty.addGrade(5);

        Cohort cohort = new Cohort();

        cohort.addStudent(empty);
        cohort.addStudent(terry);
        cohort.addStudent(jerry);
        cohort.addStudent(barry);



        assertEquals(53.75,cohort.getCohortAverage(),5.0);
//        assertEquals(85.0,terry.getGradeAverage(),5.0);
//        assertEquals(50.0,jerry.getGradeAverage(),5.0);
//        assertEquals(75.0,barry.getGradeAverage(),5.0);
    }
}
