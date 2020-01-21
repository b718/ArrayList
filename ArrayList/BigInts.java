import java.util.ArrayList;
public class BigInts
{
    public static void main (String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);

        list2.add(1);
        list2.add(0);
        list2.add(0);
        list2.add(0);

        System.out.println("List1 is " + list1);
        System.out.println("List2 is " + list2);
        System.out.println("Combination is " + add(list1,list2));

    }

    public static ArrayList<Integer> add(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> comb = new ArrayList<Integer>();
        int index1 = list1.size()-1;
        int index2 = list2.size()-1;
        int remainder = 0;

        while(index1 != -1 && index2 != -1){
            int ans = list1.get(index1) + list2.get(index2) + remainder;
            if(ans >= 10){
                remainder = 1;
                ans = ans - 10;

            }else{
                remainder = 0;

            }
            comb.add(0,ans);
            index1--;
            index2--;
        }

        while(index1 != -1){
            int ans = list1.get(index1) + remainder;

            if(ans >= 10){
                remainder = 1;
                ans = ans - 10;

            }else{
                remainder = 0;

            }
            comb.add(0,ans);
            index1--;

        }

        while(index2 != -1){
            int ans = list2.get(index2) + remainder;

            if(ans >= 10){
                remainder = 1;
                ans = ans - 10;

            }else{
                remainder = 0;

            }
            comb.add(0,ans);
            index2--;

        }

        if(remainder == 1){
            comb.add(0,1);

        }
        return comb;
    }

}
