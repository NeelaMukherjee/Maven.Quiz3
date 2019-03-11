package rocks.zipcode.io.quiz3.collections;

import java.util.Objects;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {

    String labName;

    public Lab() {
       // this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {

        return labName;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "labName='" + labName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lab)) return false;
        Lab lab = (Lab) o;
        return labName.equals(lab.labName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labName);
    }
}
