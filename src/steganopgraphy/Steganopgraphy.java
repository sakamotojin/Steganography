/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steganopgraphy;

/**
 *
 * @author Sakamoto Jin
 */




public class Steganopgraphy 
{
  public static void main(String[] args) 
  {
    try
    {
      //Embed emb = new Embed("c:\\java\\DB.zip", "c:\\java\\Koala.jpg");
      Embed emb = new Embed("c:\\add.exe", "c:\\java\\template.png", "tiger");
      emb.embedFileInImage("template1.png");
      
      Extract extr = new Extract("c:\\java\\template1.png", "tiger");
      String trgt = extr.getFileFromImage();
      System.out.println("File extracted as : " + trgt);
    }
    catch(Exception ex)
    {
      System.out.println("Err: " +ex);
      ex.printStackTrace();
    }
  }
}