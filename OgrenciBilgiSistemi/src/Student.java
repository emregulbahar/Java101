public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100){
            c1.note=note1;
         }

        if(note2>=0 && note2<=100) {
            c2.note=note2;
            }

            if(note3>=0 && note3<=100) {
                c3.note=note3;
            }

        }

        void addBulkVerbalNote(int vNote1,int vNote2,int vNote3){
            if(vNote1>0 && vNote1<100){
                c1.verbalNote=vNote1;
            }
            if(vNote2>0 && vNote2<100){
                c2.verbalNote=vNote2;
            }
            if(vNote3>0 && vNote3<100){
                c3.verbalNote=vNote3;
            }


            }

        void isPass(){
        this.avarage=(((this.c1.note * 0.80)+(this.c1.verbalNote * 0.20)) + ((this.c2.note * 0.80) +(this.c2.verbalNote * 0.20) )+ ((this.c3.note * 0.80) + (this.c3.verbalNote * 0.20)) )/3.0;
                if(this.avarage>55){
                    System.out.println("Sınıfı geçtiniz !");
                }else{
                    System.out.println("Sınıfı geçemediniz  !");
                }
        }

        void printNote(){
            System.out.println(c1.name + " Notu  :" + c1.note);
            System.out.println(c2.name + " Notu  :" + c2.note);
            System.out.println(c3.name + " Notu  :" + c3.note);

        }

        void printVerbalNote(){
            System.out.println(c1.name +" Sözlü Notu  :" + c1.verbalNote);
            System.out.println(c2.name +" Sözlü Notu  :" + c2.verbalNote);
            System.out.println(c3.name +" Sözlü Notu  :" + c3.verbalNote);
    }

}
