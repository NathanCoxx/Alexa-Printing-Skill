import java.io.File;

public class Filewalker {

    public String walk( String path, String doc ) {

        File root = new File( path );
        File[] list = root.listFiles();
        String rs = "not found";
        if (list == null) return rs;

        for(int i = 0; i < list.length; i++){
            if(list[i].isDirectory()){
            rs =   walk(list[i].getPath(), doc);
            }
            else{
                if(list[i].getName().equals(doc)){
               return list[i].getAbsolutePath();
                }
            }
        }
        return rs;
    }

  

}