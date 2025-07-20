class Main {
    public static void reversedArray(int num[]) {
        int start = 0;
        int end = num.length - 1;
        
        while(start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int num[] = {4, 10, 22, 28, 30};
        
        reversedArray(num);     
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
