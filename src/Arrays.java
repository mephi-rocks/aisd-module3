import java.util.Comparator;

public class Arrays {

    // Поиск элемента в массиве байтов
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        // Пока границы диапазона не пересеклись
        while (fromIndex < toIndex) {
            // Нахождение среднего элемента
            int mid = (fromIndex + toIndex) >>> 1;
            byte midVal = a[mid];
            // Сравнение среднего элемента с ключом
            if (midVal < key)
                fromIndex = mid + 1;   // Ключ находится в правой половине
            else if (midVal > key)
                toIndex = mid;         // Ключ находится в левой половине
            else
                return mid;            // Ключ найден
        }
        // Ключ не найден, возвращаем отрицательное значение
        return -(fromIndex + 1);
    }

    // Поиск элемента в массиве символов
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            char midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    // Поиск элемента в массиве чисел с плавающей точкой двойной точности
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            double midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else {
                // Дополнительное сравнение битовых представлений
                long midBits = Double.doubleToLongBits(midVal);
                long keyBits = Double.doubleToLongBits(key);
                if (midBits == keyBits)
                    return mid;  // Ключ найден
                if (midBits < keyBits)
                    fromIndex = mid + 1;
                else
                    toIndex = mid;
            }
        }
        return -(fromIndex + 1);
    }

    // Поиск элемента в массиве чисел с плавающей точкой одинарной точности
    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            float midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else {
                // Дополнительное сравнение битовых представлений
                int midBits = Float.floatToIntBits(midVal);
                int keyBits = Float.floatToIntBits(key);
                if (midBits == keyBits)
                    return mid;  // Ключ найден
                if (midBits < keyBits)
                    fromIndex = mid + 1;
                else
                    toIndex = mid;
            }
        }
        return -(fromIndex + 1);
    }

    // Поиск элемента в массиве целых чисел
    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            int midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    // Поиск элемента в массиве длинных чисел
    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            long midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    // Поиск элемента в массиве коротких чисел
    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            short midVal = a[mid];
            if (midVal < key)
                fromIndex = mid + 1;
            else if (midVal > key)
                toIndex = mid;
            else
                return mid;
        }
        return -(fromIndex + 1);
    }

    // Поиск элемента в обобщенном массиве с помощью компаратора
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (c == null) {
            throw new NullPointerException();
        }

        while (fromIndex < toIndex) {
            int mid = (fromIndex + toIndex) >>> 1;
            T midVal = a[mid];
            int cmp = c.compare(midVal, key);
            if (cmp < 0)
                fromIndex = mid + 1;
            else if (cmp > 0)
                toIndex = mid;
            else
                return mid; // Ключ найден
        }
        return -(fromIndex + 1);
    }
}