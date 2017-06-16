import java.util.Arrays;

/**
 * Created by Dheeraj Kumar Barnwal on 14/06/17.
 */
public class TripletSum {

    public void findTriplet(int arr[], int sum){
        Boolean found = false;
        Arrays.sort(arr);
        int length = arr.length;
        for(int i=0; i<length-2; i++){
            int j=i+1,k=length-1;
            while(j < k){
                if(arr[i]+arr[j]+arr[k] < sum){
                    j++;
                }else if(arr[i]+arr[j]+arr[k] > sum){
                    k--;
                }else{
                    System.out.println("Triplet = " + arr[i] + " " + arr[j] + " " + arr[k]);
                    j++;
                    k--;
                    found = true;
                }
            }


        }
        if(found == false){
            System.out.println("No Triplet found");
        }
    }
    public static void main(String args[]){
        TripletSum ts = new TripletSum();
        int arr[] = {0, -1, 2, -3, 1, 3};
        int sum = 3;
        ts.findTriplet(arr, sum);
    }
}
