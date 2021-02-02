/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

/**
 *
 * @author Lucas Ramon
 */
public class Funcionario {
    private int cadastro;
    private Quadro Quad;

    public Funcionario() {
    }

    public Funcionario(int cadastro, Quadro Quad) {
        this.cadastro = cadastro;
        this.Quad = Quad;
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public Quadro getQuad() {
        return Quad;
    }

    public void setQuad(Quadro Quad) {
        this.Quad = Quad;
    }
    
    
    
}
