import java.util.HashMap;
import java.util.Map;

public class Test8 {
    public static void main(String[] args) {
//        String[] arr={"AA", "BB", "AA", "CC", "DD"};
//// todo : find string occuring once
//// todo : find duplicate strings with Occurances
//// output : unique string : BB, CC, DD
//// output : Duplicate strings : AA=2
//
//        int[] Counts=new int[(int)Character.MAX_VALUE];
//        for(int i=0;i< arr.length;i++)
//        {
//          //  Arr charAt=arr.charAt(i);
//
//            Counts[(int)charAt]++;
//        }
//        for(int i=0;i< Counts.length;i++);
//        {
//            if(Counts[i]<0)
//            {
//                System.out.println(" "+(char)i+Counts[i]+" ");
//            }
//        }
//    }


        String[] someArray = new String[]{"A", "B", "C", "A", "B", "C"};
        Map<String, Integer> repeatationMap = new HashMap<String, Integer>();
        for (String str : someArray) {

            if (repeatationMap.containsKey(str)) {
                repeatationMap.put(str, repeatationMap.get(str) + 1);
            } else {
                repeatationMap.put(str, 1);
            }
        }

        int count = 0;
        for (int repatCount : repeatationMap.values()) {
            if (repatCount > 1) {
                count++;
            }
        }
        System.out.println("Number of Strings repeated : " + count);
    }
}
