public class JackOLantern {
    public String[][] faceFeatures;

    public JackOLantern (String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }
    public void fill(String str){
        for (int i = 0; i < faceFeatures.length; i++){
            for (int j = 0; j < faceFeatures[i].length; j++){
                faceFeatures[i][j] = str;
            }
        }
    }
    public void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }
    public String toString(){
        String image = "";
        for (int i = 0; i < faceFeatures.length; i++){
            String newRow = "";
            for (int j = 0; j < faceFeatures[i].length; j++){
                newRow += faceFeatures[i][j];
            }
            image += newRow + "\n";
        }
        return image;
    }
}