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

import br.com.davidbuzatto.auroralogo.parser.impl.Valor;
import static br.com.davidbuzatto.auroralogo.parser.impl.ValorUtils.*;
import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Um estado de execução da tartaruga. 
 * 
 * @author Prof. Dr. David Buzatto
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Estado implements Cloneable {
    
    protected double x;
    protected double y;
    protected double angulo;
    protected BasicStroke contorno;
    protected EstiloContorno estiloContorno;
    protected String texto;
    protected Color corPincel;
    protected Color corPreenchimento;
    protected Color corFundo;
    protected boolean desenhando;
    protected ContainerForma containerForma;
    protected Map<String, Valor> memoria;

    public Estado( double x, double y, double angulo, double grossura, EstiloContorno estiloContorno, Color corPincel, Color corPreenchimento, Color corFundo, boolean desenhando ) {
        
        this.x = x;
        this.y = y;
        this.angulo = angulo;
        this.corPincel = corPincel;
        this.corPreenchimento = corPreenchimento;
        this.corFundo = corFundo;
        this.desenhando = desenhando;
        this.containerForma = null;
        this.memoria = new LinkedHashMap<>();
        
        this.estiloContorno = estiloContorno;
        switch ( estiloContorno ) {
            case CONTINUO:
                this.contorno = Utils.criarContornoContinuo( grossura );
                break;
            case TRACEJADO:
                this.contorno = Utils.criarContornoTracejado( grossura );
                break;
            case PONTILHADO:
                this.contorno = Utils.criarContornoPontilhado( grossura );
                break;
        }
        
        
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getAngulo() {
        return angulo;
    }
    
    public List<String> obterIdentificadoresPorPrefixo( String prefixo ) {
        
        List<String> ids = new ArrayList<>();
        
        for ( String id : memoria.keySet() ) {
            if ( id.startsWith( prefixo ) ) {
                ids.add( id );
            }
        }
        
        return ids;
        
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        Estado e = (Estado) super.clone();
        e.x = x;
        e.y = y;
        e.angulo = angulo;
        e.texto = null;
        e.corPincel = corPincel;
        e.corPreenchimento = corPreenchimento;
        e.corFundo = corFundo;
        e.desenhando = desenhando;
        e.containerForma = null;
        e.memoria = new LinkedHashMap<>();

        e.estiloContorno = estiloContorno;
        switch ( estiloContorno ) {
            case CONTINUO:
                e.contorno = Utils.criarContornoContinuo( contorno.getLineWidth() );
                break;
            case TRACEJADO:
                e.contorno = Utils.criarContornoTracejado( contorno.getLineWidth() );
                break;
            case PONTILHADO:
                e.contorno = Utils.criarContornoPontilhado( contorno.getLineWidth() );
                break;
        }
        
        for ( Map.Entry<String, Valor> en : memoria.entrySet() ) {
            
            if ( en.getValue().isFuncao() ) {
                e.memoria.put( en.getKey(), en.getValue() );
            } else {
                e.memoria.put(en.getKey(), novoValor( en.getValue().getValor() ) );
            }
            
            // forma 1 (sintaxe do ponto para de funcionar)
            /*Valor v = en.getValue();
            
            if ( v.isArranjo() || v.isArranjoAssociativo() ) {
                e.memoria.put( en.getKey(), (Valor) SerializationUtils.clone( v ) );
            } else {
                e.memoria.put( en.getKey(), v );
            }*/
            
            // forma 2
            //e.memoria.put( en.getKey(), en.getValue() );
            
            // forma 3
            //e.memoria.put( en.getKey(), novoValor( en.getValue().getValor() ) );
            
        }

        return e;

    }

}
