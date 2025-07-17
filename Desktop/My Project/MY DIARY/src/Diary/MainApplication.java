package Diary;

public class MainApplication {
    public static void main(String[] args) {
        Diaries diaries = new Diaries();
        diaries.Add("john", "1234");
        Diary johnDiary = diaries.findByUsername("john");
        johnDiary.unlockDiary("1234");
    }
}
