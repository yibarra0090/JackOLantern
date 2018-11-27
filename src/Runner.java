public class Runner {
    public static void main(String[] args){
        String [][] face = new String[10][40];
        JackOLantern face1 = new JackOLantern(face);
        face1.fill("|");
        face1.edit(" ",0,0);
        face1.edit(" ",9,39);
        face1.edit(" ",0,39);
        face1.edit(" ",9,0);
        face1.edit("O",3,6);
        face1.edit("O",3,33);
        face1.edit("^",8,20);
        System.out.println(face1);
    }
}
