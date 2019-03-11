package rocks.zipcode.io.quiz3.fundamentals;

import com.sun.javafx.collections.ArrayListenerHelper;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {

        String[] stringArray = str.split(" ");
        ArrayList<String> translator = new ArrayList<>(Arrays.asList(stringArray));

        if ((translator.get(0).charAt(0) == 'a' ||
                translator.get(0).charAt(0) == 'e' ||
                translator.get(0).charAt(0) == 'i' ||
                translator.get(0).charAt(0) == 'o' ||
                translator.get(0).charAt(0) == 'u')) {
            return str+"way";

        }
//else {
//
//    Character c = translator.get(0).charAt(0);
//
//    translator.
//
//            for (int i = 1 ;i< str.length(); i++) {
//
//
//                translator.add((translator.get(0).charAt(0)).toString());
//            }
//
//}

        return null;
    }
}
