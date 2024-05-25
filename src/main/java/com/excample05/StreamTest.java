package com.excample05;
import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
    private static final List<Student> STUDENTS = create();
    private static final String CLAZZ1 = "软件1班";
    private static final String CLAZZ2 = "软件2班";

 private static List<Student> create() {

     Student s1 = new Student(2018008, "张扬", CLAZZ2, 66);

     Student s2 = new Student(2018005, "刘飞", CLAZZ1, 92);

     Student s3 = new Student(2018007, "李明", CLAZZ2, 42);

     Student s4 = new Student(2018006, "赵勇", CLAZZ2, 56);

     Student s5 = new Student(2018002, "王磊", CLAZZ1, 81);

     Student s6 = new Student(2018010, "牛娜", CLAZZ1, 78);

     List<Student> students = new ArrayList<>();

     students.add(s1);
     students.add(s2);
     students.add(s3);

     students.add(s4);
     students.add(s5);
     students.add(s6);

     return students;
 }
    public static void main(String[] args) {
        Map<Integer, Integer> map = getMapByClazzByScore(STUDENTS,90,"软件1班");
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());

        }

    }
    private static List<Student> getStudentByScore(List<Student> list, int score) {
        return list.stream()
                .filter(s -> score >= s.getScore())
                .toList();

    }
    private static List<Student> getStudentByScoreByClazz(List<Student> list, int score, String clazz) {
        return list.stream()
                .filter(s -> clazz.equals(s.getClazz()))
                .filter(s -> score >= s.getScore())
                .toList();
    }
    private static List<String> getStudentNameByScoreByClazz(List<Student> list, int score, String clazz) {
        return list.stream()
                .filter(s -> clazz.equals(s.getClazz()))
                .filter(s -> score >= s.getScore())
                .map(Student::getName)
                .toList();
    }

    private static List<Student> getStudentByScoreSorted(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student ::getScore))
                .toList();
    }
    private static List<Student> getStudentByClazzByScoreSorted(List<Student> list, int score, String clazz) {
        return list.stream()
                .filter(s -> clazz.equals(s.getClazz()))
                .filter(s -> score >=s.getScore())
                .sorted(Comparator.comparing(Student ::getScore).reversed())
                .toList();
    }
    private static List<Integer> getNumberByClazzByScoreSorted(List<Student> list, int score, String clazz) {
        return list.stream()
                .filter(s -> clazz.equals(s.getClazz()))
                .filter(s -> score >=s.getScore())
                .sorted(Comparator.comparing(Student ::getScore).reversed())
                .map(Student ::getNumber)
                .toList();
    }
    private static Map<Integer, Integer> getMapByClazzByScore(List<Student> list, int score, String clazz) {
        return list.stream()
                .filter(s -> clazz.equals(s.getClazz()))
                .filter(s -> score >=s.getScore())
                .collect(Collectors.toMap(Student::getNumber, Student::getScore));
    }
}
