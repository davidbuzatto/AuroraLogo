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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe utilitária que atua no processo de build/construção do projeto, 
 * obtendo palavras-chave, funções "built-in" e operadores da linguagem de
 * programação AuroraLogo usando o arquivo de tokens gerado pelo ANTLR4 ao
 * processar a gramática da linguagem. Essa obtenção de terminais da linguagem
 * é utilizada na construção do analisador sinático do componente
 * RSyntaxTextArea para criar a colocaração da sintaxe para a linguagem
 * AuroraLogo.
 * 
 * @author Prof. Dr. David Buzatto
 */
public class Separador {
    
    public static void main( String[] args ) {
        
        if ( args.length == 12 ) {
            new Separador().executarString( 
                    Boolean.valueOf( args[0] ), 
                    args[1], 
                    args[2], 
                    args[3],
                    args[4],
                    args[5],
                    args[6],
                    args[7],
                    args[8],
                    args[9],
                    args[10],
                    args[11] );
        } else {
            
            System.out.println( "Quantidade de argumentos inválida. Executando com argumentos fixos." );
            
            new Separador().executarString( 
                    true, 
                    null, 
                    null, 
                    null,
                    "abaixar",
                    "claro",
                    "x",
                    "comprimento",
                    "arcoCosseno",
                    "segmento",
                    "=",
                    "."
            );
            
        }
        
    }
    
    public void executarString( 
            boolean print, 
            String caminhoTokens, 
            String flexT, 
            String flex,
            String linhaIniPC,
            String linhaFimPC,
            String linhaIniPC2,
            String linhaFimPC2,
            String linhaIniFC,
            String linhaFimFC,
            String linhaIniOP,
            String linhaFimOP ) {
        
        /*System.out.println( caminhoTokens );
        System.out.println( flexT );
        System.out.println( flex );*/
        
        List<String> palavrasChave = new ArrayList<>();
        List<String> palavrasChave2 = new ArrayList<>();
        List<String> funcoes = new ArrayList<>();
        List<String> operadores = new ArrayList<>();

        String replacePC = "\"PALAVRAS_CHAVE_REPLACE\"";
        String replacePC2 = "\"PALAVRAS_CHAVE2_REPLACE\"";
        String replaceFC = "\"FUNCOES_REPLACE\"";
        String replaceOP = "\"OPERADORES_REPLACE\"";

        boolean iniciarPC = false;
        boolean pararPC = false;
        boolean iniciarPC2 = false;
        boolean pararPC2 = false;
        boolean iniciarFC = false;
        boolean pararFC = false;
        boolean iniciarOP = false;
        boolean pararOP = false;

        Scanner s = new Scanner( System.in );

        if ( caminhoTokens == null ) {
            s = new Scanner( getClass().getResourceAsStream( 
                    "/br/com/davidbuzatto/auroralogo/parser/AuroraLogoLexer.tokens" ), 
                    StandardCharsets.UTF_8 );
        } else {
            try {
                s = new Scanner( new File( caminhoTokens ),
                        StandardCharsets.UTF_8 );
            } catch ( IOException ex ) {
                Logger.getLogger( Separador.class.getName() ).log( Level.SEVERE, null, ex );
            }
        }
        
        while ( s.hasNextLine() ) {

            String token = extrairToken( s.nextLine() );
            
            if ( token.equals( linhaIniPC ) ) {
                iniciarPC = true;
                iniciarPC2 = false;
                iniciarFC = false;
                iniciarOP = false;
            } else if ( token.equals( linhaIniPC2 ) ) {
                iniciarPC = false;
                iniciarPC2 = true;
                iniciarFC = false;
                iniciarOP = false;
            } else if ( token.equals( linhaIniFC ) ) {
                iniciarPC = false;
                iniciarPC2 = false;
                iniciarFC = true;
                iniciarOP = false;
            } else if ( token.equals( linhaIniOP ) ) {
                iniciarPC = false;
                iniciarPC2 = false;
                iniciarFC = false;
                iniciarOP = true;
            }
            
            if ( iniciarPC && !pararPC ) {
                palavrasChave.add( gerarToken( token, "" ) );
                palavrasChave.add( gerarToken( token, " " ) );
            }
            
            if ( iniciarPC2 && !pararPC2 ) {
                palavrasChave2.add( gerarToken( token, "" ) );
                palavrasChave2.add( gerarToken( token, " " ) );
            }

            if ( iniciarFC && !pararFC ) {
                funcoes.add( gerarToken( token, "" ) );
                funcoes.add( gerarToken( token, " " ) );
                funcoes.add( gerarToken( token, "( " ) );
                funcoes.add( gerarToken( token, "() " ) );
            }

            if ( iniciarOP && !pararOP ) {
                operadores.add( gerarToken( token, "" ) );
                operadores.add( gerarToken( token, " " ) );
            }

            if ( token.equals( linhaFimPC ) ) {
                pararPC = true;
            } else if ( token.equals( linhaFimPC2 ) ) {
                pararPC2 = true;
            } else if ( token.equals( linhaFimFC ) ) {
                pararFC = true;
            } else if ( token.equals( linhaFimOP ) ) {
                pararOP = true;
            }

        }

        if ( print ) {
            System.out.println( palavrasChave );
            System.out.println( palavrasChave2 );
            System.out.println( funcoes );
            System.out.println( operadores );
        }

        s.close();

        if ( flexT == null ) {
            s = new Scanner( getClass().getResourceAsStream( 
                    "/br/com/davidbuzatto/auroralogo/gui/sh/AuroraLogoSyntaxHighlighter.flext" ), 
                    StandardCharsets.UTF_8 );
        } else {
            try {
                s = new Scanner( new File( flexT ),
                        StandardCharsets.UTF_8 );
            } catch ( IOException ex ) {
                Logger.getLogger( Separador.class.getName() ).log( Level.SEVERE, null, ex );
            }
        }


        StringBuilder sb = new StringBuilder();

        while ( s.hasNextLine() ) {
            sb.append( s.nextLine() ).append( "\n" );
        }

        s.close();

        String dados = sb.toString();

        if ( print ) {

            System.out.println( "\nPalavras chave: " );
            System.out.println( processaLista( palavrasChave ) );
            
            System.out.println( "\nPalavras chave 2: " );
            System.out.println( processaLista( palavrasChave2 ) );

            System.out.println( "\nFunções: " );
            System.out.println( processaLista( funcoes ) );

            System.out.println( "\nOperadores: " );
            System.out.println( processaLista( operadores ) );

        }

        dados = dados.replace( replacePC, processaLista( palavrasChave ) );
        dados = dados.replace( replacePC2, processaLista( palavrasChave2 ) );
        dados = dados.replace( replaceFC, processaLista( funcoes ) );
        dados = dados.replace( replaceOP, processaLista( operadores ) );

        if ( print ) {
            System.out.println( "\n" );
            System.out.println( dados );
        }

        if ( flex == null ) {
            try ( FileWriter fw = new FileWriter( new File( "./src/br/com/davidbuzatto/auroralogo/gui/sh/AuroraLogoSyntaxHighlighter.flex" ) ) ) {
                fw.write( dados );
            } catch ( IOException exc ) {
            }
        } else {
            try ( FileWriter fw = new FileWriter( new File( flex ) ) ) {
                fw.write( dados );
            } catch ( IOException exc ) {
            }
        }
        
    }
    
    private static String extrairToken( String base ) {
        if ( base.lastIndexOf( "'=" ) != -1 ) {
            return base.substring( 1, base.lastIndexOf( "'=" ) );
        } else {
            return "XXXXXXXXXXXXXXXXXXXXXXXXX";
        }
    }
    
    private static String gerarToken( String base, String terminador ) {
        
        if ( base.equals( "." ) ) {
            base = " " + base;
        } else {
            base += terminador;
        }
        
        return "\"" + base + "\"";
        
    }
    
    private static String processaLista( List<String> lista ) {
        
        StringBuilder sb = new StringBuilder();
        Collections.sort( lista );
        
        boolean primeiro = true;
        for ( String item : lista ) {
            if ( !primeiro ) {
                sb.append( " | \n" );
            }
            sb.append( item );
            primeiro = false;
        }
        
        return sb.toString();
        
    }
    
}
