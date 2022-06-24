/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.gui.sh;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Separador {
    
    public static void main( String[] args ) {
        
        if ( args.length == 10 ) {
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
                    96,
                    132,
                    133,
                    133,
                    134,
                    169
            );
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

            String linha = s.nextLine();

            if ( linhaAt == linhaAtPC && linhaAtPC <= linhaFimPC ) {
                palavrasChave.add( extrairConteudo( linha ) );
                linhaAtPC++;
            }

            if ( linhaAt == linhaAtFC && linhaAtFC <= linhaFimFC ) {
                funcoes.add( extrairConteudo( linha ) );
                linhaAtFC++;
            }

            if ( linhaAt == linhaAtOP && linhaAtOP <= linhaFimOP ) {
                operadores.add( extrairConteudo( linha ) );
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
    
    private static String extrairConteudo( String base ) {
        return "\"" + base.substring( 1, base.lastIndexOf( "'=" ) ) + "\"";
    }
    
    private static String processaLista( List<String> lista ) {
        
        StringBuilder sb = new StringBuilder();
        
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
