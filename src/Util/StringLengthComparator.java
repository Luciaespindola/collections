package Util;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int comparatorResult = 0;
        //si los dos objetos son iguales , retorna un 0
        if (o1.length() > o2.length()) {
            comparatorResult = 1;
            //si el tamaño de mi primer string es mayor que el del 2do, da positivo(1)
        } else if (o1.length() < o2.length()) {
            comparatorResult = -1;
            //si el tamaño del segundo es el mayor, da un numero negativo(-1)
        }

        return comparatorResult;
    }
}
