package Programme;
/*
Create a HashMap object called people that will store String keys and Integer
 values:
And use for each loop to iterate the value from Map.
 */


import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> peopleNumber = new HashMap<>();
        //Add key and values (name, id)
        peopleNumber.put("Monday" , 102);
        peopleNumber.put("Tuesday" , 103);
        peopleNumber.put("Wednesday" , 104);
        peopleNumber.put("Thuresday" , 105);
        peopleNumber.put("Friday" , 106);
        peopleNumber.put("Saturday" , 101);
        peopleNumber.put("Sunday" , 107);
        for(Map.Entry<String,Integer>peopleNum: peopleNumber.entrySet()){
            System.out.println(peopleNum.getKey() + " = " +  peopleNum.getValue());
        }
    }

}
