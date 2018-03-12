/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9an3d
 */
public class StringUtils {
    
    public static boolean included(String word, String searched) {
        return word.toLowerCase().contains(searched.toLowerCase().trim());
    }
}
