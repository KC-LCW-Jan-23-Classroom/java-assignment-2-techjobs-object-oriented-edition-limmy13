package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(int id) {
        this();
        this.id = id;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(nextId++);
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job otherJob = (Job) o;
        return id == otherJob.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public void setId(int id) {
        this.id= id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

        //to string@Override
        @Override
        public String toString() {
            String nameValue = name.isBlank() ? "Data not available" : name;
            String employerValue = employer.getValue().isBlank() ? "Data not available" : employer.getValue();
            String locationValue = location.getValue().isBlank() ? "Data not available" : location.getValue();
            String positionTypeValue = positionType.getValue().isBlank() ? "Data not available" : positionType.getValue();
            String coreCompetencyValue = coreCompetency.getValue().isBlank() ? "Data not available" : coreCompetency.getValue();

            if (nameValue.isBlank() && employerValue.isBlank() && locationValue.isBlank() &&
                    positionTypeValue.isBlank() && coreCompetencyValue.isBlank()) {
                return "OOPS! This job does not seem to exist.";
            }

            return "\n" +
                    "ID: " + id + "\n" +
                    "Name: " + nameValue + "\n" +
                    "Employer: " + employerValue + "\n" +
                    "Location: " + locationValue + "\n" +
                    "Position Type: " + positionTypeValue + "\n" +
                    "Core Competency: " + coreCompetencyValue + "\n";
        }
}

