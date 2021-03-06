package ca.courseplanner.models;

import java.util.ArrayList;

/**
 * Created by leom on 23/03/18.
 */
public class CsvModel {
    private String semester;
    private String department;
    private String catalogNumber;
    private String location;
    private String enrolmentCapacity;
    private String enrolmentTotal;
    private String instructors;
    private String componentCode;
    private final int SEMESTER_INDEX = 0;
    private final int SUBJECT_INDEX = 1;
    private final int CATALOG_NUMBER_INDEX = 2;
    private final int LOCATION_INDEX = 3;
    private final int ENROLMENT_CAPACITY_INDEX = 4;
    private final int ENROLMENT_TOTAL_INDEX = 5;
    private final int INSTRUCTORS_INDEX = 6;
    private final int COMPONENT_CODE_INDEX = 7;

    public CsvModel() {
    }

    public CsvModel(ArrayList<String> currentLine) {
        this.semester = currentLine.get(SEMESTER_INDEX).trim();
        this.department = currentLine.get(SUBJECT_INDEX).trim().toUpperCase();
        this.catalogNumber = currentLine.get(CATALOG_NUMBER_INDEX).trim();
        this.location = currentLine.get(LOCATION_INDEX).trim().toUpperCase();
        this.enrolmentCapacity = currentLine.get(ENROLMENT_CAPACITY_INDEX).trim();
        this.enrolmentTotal = currentLine.get(ENROLMENT_TOTAL_INDEX).trim();
        this.instructors = currentLine.get(INSTRUCTORS_INDEX).trim();
        this.componentCode = currentLine.get(COMPONENT_CODE_INDEX).trim().toUpperCase();
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEnrolmentCapacity() {
        return enrolmentCapacity;
    }

    public void setEnrolmentCapacity(String enrolmentCapacity) {
        this.enrolmentCapacity = enrolmentCapacity;
    }

    public String getEnrolmentTotal() {
        return enrolmentTotal;
    }

    public void setEnrolmentTotal(String enrolmentTotal) {
        this.enrolmentTotal = enrolmentTotal;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getComponentCode() {
        return componentCode;
    }

    public void setComponentCode(String componentCode) {
        this.componentCode = componentCode;
    }

//    public static Comparator<CsvModel> SubjectCatalogNumberSemesterLocationComparator = new Comparator<CsvModel>() {
//        @Override
//        public int compare(CsvModel csvCourseFormat1, CsvModel csvCourseFormat2) {
//            int subjectCompare = csvCourseFormat1.department.compareTo(csvCourseFormat2.department);
//            if (subjectCompare == 0) {
//                int catalogCompare = csvCourseFormat1.catalogNumber.compareTo(csvCourseFormat2.catalogNumber);
//                if (catalogCompare == 0) {
//                    int semesterCompare = csvCourseFormat1.semester.compareTo(csvCourseFormat2.semester);
//                    if (semesterCompare == 0) {
//                        return csvCourseFormat1.location.compareTo(csvCourseFormat2.location);
//                    } else {
//                        return semesterCompare;
//                    }
//                } else {
//                    return catalogCompare;
//                }
//            } else {
//                return subjectCompare;
//            }
//        }
//    };
}
