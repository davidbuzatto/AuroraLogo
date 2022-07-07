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
        
        if ( args.length == 10 ) {
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
                    args[9] );
        } else {
            new Separador().executarString( 
                    true, 
                    null, 
                    null, 
                    null,
                    "\\u00E2ngulo",
                    "claro",
                    "arcoCosseno",
                    "segmento",
                    "=",
                    "."
            );
        }
        
        /*if ( args.length == 10 ) {
            new Separador().executar( 
                    Boolean.valueOf( args[0] ), 
                    args[1], 
                    args[2], 
                    args[3],
                    Integer.valueOf( args[4] ),
                    Integer.valueOf( args[5] ),
                    Integer.valueOf( args[6] ),
                    Integer.valueOf( args[7] ),
                    Integer.valueOf( args[8] ),
                    Integer.valueOf( args[9] ) );
        } else {
            new Separador().executar( 
                    true, 
                    null, 
                    null, 
                    null,
                    93,
                    133,
                    134,
                    134,
                    135,
                    171
            );
        }*/
        
    }
    
    public void executarString( 
            boolean print, 
            String caminhoTokens, 
            String flexT, 
            String flex,
            String linhaIniPC,
            String linhaFimPC,
            String linhaIniFC,
            String linhaFimFC,
            String linhaIniOP,
            String linhaFimOP ) {

        List<String> palavrasChave = new ArrayList<>();
        List<String> funcoes = new ArrayList<>();
        List<String> operadores = new ArrayList<>();

        String replacePC = "\"PALAVRAS_CHAVE_REPLACE\"";
        String replaceFC = "\"FUNCOES_REPLACE\"";
        String replaceOP = "\"OPERADORES_REPLACE\"";

        boolean iniciarPC = false;
        boolean pararPC = false;
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
                iniciarFC = false;
                iniciarOP = false;
            } else if ( token.equals( linhaIniFC ) ) {
                iniciarPC = false;
                iniciarFC = true;
                iniciarOP = false;
            } else if ( token.equals( linhaIniOP ) ) {
                iniciarPC = false;
                iniciarFC = false;
                iniciarOP = true;
            }
            
            if ( iniciarPC && !pararPC ) {
                palavrasChave.add( gerarToken( token, "" ) );
                palavrasChave.add( gerarToken( token, " " ) );
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
            } else if ( token.equals( linhaFimFC ) ) {
                pararFC = true;
            } else if ( token.equals( linhaFimOP ) ) {
                pararOP = true;
            }

        }

        if ( print ) {
            System.out.println( palavrasChave );
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

            System.out.println( "\nFunções: " );
            System.out.println( processaLista( funcoes ) );

            System.out.println( "\nOperadores: " );
            System.out.println( processaLista( operadores ) );

        }

        dados = dados.replace( replacePC, processaLista( palavrasChave ) );
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
    
    public void executar( 
            boolean print, 
            String caminhoTokens, 
            String flexT, 
            String flex,
            int linhaIniPC,
            int linhaFimPC,
            int linhaIniFC,
            int linhaFimFC,
            int linhaIniOP,
            int linhaFimOP ) {
        
        int linhaAtPC = 0;
        int linhaAtFC = 0;
        int linhaAtOP = 0;

        List<String> palavrasChave = new ArrayList<>();
        List<String> funcoes = new ArrayList<>();
        List<String> operadores = new ArrayList<>();

        String replacePC = "\"PALAVRAS_CHAVE_REPLACE\"";
        String replaceFC = "\"FUNCOES_REPLACE\"";
        String replaceOP = "\"OPERADORES_REPLACE\"";

        if ( linhaIniPC != -1 ) {
            linhaAtPC = linhaIniPC;
        }

        if ( linhaIniFC != -1 ) {
            linhaAtFC = linhaIniFC;
        }

        if ( linhaIniOP != -1 ) {
            linhaAtOP = linhaIniOP;
        }

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

        int linhaAt = 1;

        while ( s.hasNextLine() ) {

            String token = extrairToken( s.nextLine() );

            if ( linhaAt == linhaAtPC && linhaAtPC <= linhaFimPC ) {
                palavrasChave.add( gerarToken( token, "" ) );
                palavrasChave.add( gerarToken( token, " " ) );
                linhaAtPC++;
            }

            if ( linhaAt == linhaAtFC && linhaAtFC <= linhaFimFC ) {
                funcoes.add( gerarToken( token, "" ) );
                funcoes.add( gerarToken( token, " " ) );
                funcoes.add( gerarToken( token, "( " ) );
                funcoes.add( gerarToken( token, "() " ) );
                linhaAtFC++;
            }

            if ( linhaAt == linhaAtOP && linhaAtOP <= linhaFimOP ) {
                operadores.add( gerarToken( token, "" ) );
                operadores.add( gerarToken( token, " " ) );
                linhaAtOP++;
            }

            linhaAt++;

        }

        if ( print ) {
            System.out.println( palavrasChave );
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

            System.out.println( "\nFunções: " );
            System.out.println( processaLista( funcoes ) );

            System.out.println( "\nOperadores: " );
            System.out.println( processaLista( operadores ) );

        }

        dados = dados.replace( replacePC, processaLista( palavrasChave ) );
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
