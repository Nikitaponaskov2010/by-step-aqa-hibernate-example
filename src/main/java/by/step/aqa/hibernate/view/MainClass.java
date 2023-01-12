package by.step.aqa.hibernate.view;

import by.step.aqa.hibernate.daomodels.Departments;
import by.step.aqa.hibernate.daomodels.Diseases;
import by.step.aqa.hibernate.service.DepartmentService;
import by.step.aqa.hibernate.service.DiseasesService;
import by.step.aqa.hibernate.service.DoctorService;

import java.util.List;

public class MainClass {
    DepartmentService departmentService;
    DoctorService doctorService;
    DiseasesService diseaseService;

    public MainClass() {
        this.departmentService = new DepartmentService();
        this.doctorService = new DoctorService();
        this.diseaseService = new DiseasesService();

    }

    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.showTables();
    }

    public void addDiseases() {
        Diseases diseases = new Diseases();
        diseases.setName("Грипп");
        diseases.setSeverity(1);
        //diseaseService.(diseases);

    }

    public void showTables() {

        List<Departments> departments = departmentService.getAllDepartments();

        departments.forEach(department -> System.out.println(department.toString()));

//        List<Diseases> diseases = diseaseService.getAllDiseases();
//
//        diseases.forEach(disease -> System.out.println(disease.toString()));
//        List<Doctor> doctors = doctorService.get();
//
//        doctors.forEach(doctor -> System.out.println(doctor.toString()));
//    }
    }
}
