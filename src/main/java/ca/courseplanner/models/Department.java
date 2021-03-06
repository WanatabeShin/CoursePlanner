package ca.courseplanner.models;

import java.util.ArrayList;
import java.util.Comparator;

public class Department {
    private String department;
    private long deptId;
    private ArrayList<Course> listOfCourses;

    public Department(String department) {
        this.department = department;
        this.listOfCourses = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void setListOfCourses(ArrayList<Course> listOfCourses) {
        this.listOfCourses = listOfCourses;
    }

    public void addCourse(Course course){
        this.listOfCourses.add(course);
    }

    public Course findCourse(Course course){
        ArrayList<Course> listOfCourses = getListOfCourses();
        for (Course currentCourse : listOfCourses){
            if(currentCourse.getCourseNumber().equals(course.getCourseNumber())){
                return currentCourse;
            }
        }
        return null;
    }

    public static Comparator<Department> DepartmentComparator = new Comparator<Department>() {
        @Override
        public int compare(Department department1, Department department2) {
            return department1.getDepartment().compareTo(department2.getDepartment());
        }
    };
}
