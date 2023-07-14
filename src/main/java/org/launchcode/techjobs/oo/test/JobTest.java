package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job(1);
        Job job2 = new Job(2);

        assertNotEquals(job1.getId(), job2.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), 
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
        assertTrue(true);
        assertTrue(job.getEmployer() != null);
        assertTrue(job.getLocation() != null);
        assertTrue(job.getPositionType() != null);
        assertTrue(job.getCoreCompetency() != null);
        
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Software Engineer", new Employer("VMLYR"), new Location("Kansas City"),
                new PositionType("Quality control"), new CoreCompetency("Java"));
        Job job2 = new Job("Software Engineer", new Employer("VMLYR"), new Location("Kansas City"),
                new PositionType("Quality control"), new CoreCompetency("Java"));

        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Software Engineer", new Employer("VMLYR"), new Location("Kansas City"),
                new PositionType("Quality control"), new CoreCompetency("Java"));

        String jobString = job.toString();

        assertEquals("\n", String.valueOf(jobString.charAt(0)));
        assertEquals("\n", String.valueOf(jobString.charAt(jobString.length() -1)));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Software Engineer", new Employer("VMLYR"), new Location("Kansas City"),
                new PositionType("Quality control"), new CoreCompetency("Java"));

        String jobString = job.toString();

        String expected = "\n" +
                "ID: " + job.getId() + "\n" +
                "Name: Software Engineer\n" +
                "Employer: VMLYR\n" +
                "Location: Kansas City\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Java\n";

        assertEquals(expected, jobString);
    }



}
