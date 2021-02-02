/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Lucas Ramon
 */
public class Quadro {
    
    private String CPF;
    private String Nome;
    private String Data_Nasc;
    private String Sexo;
    private String cargo;
    ArrayList<Funcionario>ListaFunc;

    public Quadro(String CPF, String Nome, String Data_Nasc, String Sexo, String cargo) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Data_Nasc = Data_Nasc;
        this.Sexo = Sexo;
        this.cargo = cargo;
        ListaFunc= new ArrayList();
        
       
    } 
    
    public Quadro()
            {
                
  ListaFunc= new ArrayList();
}

   
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getData_Nasc() {
        return Data_Nasc;
    }

    public void setData_Nasc(String Data_Nasc) {
        this.Data_Nasc = Data_Nasc;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }
    public void addFunc(Funcionario F){
        F.setQuad(this);
        ListaFunc.add(F);
        
    }
}
