/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author joa_o
 */
public class Icone {
    
    public void InserirIcone (JFrame frm){
        try{
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/main/java/telas/imagens/iconeSemFundo.png"));
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
    
}
