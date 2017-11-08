// Java Controlul fluxului, buclele si ramificare > FOR

// cu ajutorul buclei for, trebuie sa copiem acest sir in sirul arr1, unde toti membrii cu valoarea -1 trebuie inlocuiti cu valoarea -
// arr1 trebuie afisat apoi la iesire

public class Tema15 {
    public static void main(String[]args){
        int[] arr = {1,2,-1,4,5,-1};
        int[] arr1 = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            if(arr[i] == -1)
                arr1 [i] = 0;
            else arr1[i]=arr[i];
        }
        System.out.println(java.util.Arrays.toString(arr1));
    }
}
