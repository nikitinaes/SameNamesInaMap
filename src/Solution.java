
import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println(removePeopleWithSameNames(createMap()));
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Сталлоне", "Сильвестр");
        map.put("Мориконе", "Энио");
        map.put("Вивальди", "Антонио");
        map.put("Гудини", "Гарри");
        map.put("Верди", "Джузеппе");
        map.put("Марацци", "Гарри");
        //map.put("Корлионе", "Вито");
        map.put("Брацци", "Люка");
        map.put("Страдивари", "Антонио");
        return map;
    }
    public static Map<String, String> removePeopleWithSameNames(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entryToRemove = iterator.next();
            Iterator<Map.Entry<String, String>> currentEntryIterator = map.entrySet().iterator();
            while (currentEntryIterator.hasNext()) {
                Map.Entry currentEntry = currentEntryIterator.next() ;
                if (currentEntry.getValue().equals(entryToRemove.getValue()) &&
                        !currentEntry.getKey().equals(entryToRemove.getKey())) {
                    Map.Entry sameNames = currentEntry;
                    System.out.println(currentEntry);
                    }
                }
            }
        Iterator <Map.Entry <String, String>> sameNamesiterator = map.entrySet().iterator();
        while (sameNamesiterator.hasNext()) {
            Map.Entry removeEntry = sameNamesiterator.next();

        }


        return map;
    }
}
