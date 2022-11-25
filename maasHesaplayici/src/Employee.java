public class Employee {
    String name;
    double wage;
    int workingHour;
    int startYear;

    double totalSalary;



    public Employee(String name,double wage,int workingHour,int startYear){
        this.name=name;
        this.wage=wage;
        this.workingHour=workingHour;
        this.startYear=startYear;

    }

    double tax(){
     if(wage>1000){
            return wage *0.03;
        }else{
         return 0;
     }

    }

    double bonus(){
        if(workingHour>40){
            return (workingHour-40) *30;
        }
        return 0;
    }

    double raiseSalary(){
        if(2021 - startYear <10){
            return  wage*0.05;
        }
        if(2021 - startYear > 9 && 2021 - startYear < 20){
            return  wage*0.1;
        }
        if(2021 - startYear > 19){
            return  wage * 0.15;
        }
        return 0;
    }

    double totalSalary(){
        return totalSalary=wage + (bonus()-tax());
    }



    void toPrint(){
        System.out.println("Adı :  " +this.name);
        System.out.println("Maaşı :  " + this.wage);
        System.out.println("Çalışma Saati :  " + this.workingHour);
        System.out.println("Başlangıç Yılı :  " + this.startYear);
        System.out.println("Vergi :  " + tax());
        System.out.println("Bonus :  " + bonus() );
        System.out.println("Maaş Artışı :  " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + totalSalary());
        System.out.println("Toplam Maaş :  " + (totalSalary+(raiseSalary()-(bonus()-tax()))));

    }



}
