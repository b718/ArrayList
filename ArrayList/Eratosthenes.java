import java.util.ArrayList;

public class Eratosthenes
{
    public static void main(String[] args){

        ArrayList<Integer> ans = primes(100);
        ArrayList<Integer> ans1 = new ArrayList<Integer>();
        
        for(int i = 2; i <= 100; i++){
            ans1.add(i);
            
            
        }
        System.out.println("Orignal " + ans1);
        System.out.println("New " + ans);
 
    }

    public static ArrayList<Integer> primes(int n){
        ArrayList<Integer> prime = new ArrayList<Integer>();

         for(int i = 2; i <= 100; i++){
            prime.add(i);
        }
        
        
        int p = 2;
        for(int i = 0; i < prime.size(); i++){
            for(int j = 0; j < prime.size(); j++){
                if(prime.get(j) % p == 0 && prime.get(j) != p){

                    prime.remove(j);
                    j--;

                }

            }
            p = prime.get(i);

        }

        return prime;
    }
}
