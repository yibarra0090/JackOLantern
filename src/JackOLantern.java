public class JackOLantern {
    public String[][] image;
    private int width;
    private int height;

    public JackOLantern (String[][] image){
        this.image = new String[width][height];
        this.width = width;
        this.height = height;
    }

    public void fill(String fillStr){
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                image[x][y] = fillStr;
            }
        }
    }

    public void edit(String str, int row, int column){
        image[row][column] = str;
    }

    public String toString(){
        String fullImage = "";
        for (int x = 0; x < width; x++){
            String newRow = "";
            for (int y = 0; y < height; y++){
                newRow += image[x][y];
            }
            fullImage += newRow + "\n";
        }
        return fullImage;
    }
}