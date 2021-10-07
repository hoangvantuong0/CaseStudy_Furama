package baitap.regex;

import baitap.Lesson;
import cinema.Phim;

import java.util.ArrayList;
import java.util.List;

import static utils.ReadAndWriteFile.writeFile;


    public class WriteLessonFile {
        public static void writeLessonFile(List<Lesson> lesson, String path, boolean append) {
            List<String> stringList = new ArrayList<>();
            for (Lesson lesson1 : lesson) {
             stringList.add(lesson1.getLessonInfo());
            }
            writeFile(stringList, path, append);
        }
    }

