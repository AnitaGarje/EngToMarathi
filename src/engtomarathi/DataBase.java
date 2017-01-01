/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package engtomarathi;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Annu
 */
public class DataBase implements Serializable{
    Vector<Word> wordlist;
    public DataBase(){
    wordlist=new Vector<Word>();
    }
}

