import java.util.ArrayList;
public class Goldbach
{
    public static void main(String[] args){
        
        for(int i = 4; i <= 100; i= i + 2){
            gold(i);
            
            
        }
        
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

    public static void gold(int n){

        ArrayList<Integer> bach = primes(n);
        
        for(int i = 0; i < bach.size(); i++){
            int firstprime = bach.get(i);
            int secondprime = n - firstprime;
            if(bach.contains(secondprime)){
                System.out.println( firstprime + " + " + secondprime + " = " + n);
                break;
                
                
            }
            
            
        }
        
    }
    
    
}
