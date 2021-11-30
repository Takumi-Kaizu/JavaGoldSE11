package localize_format;

import java.util.*;

public class MyResources extends ListResourceBundle {
    private static final String contents[][] = {
            {"OK", "FileOpen"}, {"NG", "FileClose"}};
    protected Object[][] getContents(){
        return contents;
    }
}
