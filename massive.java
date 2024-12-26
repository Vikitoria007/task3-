import java.util.ArrayList;
import java.util.Comparator;

class StringArray {
    private ArrayList<String> strings;

    public StringArray() {
        strings = new ArrayList<>();
    }

    public void add(String str) {
        strings.add(str);
        strings.sort(Comparator.comparingInt(String::length));
    }

    public String getMaxLengthString() {
        return strings.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }

    public double getAverageLength() {
        return strings.stream().mapToInt(String::length).average().orElse(0);
    }

    public void displayStrings() {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

// Тестирование
public class Main {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        stringArray.add("Кот");
        stringArray.add("Собака");
        stringArray.add("Яблоко");
        stringArray.add("Длинная строка");
        
        stringArray.displayStrings();
        
        String maxStr = stringArray.getMaxLengthString();
        System.out.println("Самая длинная строка: " + maxStr);
        
        double averageLength = stringArray.getAverageLength();
        System.out.println("Средняя длина строк: " + averageLength);
    }
}
