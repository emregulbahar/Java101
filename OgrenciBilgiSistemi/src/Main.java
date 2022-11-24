public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Ali","9542123","TRH");
        Teacher t2=new Teacher("AHMET","0000","Mat");
        Teacher t3=new Teacher("Eko","10011","Fiz");


        Course tarih= new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course matematik=new Course("Matematik","101","Mat");
        matematik.addTeacher(t2);

        Course fizik=new Course("Fizik","101","Fiz");
        fizik.addTeacher(t3);



        Student s1= new Student("İnek Şaban","123","4",tarih,fizik,matematik);
        s1.addBulkExamNote(70,70,70);
        s1.addBulkVerbalNote(70,70,70);
        s1.printNote();
        System.out.println("");
        s1.printVerbalNote();
        System.out.println("");
        s1.isPass();


    }
}