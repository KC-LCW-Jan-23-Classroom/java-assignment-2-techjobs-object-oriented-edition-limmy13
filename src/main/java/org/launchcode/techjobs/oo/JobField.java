package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    //declare fields

    private int id;
    private static int nextId = 1;
    private String value;


    // constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // getters and setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // custom methods

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobField jobField = (JobField) obj;
        return id == jobField.id;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
