/**
 * Created by Murik on 01.03.2015.
 */
public class Calc {
    public static void main(String[] args){
           double a=1;
           double b=-10;
           double c=21;
           double d=b*b-4*a*c;
        //Здесь у нас переменные в которые мы подставили числовые значения и одна формула
        if(d>0){
            double x1=(Math.sqrt(d)-b)/2*a;
            double x2=(-Math.sqrt(d)-b)/2*a;
            System.out.println("Корни уравнения " +x1+ " и " +x2+ "");
        //при выводе через sout, переменные необходимо отделять от кавычек с текстом знаками +
        //("например" +x1+ "и еще" +x2)
        }
        else if(d<0){
            System.out.println("Действительных корней нет");
        //Если корней в уравнении нет выводится данная надпись "Действительных корней нет"
        }
        else if(d==0){
            double x=(Math.sqrt(d)-b)/2*a;
            System.out.println(x);
        //Здесь текст не выводится поэтому переменная написана без знаков +
        /**
        Если изменить значения переменных на те что в коментарии чуть ниже то можно это проверить.
        double a=1;
        double b=-10;
        double c=25;
        double d=b*b-4*a*c;
        */
        }
    }

}
