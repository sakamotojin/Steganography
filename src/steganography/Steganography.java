/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steganography;

/**
 *
 * @author Sakamoto Jin
 */




public class Steganography 
{  
   public static void  embedImageToFile(String imageFile , String dataFile , String key , String outputPath) throws Exception{
        Embed emb = new Embed(dataFile, imageFile, key);
        emb.embedFileInImage(outputPath);
    }
   
   public static String  extractDataFromImage(String imageFile , String resultFileLoaction, String decrptKey) throws Exception{
        Extract extr = new Extract(imageFile, decrptKey , resultFileLoaction);
        String trgt = extr.getFileFromImage();
       return ("File extracted as : " + trgt);
    }
}