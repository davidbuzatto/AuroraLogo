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
package br.com.davidbuzatto.auroralogo.parser.impl;

import br.com.davidbuzatto.auroralogo.gui.sh.ErroEmLinhaParser;
import java.awt.Color;
import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Ouvinte de erros do analisador sintático. Os erros gerados são inseridos
 * no parser de erros do componente RSyntaxTextArea que então é notificado para
 * atuar na atualização do componente.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class AuroraLogoErrorListener extends BaseErrorListener {

    private ErroEmLinhaParser erroLinhaParser;
    private boolean houveErro;

    public AuroraLogoErrorListener( ErroEmLinhaParser erroLinhaParser ) {
        this.erroLinhaParser = erroLinhaParser;
    }

    @Override
    public void syntaxError( Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e ) {

        List<String> stack = ( ( Parser ) recognizer ).getRuleInvocationStack();
        Collections.reverse( stack );

        erroLinhaParser.adicionarErro(
                offendingSymbol,
                line - 1,
                charPositionInLine,
                1,
                Color.RED );

        houveErro = true;

    }

    public boolean houveErro() {
        return houveErro;
    }

}
