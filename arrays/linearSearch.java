
class Main {
    public static int linearSearch(int num[],int key){
        for(int i=0;i<=num.length-1;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    
    }
    public static void main(String[] args) {
        int num[]={4,10,22,28,30};
        int key=30;
        System.out.println("index is: " + linearSearch(num,key));
    }
}

