/*Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов.
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся 
имена с количеством повторений. Отсортировать по убыванию популярности.*/
package Seminar_5;
import java.util.*;
public class Task_1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Иван Иванов", Arrays.asList("111-222", "333-485"));
        phoneBook.put("Светлана Петрова", Collections.singletonList("4363-373"));
        phoneBook.put("Кристина Белова", Collections.singletonList("644-348"));
        phoneBook.put("Анна Мусина", Collections.singletonList("577-587"));
        phoneBook.put("Анна Крутова", Collections.singletonList("612-135"));
        phoneBook.put("Иван Юрин", Collections.singletonList("758-987"));
        phoneBook.put("Петр Лыков", Collections.singletonList("123-8456"));
        phoneBook.put("Павел Чернов", Collections.singletonList("695-459"));
        phoneBook.put("Петр Чернышов", Arrays.asList("586-123", "850-552"));
        phoneBook.put("Мария Федорова", Collections.singletonList("852-785"));
        phoneBook.put("Марина Светлова", Collections.singletonList("578-998"));
        phoneBook.put("Мария Савина", Collections.singletonList("659-687"));
        phoneBook.put("Мария Рыкова", Collections.singletonList("852-898"));
        phoneBook.put("Марина Лугова", Arrays.asList("547-401", "785-470"));
        phoneBook.put("Анна Владимирова", Collections.singletonList("874-963"));
        phoneBook.put("Иван Мечников", Collections.singletonList("142-582"));
        phoneBook.put("Петр Петин", Collections.singletonList("369-963"));
        phoneBook.put("Иван Ежов", Collections.singletonList("147-741"));

        Map<String, Integer> nameCount = new HashMap<>();
        for (String name : phoneBook.keySet()) {
            String firstName = name.split(" ")[0];
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet());
        Collections.sort(sortedNames, Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedNames) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }    
}
