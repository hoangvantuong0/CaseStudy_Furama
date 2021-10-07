package baitap.regex;

import baitap.Lesson;
import cinema.Phim;

import java.util.ArrayList;
import java.util.List;

import static utils.ReadAndWriteFile.readFile;

public class ReadLessonFile {
    public static List<Lesson> readLessonFile(String path) {
        List< String > stringList = readFile(path);
        List< Lesson > lessonList = new ArrayList<>();
        for (String string : stringList) {
            String[] temp = string.split(",");
            Lesson lesson = new Lesson(Integer.parseInt(temp[0]), temp[1], temp[2],
                    Integer.parseInt(temp[3]));

            lessonList.add(lesson);
        }
        return lessonList;
    }
}

