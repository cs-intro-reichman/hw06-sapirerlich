import java.awt.Color;
public class Editor4 {
    

  

/**
 *morphs an image into its grescaled version
 */

public static void main (String[] args) {
    String source = args[0];
    int n = Integer.parseInt(args[1]);
    Color[][] sourceImage = Runigram.read(source);
    Color[][] grayScaled=Runigram.grayScaled(sourceImage);
    Runigram.setCanvas(sourceImage);
    Runigram.morph(grayScaled,sourceImage, n);
}


}
