package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    Map<Lab, LabStatus> labStatusMap = new HashMap<>();

    Lab lab;

    public Map<Lab, LabStatus> getLabStatusMap() {
        return labStatusMap;
    }

    public void setLabStatusMap(Map<Lab, LabStatus> labStatusMap) {
        this.labStatusMap = labStatusMap;
    }


    public Student() {
        //new Lab(lab.getName());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.labStatusMap = map;
    }

    public Lab getLab(String labName) {

        return new Lab(labName);

    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        Lab lab1 = getLab(labName);
        getLabStatusMap().replace(lab1, labStatus);

    }


    public void forkLab(Lab lab) {

        setLabStatus(lab.getName(), LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {

        //Lab lab = getLab(labName);

//        if (labStatusMap.get(lab).equals(null)) {
//
//            throw new UnsupportedOperationException("Method not yet implemented");
//        } else
        //LabStatus labStatus =
        return labStatusMap.get(getLab(labName));

    }

    @Override
    public String toString() {
        return "Student{" +
                "labStatusMap=" + labStatusMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return labStatusMap.equals(student.labStatusMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labStatusMap);
    }
}
