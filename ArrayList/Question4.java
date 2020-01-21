import java.util.ArrayList;

class Question4 {

    public static void filter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        //This method removes all the elements in list1 that also appear in list2

        int list = 0;

        if(list1.size() > list2.size()){

            list = list1.size();

        }else{

            list = list2.size();
        }

        for(int i = 0; i < list1.size(); i++){

            for(int j = 0; j < list2.size(); j++){

               if(list1.get(i) == list2.get(j)){
                   list1.remove(i);
                   i--;
                   
                }
            }

           
        }
    }

    public static void main (String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(2);
        list2.add(4);
        System.out.println("The list before: " + list1);
        filter(list1,list2);
        System.out.println("The list after:  " + list1);
        //the list after should be [1,3]
    }

}
