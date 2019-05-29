package ru.krasnova;

public class StringUtil {

    public static String joinArray(String [] array, final char del){
        if (array == null){
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i=0; i<array.length-1; i++){
            result.append(array[i]);
            result.append(del);
        }
        result.append(array[array.length-1]);
        return result.toString();
    }

    public static String[] toArray(final String array, final char del){
        if (array == null){
            return null;
                    //new String[]{};
        }
        return array.split(Character.toString(del));
    }

    public static double toDouble(final String array){
        if (array == null){
            return Double.NaN;
        }
        return Double.valueOf(array);
    }

    public static String fromDouble(final double sourse){
        return String.valueOf(sourse);
    }

    public static boolean isEmpty(String value){
        return value == null || value.trim().length() == 0;
    }
}
