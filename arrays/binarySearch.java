
class Main {
    public static int binarySearch(int num[],int key){
        int start=0,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={4,10,22,28,30};
        int key=22;
        System.out.println("index is: "+binarySearch(num,key));
    }
}

