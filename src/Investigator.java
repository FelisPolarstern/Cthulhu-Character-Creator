public class Investigator {
    //Attribute
     public Wert st;    //Stärke
     Wert ko;    //Konstitution
     Wert gr;    //Größe
     Wert ge;    //Geschicklichkeit
     Wert er;    //Erscheinung
     Wert in;    //Intelligenz
     Wert ma;    //Mana
     Wert bi;    //Bildung
     Wert gl;    //Glück
     Wert age;   //Alter
     Wert statur;    //Alter
     Wert sb;    //Schadensbonus

    // Beruf
    String beruf;

     //Fertigkeiten

    public Investigator(){
        this.st = new Wert(roll_attribute(3,false)*5);
        this.ko = new Wert(roll_attribute(3,false)*5);
        this.gr = new Wert(roll_attribute(2,true)*5);
        this.ge = new Wert(roll_attribute(3,false)*5);
        this.er = new Wert(roll_attribute(3,false)*5);
        this.in = new Wert(roll_attribute(2,true)*5);
        this.ma = new Wert(roll_attribute(3,false)*5);
        this.bi = new Wert(roll_attribute(2,true)*5);
        this.gl = new Wert(roll_attribute(3,false)*5);

    }

    public void print_attributes(){
        System.out.println( "Stärke: " + this.st.stat_base +  " " + this.st.stat_half + " " + this.st.stat_fifth + "\n" +
                            "Konstitution: " + this.ko.stat_base +  " " + this.ko.stat_half + " " + this.ko.stat_fifth +"\n" +
                            "Größe: " + this.gr.stat_base +  " " + this.gr.stat_half + " " + this.gr.stat_fifth + "\n" +
                            "Geschicklichkeit: " + this.ge.stat_base +  " " + this.ge.stat_half + " " + this.ge.stat_fifth + "\n" +
                            "Erscheinung: " + this.er.stat_base +  " " + this.er.stat_half + " " + this.er.stat_fifth + "\n" +
                            "Intelligenz: " + this.in.stat_base +  " " + this.in.stat_half + " " + this.in.stat_fifth + "\n" +
                            "Mana: "  + this.ma.stat_base +  " " + this.ma.stat_half + " " + this.ma.stat_fifth + "\n" +
                            "Bildung: " + this.bi.stat_base +  " " + this.bi.stat_half + " " + this.bi.stat_fifth + "\n" +
                            "Glück: " + this.gl.stat_base +  " " + this.gl.stat_half + " " + this.gl.stat_fifth + "\n");
      }


    static int roll_attribute(int count, Boolean add){
        int attribute = 0;
        for (int i = 0; i<count; i++){
            attribute = attribute + (int) (Math.random()*6+1);
        }
        if (add){
            attribute = attribute +6;
        }
        return attribute;
    }



}
