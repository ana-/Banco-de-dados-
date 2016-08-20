/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serie;

import java.sql.Date;

/**
 *
 * @author ana
 */
public class Nome {
    
    private int id_nome;
    private String nome;
    private String informacoes;
    private Genero id_genero;
    private Date data_lancamento;

    /**
     * @return the id_nome
     */
    public int getId_nome() {
        return id_nome;
    }

    /**
     * @param id_nome the id_nome to set
     */
    public void setId_nome(int id_nome) {
        this.id_nome = id_nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the informacoes
     */
    public String getInformacoes() {
        return informacoes;
    }

    /**
     * @param informacoes the informacoes to set
     */
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    /**
     * @return the id_genero
     */
    public Genero getId_genero() {
        return id_genero;
    }

    /**
     * @param id_genero the id_genero to set
     */
    public void setId_genero(Genero id_genero) {
        this.id_genero = id_genero;
    }

    /**
     * @return the data_lancamento
     */
    public Date getData_lancamento() {
        return data_lancamento;
    }

    /**
     * @param data_lancamento the data_lancamento to set
     */
    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }
    
 
    
}
