package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {


    public PositionType() {
       super();
    }

    public PositionType(String value) {
      super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

//    @Override
//    public String toString() {
//        return "PositionType{" +
//                "value='" + value + '\'' +
//                '}';
//    }



    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PositionType that = (PositionType) o;
//        return id == that.id && Objects.equals(value, that.value);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, value);
//    }


    // Getters and Setters:

    public int getId() {
        return super.getId();
    }

    public String getValue() {
        return super.getValue();
    }

    public void setValue(String value) {
        super.setValue(value);
    }

}
