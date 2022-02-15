//package domain;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Exercise {
    public static void Calculate(String userDate){
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
      try{
        Date nowDate = dateFormat.parse(dateFormat.format(new Date()));
        Date birthDate = dateFormat.parse(userDate);
        int diffInDays = (int)( (nowDate.getTime() - birthDate.getTime())/ (1000 * 60 * 60 * 24) );
        System.out.println("Значення ваших віборитмів на сьогодні, на: "+ nowDate);
        System.out.println("Физ. состояние:" + Math.sin(2*Math.PI*diffInDays/23));
        System.out.println("Эмоциональное состояние:" + Math.sin(2*Math.PI*diffInDays/28));
        System.out.println("Интелектуальное состояние:" + Math.sin(2*Math.PI*diffInDays/33));
      }
      catch(Exception ex){
         System.out.println(ex);
      }
    }
}