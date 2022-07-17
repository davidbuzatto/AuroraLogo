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
package br.com.davidbuzatto.auroralogo.gui.tartaruga;

import java.awt.Shape;
import java.awt.geom.Path2D;

/**
 * Classe para armazenamento de formas geométricas.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class ContainerForma implements Cloneable {

    protected Shape forma;
    protected boolean contornada;
    protected boolean preenchida;
    protected boolean mostrarControles;
    protected String nome;

    public ContainerForma( Shape forma, boolean contornada, boolean preenchida, String nome ) {
        this( forma, contornada, preenchida, false, nome );
    }
    
    public ContainerForma( Shape forma, boolean contornada, boolean preenchida, boolean mostrarControles, String nome ) {
        this.forma = forma;
        this.contornada = contornada;
        this.preenchida = preenchida;
        this.mostrarControles = mostrarControles;
        this.nome = nome;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        if ( forma instanceof Path2D.Double ) {

            ContainerForma f = (ContainerForma) super.clone();
            f.forma = (Path2D.Double) ( (Path2D.Double) forma ).clone();
            f.contornada = contornada;
            f.preenchida = preenchida;
            f.nome = nome;

            return f;

        }

        return null;

    }

    @Override
    public String toString() {
        return nome;
    }

}
