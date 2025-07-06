package Mylist;

import java.util.ArrayList;
import java.util.List;

    public class MyList {
        private List<String> data;

        public MyList() {
            data = new ArrayList<>();
        }

        public boolean isEmpty() {
            return data.isEmpty();
        }

        public void add(String apple) {
            data.add(apple);
        }

        public int size() {
            return data.size();
        }

        public String get(int index) {
            return data.get(index);
        }

        public void remove(int i) {
            data.remove(i);
        }

        public void clear() {
            data.clear();
        }

    }
