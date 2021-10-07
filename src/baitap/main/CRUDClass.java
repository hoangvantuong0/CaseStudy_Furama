package baitap.main;

import baitap.Lesson;

import javax.crypto.spec.PSource;
import java.io.File;
import java.util.List;
import java.util.Scanner;

import static baitap.regex.ReadLessonFile.readLessonFile;
import static baitap.regex.Regex.checkRegex;
import static baitap.regex.WriteLessonFile.writeLessonFile;

public class CRUDClass {
    File file = new File(LESSON_PATH);
    public static final String ID_REGEX = "^\\d+";
    private static final String NAME_REGEX = "^\\w*$";
    public static final String LESSON_PATH = "src/baitap/data/lessonList.csv";
    Scanner scanner = new Scanner(System.in);
    List<Lesson> lessonList = readLessonFile(LESSON_PATH);

    public void addLesson() {

        Lesson lesson = new Lesson(Integer.parseInt(idLesson()), addVersion(), addDifficultyLevel(),
                Integer.parseInt(addLessonTime()));
        lessonList.add(lesson);
        file.delete();
        writeLessonFile(lessonList, LESSON_PATH, true);
    }

    public String idLesson() {
        System.out.println("Nhập mã môn học theo định dạng BC-YYYY: ");
        String idLesson = scanner.nextLine();
        return checkRegex(idLesson, ID_REGEX, "Lỗi nhập! mời nhập lại!");
    }

    public String addVersion() {
        System.out.println("Nhập phiên bản môn học: ");
        String version = scanner.nextLine();
        return checkRegex(version, NAME_REGEX, "Lỗi nhập! mời nhập lại!");
    }
public String addDifficultyLevel(){
    System.out.println("Thêm độ khó: ");
    String difficultyLevel = scanner.nextLine();
    return difficultyLevel;
}


//    public String adddifficultyLevel() {
//        String difficulityLevel ="";
//        boolean check = true;
//        while (check) {
//            System.out.println("Menu edit: 1. dễ + 2. vừa - 3. khó - 4. exit");
//            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    difficulityLevel = "dễ";
//                    break;
//                case 2:
//                    difficulityLevel = "vừa";
//                    break;
//                case 3:
//                    difficulityLevel = "khó";
//                    break;
//                case 4:
//                    check = false;
//                    break;
//            }
//        }
//            return difficulityLevel;
//        }





//        String difficultyLevel = "";
//        boolean flag = true;
//        System.out.println("Nhập độ khó môn học theo định dạng khó - vừa - dễ: ");
//        while (flag) {
//            String choice;
//            System.out.println("Menu: " + "\n" +
//                    "1. Dễ" + "\n" +
//                    "2. Vừa" + "\n" +
//                    "3. Khó" + "\n" +
//                    "4. Exit");
//            choice = scanner.nextLine();
//            switch (choice) {
//                case "1":
//                    difficultyLevel = "Dễ";
//                    break;
//                case "2":
//                    difficultyLevel = "Vừa";
//                    break;
//                case "3":
//                    difficultyLevel = "Khó";
//                    break;
//                case "4":
//                    flag = false;
//                    break;
//            }
//            break;
//        }
//        return difficultyLevel;

//    }
    public String addLessonTime() {
        System.out.println("Nhập mã môn học theo định dạng BC-YYYY: ");
        String lessonTime = scanner.nextLine();
        return checkRegex(lessonTime, NAME_REGEX, "Lỗi nhập! mời nhập lại!");
    }

    public void display() {
        for (Lesson lesson : lessonList) {
            System.out.println(lesson);
        }
    }

    public void deleteLesson() {
        display();
        System.out.println("Nhập id cần xoá");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lessonList.size(); i++) {
            if (idDelete == lessonList.get(i).getIdLesson()) {
                lessonList.remove(lessonList.get(i));
                System.out.println("Xoá môn học thành công1");
                writeLessonFile(lessonList, LESSON_PATH, true);
            }
        }

    }
}
//- Mã môn học (định dạng BC-YYYY, với Y là các kí tự chữ), mã không được trùng nhau.
//        - Tên môn học (có thể trùng nhau)
//        - Phiên bản (theo định dạng X.X, với là số nguyên dương)
//        - Độ khó: chỉ có một trong 3 tuỳ chọn Dễ, Vừa, Khó.
//        - Thời lượng học: là số nguyên, có đơn vị là giờ.
//1. Danh sách các môn học theo thời lượng lớn nhất đến nhỏ nhất.
//        2. Cập nhật môn học (không được phép chỉnh sửa Mã môn học).
//        3. Xoá môn học bất kì theo Mã môn học, nếu không có Mã môn học thì thực hiện throw Exception.
//        4. Thoát.