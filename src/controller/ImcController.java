/*
 * AlunoController.java
 *
 * Created on September 21, 2006, 3:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package controller;

import classes.IImc;
import classes.Imc;

public class ImcController {
    
    static Imc objImc;
    public ImcController() {
    }
    
    public boolean Instancia(String sexo, float altura, float peso){
        try{
            this.objImc = new Imc();
            objImc.setSexo(sexo);
            objImc.setAltura(altura);
            objImc.setPeso(peso);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
    public String Resultado(){
        return objImc.resultadoFinal(objImc);
    }
}
