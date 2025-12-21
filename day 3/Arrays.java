public class Arrays {
    public static void main(String[] args) {
        int a[]={90,23,45,67,25};
        int min=a[0];
        for(int i=0;i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
    
}