package operations;

public class sum {
    public static int sum(int ...numbers){
        int k=0;
        for (int j=0; j<numbers.length; j++){
            k=k+numbers[j];
        }return k;
    }

    public static void main(String[] args){
        sum m=new sum();
        System.out.println(m.sum(3,4,5,5,3));
    }
}
