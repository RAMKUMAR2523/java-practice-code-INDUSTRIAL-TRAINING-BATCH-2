import java.util.*;
public class Main{
    static int search(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        
        while(low<=high&& key>=arr[low]&& key<=arr[high]){
            int pos=low+((key-arr[low])*(high-low))/(arr[high]-arr[low]);
            
            if(arr[pos]==key)
            return pos;
            
            if(arr[pos]<key)
            low=pos+1;
            else
            high=pos-1;
            
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter element to search: ");
        int key =sc.nextInt();
        int result=search(arr,key);
        if(result==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index: "+ result);
        }
    }
}