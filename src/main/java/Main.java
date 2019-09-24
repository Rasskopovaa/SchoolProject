import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students student1 =  new Students("Васильков","Вася",5);
        Students student2= new Students("Смирнов","Игорь",4);

        Teachers teacher1= new Teachers("Сидорова","Людмила","Николаевна","География");
        Teachers teacher2 = new Teachers("Амренова","Гульмира","Дауреновна","Математика");

        List listofStudents = new ArrayList<>();
        listofStudents.add(student1);
        listofStudents.add(student2);

        List listofTeachers=new ArrayList();
        listofTeachers.add(teacher1);
        listofTeachers.add(teacher2);


        System.out.println(listofStudents.toString());


        System.out.println(listofTeachers.toString());

    }
}
