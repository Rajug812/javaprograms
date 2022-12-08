package practice;

class ma3
{
    public int cal(int x,int y)//parent
    {
        //int k=5;
        return x+y;
    }
}
class raju4 extends ma3//child
{
    public int cal_adv(int x,int y){
        // int sum=k+6;
        raju4 S=new raju4();
        return x-y;
    }

}
class vamsi8 extends raju4{
    public int cal2(int x,int y)
    {
        return x*y;
    }
}
class viajy extends vamsi8{
    public int cal3(int x,int y)
    {
        return x/y;
    }
}
public class inheritance {
    public static void main(String[] args) {

        // raju4 M=new raju4();
        // vamsi8 M1=new vamsi8();
        viajy M2=new viajy();
        // raju4 S=new raju4();
        System.out.println(M2.cal(4,5));
        //System.out.println(M2.cal_adv(4,5);
        System.out.println(M2.cal2(5,7));
        System.out.println(M2.cal3(8,2));
    }
}
