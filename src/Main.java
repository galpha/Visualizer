import java.io.IOException;

/**
 * Created by gomezk on 05.12.14.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        ColorMapCreator generator = new ColorMapCreator();
        generator.createColorMap("/home/gomezk/testgraph/colorMap/simpleinput"," ");
        generator.printColorMap("/home/gomezk/testgraph/colorMap/simpleinput_colorMap");
    }
}
