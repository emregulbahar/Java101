import java.sql.SQLOutput;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    double startsR = Math.random() * 100;

    public Match(Fighter f1, Fighter f2, int maxWeight, int minWeight ) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;


    }

    public void run() {
        if (checkWeith()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("===========YENİ ROUND =========");
                if(startsR>=50) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWinn()) {
                        break;
                    }
                    this.f1.health=this.f2.hit(f1);
                    if(isWinn()){
                        break;
                    }
                }
                if(startsR<50) {
                    this.f1.health = this.f2.hit(f1);
                    if (isWinn()) {
                        break;
                    }
                    this.f2.health=this.f1.hit(f2);
                    if(isWinn()){
                        break;
                    }
                }
            }

            printScore();

        } else{
        System.out.println("Sporcuların ağırlıkları uyuşmuyor !");

    }

}


    boolean checkWeith(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&(this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWinn(){
        if(this.f1.health == 0){
            System.out.println("Maçı kazanan  :" +this.f2.name);
            return true;
        }
        if(this.f2.health == 0){
            System.out.println("Maçı kazanan  :" + this.f1.name);
            return true;
        }

        return false;
    }

    void printScore(){
        System.out.println("--------------------");
        System.out.println(this.f1.name + " Kalan can \t:" +this.f1.health);
        System.out.println(this.f2.name + " Kalan can \t:" +this.f2.health);
    }





}
