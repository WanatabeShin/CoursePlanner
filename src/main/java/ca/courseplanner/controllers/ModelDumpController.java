package ca.courseplanner.controllers;

import ca.courseplanner.models.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ModelDumpController {
    private ArrayList<Course> listOfCourse = new ArrayList<>();
    private ArrayList<Department> listOfDepartment = new ArrayList<>();
    private final int TABLE_HEADING = 0;

    @GetMapping("/dump-model")
    public ArrayList<Department> getDumpModel(){
        CsvProcessor csvProcessor = new CsvProcessor();
        ArrayList<CsvModel> listOfCsvModel = csvProcessor.startProcessor();
        listOfCsvModel.remove(TABLE_HEADING);
        CourseModelConverter courseModelConverter = new CourseModelConverter();
        courseModelConverter.startConversion(listOfCsvModel);
        ArrayList<Department> listOfDepartment = courseModelConverter.getConvertedModel();
        this.listOfDepartment.addAll(listOfDepartment);
//        for (Department currentDepartment:listOfDepartment){
//            System.out.println(currentDepartment.getDepartment());
//        }
        return listOfDepartment;
    }
}