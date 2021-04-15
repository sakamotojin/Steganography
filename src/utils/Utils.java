/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Sakamoto Jin
 */
public class Utils {
    
    static boolean checkIfImageFile(String filePath){
        if(filePath.endsWith(".png") || filePath.endsWith(".PNG") ){
         return true;
        }
        else if(filePath.endsWith(".jpg") || filePath.endsWith(".JPG") ){
            return true;
        }
        return false;
    }
    
    public static void validateInputsForEmbeding(String imagePath , String filePath , String key , String resulFileName) throws Exception {
        
        if(!checkIfImageFile(imagePath)){
            throw new Exception("Wrong Image File");
        }
        if(key.length() < 5){
            throw new Exception(" Minimum Key Size 5");
        }
        if(!checkIfImageFile(resulFileName)){
            throw new Exception("Wrong Resultant Image File Name");
        }
    }
    
    
}
