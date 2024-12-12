public class arr {
    public static void main(String[] args) {
        int arr[]=new int[15];
        int x = 18;
        arr[0]=x;
        int counter=0;
        while(counter<15){
            if(x<=18){
                arr[counter]=x;
                x=x+1;
            }
            else{
                x=4;
                arr[counter]=x;
                x=x+1;
            }
            counter++;
        }
        counter=0;
        while(counter<15){
            System.out.print(arr[counter] + " ");
            counter++;
        }
    }
}
