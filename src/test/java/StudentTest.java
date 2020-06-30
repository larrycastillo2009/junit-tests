import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


import java.util.ArrayList;

public class StudentTest {
    Student empty;


    @Before
    public void setUp(){
        empty = new Student(213891273,"Larry");
        empty.addGrade(5);



    }

    @Test
    public void testConstructor(){
        assertEquals("Larry",empty.name);
        assertEquals(213891273,empty.id);
        assertNotNull(empty.grades);


    }

    @Test
    public void testGetID(){
        assertEquals(213891273,empty.getId());
    }

    @Test
    public void testGetName(){
        assertEquals("Larry",empty.getName());
    }

    @Test
    public void testAddGrade(){
        assertEquals(1,empty.grades.size());
        empty.grades.add(6);
        assertEquals(2, empty.grades.size());
        assertSame(5,empty.grades.get(0));
        assertSame(6,empty.grades.get(1));


    }

    @Test
    public void testGetGradeAverage(){
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


        assertEquals(5,empty.getGradeAverage(),5.0);
        assertEquals(85.0,terry.getGradeAverage(),5.0);
        assertEquals(50.0,jerry.getGradeAverage(),5.0);
        assertEquals(75.0,barry.getGradeAverage(),5.0);
    }

//    @Test
//    public void testGetGradeAverage();


}
