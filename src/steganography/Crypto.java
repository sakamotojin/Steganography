package steganography;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sakamoto Jin
 */
class Crypto 
{
  private char password[];
  private int indx;
  
  Crypto(String pass)
  {
    password = pass.toCharArray();
    indx = 0;
  }

  int encode(int val)
  {
    val = val ^ password[indx];
    indx = (indx+1) % password.length;
    return val;
  }
  
  int decode(int val)
  {
    val = val ^ password[indx];
    indx = (indx+1) % password.length;
    return val;
  }
}
