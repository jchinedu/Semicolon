package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();
    public void Add(String username, String password) {
        diaries.add(new Diary(username, password));
    }

    public int size() {
        return diaries.size();
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
            if (diary.getName().equalsIgnoreCase(username)) {
                return diary;
            }
        }
        return null;
    }

    public void delete(String username, String password) {
        for (Diary diary : diaries) {
            if (diary.getName().equals(username) && diary.getPassword().equals(password)) {
                diaries.remove(diary);
                break;
            }    }
    }

}
