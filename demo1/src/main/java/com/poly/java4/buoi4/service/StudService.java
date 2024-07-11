package com.poly.java4.buoi4.service;

import com.poly.java4.buoi4.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudService {
    List<Student> list = new ArrayList<>();

    public StudService() {
        list.add(new Student("SV1", "A", 8, true));
        list.add(new Student("SV2", "B", 14, false));
        list.add(new Student("SV3", "C", 10, true));
        list.add(new Student("SV4", "D", 9, false));
    }

    public List<Student> getAll(){
        return list;
    }
    public Student getByStudID(String studID){
        for (Student std: list) {
            if (std.getStudID().equals(studID)){
                return std;
            }
        }
        return null;
    }
    public void addStudent(Student std){
        list.add(std);
    }
    public void deleteStud(String studID){
//        Student student = getByStudID(studID);
//        list.remove(student);
        for (int i = list.size() -1; i >= 0 ; i--) {
            Student std = list.get(i);
            if (studID.equals(std.getStudID())){
                list.remove(std);
            }
        }

    }
    public void updateStudent(Student std){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudID().equals(std.getStudID())) {
                list.set(i, std);
            }
        }
    }
}
