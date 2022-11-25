public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("A",20,120,90,20);
        Fighter f2=new Fighter("B",10,80,80,10);

        Match match=new Match(f1,f2,90,80);
        match.run();

    }
}