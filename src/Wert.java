public class Wert {
    int stat_base;
    int stat_half;
    int stat_fifth;

    public Wert(int stat){
        this.stat_base = stat;
        this.stat_half=(stat/2);
        this.stat_fifth =(stat/5);
    }

    public void print_Wert(){
        System.out.println(stat_base + " " + stat_half + " " + stat_fifth);
    }

}



