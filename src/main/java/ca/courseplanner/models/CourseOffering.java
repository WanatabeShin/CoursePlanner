package ca.courseplanner.models;

import ca.courseplanner.models.CourseSection;
import ca.courseplanner.models.CsvModel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Created by leom on 23/03/18.
 */
public class CourseOffering {
    private long courseOfferingId;
    private int semester;
    private String location;
    private ArrayList<String> listOfInstructor;
    private ArrayList<CourseSection> listOfCourseSection;
    private final String nullInstructor = "(null)";

    public CourseOffering(CsvModel csvModel) {
        this.semester = Integer.valueOf(csvModel.getSemester()).intValue();
        this.location = csvModel.getLocation();
        this.listOfInstructor = new ArrayList<>();
        this.listOfCourseSection = new ArrayList<>();
//        StringTokenizer stringTokenizer = new StringTokenizer(csvModel.getInstructors());
//        while (stringTokenizer.hasMoreTokens()){
//            this.listOfInstructor.add(stringTokenizer.nextToken());
//        }
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getListOfInstructor() {
        return listOfInstructor;
    }

    public void setListOfInstructor(ArrayList<String> listOfInstructor) {
        this.listOfInstructor = listOfInstructor;
    }

    public ArrayList<CourseSection> getListOfCourseSection() {
        return listOfCourseSection;
    }

    public void setListOfCourseSection(ArrayList<CourseSection> listOfCourseSection) {
        this.listOfCourseSection = listOfCourseSection;
    }

    public void addCourseSection(CourseSection courseSection) {
        this.listOfCourseSection.add(courseSection);
    }

    public void addInstructor(String instructors){
        StringTokenizer stringTokenizer = new StringTokenizer(instructors);
        while (stringTokenizer.hasMoreTokens()){
            String currentInstructor = stringTokenizer.nextToken();
            if (!listOfInstructor.contains(currentInstructor) && (!currentInstructor.equals(nullInstructor))) {
                this.listOfInstructor.add(currentInstructor);
            }
        }
    }

    public CourseSection findCourseSection (CourseSection courseSection){
        ArrayList<CourseSection> listOfCourseOffering = getListOfCourseSection();
        for (CourseSection currentSection : listOfCourseOffering) {
            if (currentSection.getComponentCode().equals(courseSection.getComponentCode())) {
                return currentSection;
            }
        }
        return null;
    }

    public static Comparator<CourseOffering> CourseOfferingComparator = new Comparator<CourseOffering>() {
        @Override
        public int compare(CourseOffering courseOffering1, CourseOffering courseOffering2) {
            int semesterCompare = courseOffering1.getSemester() - courseOffering2.getSemester();
            if(semesterCompare == 0){
                return courseOffering1.getLocation().compareTo(courseOffering2.getLocation());
            } else {
                return semesterCompare;
            }
        }
    };

}