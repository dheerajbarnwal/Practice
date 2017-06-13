import java.util.Arrays;

/**
 * Created by Dheeraj Kumar Barnwal on 13/06/17.
 */
public class ThreeSum {

    public void findTriplet(int arr[]){
        Boolean found = false;
        Arrays.sort(arr);
        int length = arr.length;
        for(int i=0; i<length-2; i++){
            int j=i+1,k=length-1;
            while(j < k){
                if(arr[i]+arr[j]+arr[k] < 0){
                    j++;
                }else if(arr[i]+arr[j]+arr[k] > 0){
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
        ThreeSum ts = new ThreeSum();
        int arr[] = {0, -1, 2, -3, 1};
        ts.findTriplet(arr);
    }
}
