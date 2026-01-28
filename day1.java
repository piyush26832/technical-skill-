
// given an array count no. of elemnts having  atleast one element greater than itself 

//  for ex- int[] arr = {-3,2,6,8,4,8,5};


// ----psedo code:
// . start
// .declare
// .find the max elemnt in the array 
// . itrate and get the no. of elemnts that are not equal to max 
// .increment the counter 


public class day1 {
    public static void main(String[] args) {
        int[] arr = {-3,2,6,8,4,8,5};
        int count = 0;
        
int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<max){
                count++;
            }
        }

        System.out.println(count);
    }
}




