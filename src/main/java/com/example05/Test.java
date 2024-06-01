package com.example05;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;




public class Test {
    public static void main(String[] args) {
       // Map<Integer, Integer> map = getMapByClazzByScore(STUDENTS,90,"软件1班");

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
