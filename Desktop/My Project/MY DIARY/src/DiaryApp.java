import Diary.*;

import java.util.Scanner;

    public class DiaryApp {
        private static Diaries diaries = new Diaries();
        private static Diary currentDiary = null;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("""
                    \n==== Diary Menu ====
                    1. Create Diary
                    2. Unlock Diary
                    3. Lock Diary
                    4. Add Entry
                    5. View Entry by ID
                    6. Update Entry
                    7. Delete Entry
                    8. Show All Entries
                    9. Exit
                    ====================
                    """);
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("Username: ");
                        String user = scanner.nextLine();
                        System.out.print("Password: ");
                        String pass = scanner.nextLine();
                        diaries.Add(user, pass);
                        System.out.println("Diary created.");
                    }

                    case 2 -> {
                        System.out.print("Username: ");
                        String user = scanner.nextLine();
                        System.out.print("Password: ");
                        String pass = scanner.nextLine();
                        currentDiary = diaries.findByUsername(user);
                        if (currentDiary != null) {
                            currentDiary.unlockDiary(pass);
                            if (!currentDiary.Islocked()) System.out.println("Diary unlocked.");
                        } else {
                            System.out.println("Diary not found.");
                        }
                    }

                    case 3 -> {
                        if (currentDiary != null) {
                            currentDiary.LockDiary();
                            System.out.println("Diary locked.");
                        } else {
                            System.out.println("Unlock a diary first.");
                        }
                    }

                    case 4 -> {
                        if (currentDiary == null || currentDiary.Islocked()) {
                            System.out.println("Unlock diary first.");
                        } else {
                            System.out.print("Title: ");
                            String title = scanner.nextLine();
                            System.out.print("Body: ");
                            String body = scanner.nextLine();
                            currentDiary.CreateEntry(title, body);
                            System.out.println("Entry added.");
                        }
                    }

                    case 5 -> {
                        if (currentDiary == null || currentDiary.Islocked()) {
                            System.out.println("Unlock diary first.");
                        } else {
                            System.out.print("Entry ID: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            Entry entry = currentDiary.findEntryById(id);
                            if (entry != null) {
                                System.out.println(entry);
                            } else {
                                System.out.println("Entry not found.");
                            }
                        }
                    }

                    case 6 -> {
                        if (currentDiary == null || currentDiary.Islocked()) {
                            System.out.println("Unlock diary first.");
                        } else {
                            System.out.print("Entry ID to update: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("New Title: ");
                            String newTitle = scanner.nextLine();
                            System.out.print("New Body: ");
                            String newBody = scanner.nextLine();
                            currentDiary.updateEntry(id, newTitle, newBody);
                            System.out.println("Entry updated.");
                        }
                    }

                    case 7 -> {
                        if (currentDiary == null || currentDiary.Islocked()) {
                            System.out.println("Unlock diary first.");
                        } else {
                            System.out.print("Entry ID to delete: ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            currentDiary.deleteEntry(id);
                            System.out.println("Entry deleted.");
                        }
                    }

                    case 8 -> {
                        if (currentDiary == null || currentDiary.Islocked()) {
                            System.out.println("Unlock diary first.");
                        } else {
                            currentDiary.showAllEntries();
                        }
                    }

                    case 9 -> {
                        System.out.println("Exiting app.");
                        running = false;
                    }

                    default -> System.out.println("Invalid option.");
                }
            }

            scanner.close();
        }
    }