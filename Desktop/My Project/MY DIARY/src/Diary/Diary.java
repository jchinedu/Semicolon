package Diary;


import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String Username;
    private String Password;
    private List<Entry> Entries;
    private int EntryCounter = 1;
    private boolean Islocked;

    public Diary(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
        this.Islocked = true;
        this.Entries = new ArrayList<>();
    }

    public String getName() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
    public void unlockDiary(String Password) {
        if (this.Password.equals(Password)) {
            Islocked = false;
        }
    }

    public boolean LockDiary() {
        Islocked = true;
        return Islocked;
    }
    public boolean Islocked() {
        return Islocked;
    }
    public void CreateEntry(String title, String body) {
        if (Islocked) {
            throw new EntryIsLocked();
        }
        Entry entry = new Entry(EntryCounter++, title, body);
        Entries.add(entry);
    }

    public List<Entry> getEntries() {
        return Entries;
    }

    public void deleteEntry(int index) {
        if (!Islocked && index >= 0 && index < Entries.size()) {
            Entries.remove(index);
        }
    }
    public void updateEntry(int id, String newTitle, String newBody) {
        Entry entry = findEntryById(id);
        if (entry != null) {
            entry.setTitle(newTitle);
            entry.setBody(newBody);
        }
    }

    public Entry findEntryById(int id) {
        for (Entry e : Entries) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

}

