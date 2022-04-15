package HashTable3;


import java.util.*;


/**
 * Перед вами код для поиска пользователя по ID. Но пользователей очень много — один миллион.
 * Поэтому сейчас поиск работает медленно, ведь,
 * чтобы найти нужный ID, приходится выполнять итерацию по всем пользователям!
 *
 * Перепишите код таким образом, чтобы поиск пользователей работал быстрее.
 * Также обратите внимание на код, который измеряет, сколько времени занял поиск пользователя,
 * и сравните разницу до и после оптимизации.
 * Также после оптимизации посчитайте, во сколько раз вам удалось ускорить поиск.
 */
class Practicum {
    private static Map<Long,User> users = new HashMap<>();

    public static void main(String[] args) {
        // создадим 10 миллион пользователей
        for (long i = 1; i <= 1_000_000L; i++) {
            users.put(i,new User(i, "Имя " + i));
        }

        final long startTime = System.nanoTime();
        User user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    private static User findUser(Long userId) {
        return users.get(userId);
    }

    static class User {
        Long id;
        String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }
    }
}