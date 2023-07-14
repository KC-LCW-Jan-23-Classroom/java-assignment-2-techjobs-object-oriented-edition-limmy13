package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;


import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

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
        
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());

        
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Software Engineer", new Employer("VMLYR"), new Location("Kansas City"),
                new PositionType("Quality control"), new CoreCompetency("Java"));
        Job job2 = new Job("Software Engineer", new Employer("VMLYR"), new Location("Kansas City"),
                new PositionType("Quality control"), new CoreCompetency("Java"));

        assertNotEquals(job1, job2);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Software Engineer", new Employer("VMLYR"), new Location("Kansas City"),
                new PositionType("Quality control"), new CoreCompetency("Java"));

        String jobString = job.toString();

        assertEquals("\n", String.valueOf(jobString.charAt(0)));
        assertEquals("\n", String.valueOf(jobString.charAt(jobString.length() -1)));
    }

}
