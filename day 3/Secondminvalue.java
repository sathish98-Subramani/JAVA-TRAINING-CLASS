public class Secondminvalue {
    public static void main(String[] args) {
        int a[]={90,23,45,67,25};
        int min=a[0];
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<a.length; i++){
            if(a[i]<min){
                secondmin=min;
                min=a[i];
            }
            else if(a[i]<secondmin && a[i]!=min){
                secondmin=a[i];
            }
        }
        System.out.println("Minimum value: "+min);
        System.out.println("Second Minimum value: "+secondmin);
    }
}
