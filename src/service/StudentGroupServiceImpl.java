package service;

import data.StudentGroup;
import data.User;
import util.ReaderFromTxt;

/**
 * Создать класс УчебнаяГруппаСервис, в котором реализована логика чтения
 * студентов и преподавателя из файла TXT, создания класса УчебнаяГруппа
 * и возвращения его
 */
public class StudentGroupServiceImpl implements DataServiceGroup {
    @Override
    public StudentGroup getGroup() {
        return new StudentGroup(ReaderFromTxt.getTeacherFromTxt(), ReaderFromTxt.getStudentsFromTxt());
    }

    @Override
    public StudentGroup getGroup(int number) {
        return new StudentGroup(ReaderFromTxt.getTeacherFromTxt(), ReaderFromTxt.getStudentsFromTxt(), number);
    }
}
