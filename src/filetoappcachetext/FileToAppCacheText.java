/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filetoappcachetext;

/**
 *
 * @author Chris
 */
import java.io.File;
public class FileToAppCacheText {

    /**
     * @param args the command line arguments
     */
    
    private static String folderLocationPartOne = "C:/Users/Chris/Documents/Visual Studio 2013/Projects/MTGWeb/MTGWeb/";
    private static String folderLocationPartTwo = "Images/KTK";
    public static void main(String[] args) {
        File folder = new File(folderLocationPartOne + folderLocationPartTwo);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(constructAppCacheName(file.getName()));
            }
        }
    }
    
    private static String constructAppCacheName(String fileName) {
        return folderLocationPartTwo + "/" + fileName;
    }
    
}
