/*
 * Copyright (C) 2022 Prof. Dr. David Buzatto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.davidbuzatto.auroralogo.gui.sh;

import java.awt.Color;

/**
 * Representação de um erro léxico ou sintático.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class Erro {
    
    private Object offendingSymbol;
    private String mensagem;
    private int linha;
    private int inicio;
    private int comprimento;
    private Color cor;

    public Erro( Object offendingSymbol, String mensagem, int linha, int inicio, int comprimento, Color cor ) {
        this.offendingSymbol = offendingSymbol;
        this.mensagem = mensagem;
        this.linha = linha;
        this.inicio = inicio;
        this.comprimento = comprimento;
        this.cor = cor;
    }

    public Object getOffendingSymbol() {
        return offendingSymbol;
    }
    
    public String getMensagem() {
        return mensagem;
    }

    public int getLinha() {
        return linha;
    }

    public int getInicio() {
        return inicio;
    }

    public int getComprimento() {
        return comprimento;
    }

    public Color getCor() {
        return cor;
    }
    
}
