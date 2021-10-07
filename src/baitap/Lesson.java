package baitap;

public class Lesson {
    int idLesson;
    String version;
    String difficultyLevel;
    int lessonTime;

    public Lesson() {
    }

    public Lesson(int idLesson, String version, String difficultyLevel, int lessonTime) {
        this.idLesson = idLesson;
        this.version = version;
        this.difficultyLevel = difficultyLevel;
        this.lessonTime = lessonTime;
    }

    public int getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(int idLesson) {
        this.idLesson = idLesson;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(int lessonTime) {
        this.lessonTime = lessonTime;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "idLesson='" + idLesson + '\'' +
                ", version='" + version + '\'' +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                ", lessonTime=" + lessonTime +
                '}';
    }
    public String getLessonInfo(){
        return this.idLesson +"," + this.version + "," + this.difficultyLevel +"," + this.lessonTime;
    }
}
//- Mã môn học (định dạng BC-YYYY, với Y là các kí tự chữ), mã không được trùng nhau.
//        - Tên môn học (có thể trùng nhau)
//        - Phiên bản (theo định dạng X.X, với là số nguyên dương)
//        - Độ khó: chỉ có một trong 3 tuỳ chọn Dễ, Vừa, Khó.
//        - Thời lượng học: là số nguyên, có đơn vị là giờ.
//        Tạo các chức năng sau theo menu:
//        1. Danh sách các môn học theo thời lượng lớn nhất đến nhỏ nhất.
//        2. Cập nhật môn học (không được phép chỉnh sửa Mã môn học).
//        3. Xoá môn học bất kì theo Mã môn học, nếu không có Mã môn học thì thực hiện throw Exception.
//        4. Thoát.