import java.util.Comparator;
import java.util.List;

public class Collections {

    // Поиск элемента в списке с элементами, которые могут быть сравнены между собой
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        if (list == null || key == null) {
            throw new NullPointerException(); // Проверка на null
        }

        int fromIndex = 0;
        int toIndex = list.size(); // Установка начальных границ поиска

        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1; // Нахождение среднего элемента
            T midVal = list.get(mid); // Получение значения среднего элемента
            int cmp = midVal.compareTo(key); // Сравнение ключа с промежуточным значением
            if (cmp < 0)
                fromIndex = mid + 1; // Ключ находится в правой половине
            else if (cmp > 0)
                toIndex = mid; // Ключ находится в левой половине
            else
                return mid; // Ключ найден
        }
        return -(fromIndex + 1); // Ключ не найден, возвращаем отрицательное значение
    }

    // Поиск элемента в списке с использованием компаратора
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        if (list == null || key == null || c == null) {
            throw new NullPointerException(); // Проверка на null
        }

        int fromIndex = 0;
        int toIndex = list.size(); // Установка начальных границ поиска

        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1; // Нахождение среднего элемента
            T midVal = list.get(mid); // Получение значения среднего элемента
            int cmp = c.compare(midVal, key); // Сравнение ключа с промежуточным значением с помощью компаратора
            if (cmp < 0)
                fromIndex = mid + 1; // Ключ находится в правой половине
            else if (cmp > 0)
                toIndex = mid; // Ключ находится в левой половине
            else
                return mid; // Ключ найден
        }
        return -(fromIndex + 1); // Ключ не найден, возвращаем отрицательное значение
    }
}