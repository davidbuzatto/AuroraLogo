/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.davidbuzatto.auroralogo.gui;

import static br.com.davidbuzatto.auroralogo.utils.Utils.*;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoLexer;
import br.com.davidbuzatto.auroralogo.parser.AuroraLogoParser;
import br.com.davidbuzatto.auroralogo.parser.impl.DesenhistaAuroraLogoVisitor;
import br.com.davidbuzatto.auroralogo.parser.impl.AuroraLogoErrorListener;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextAreaEditorKit;
import org.fife.ui.rsyntaxtextarea.Theme;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultCaret;
import org.fife.rsta.ui.CollapsibleSectionPanel;
import org.fife.rsta.ui.GoToDialog;
import org.fife.rsta.ui.search.FindDialog;
import org.fife.rsta.ui.search.FindToolBar;
import org.fife.rsta.ui.search.ReplaceDialog;
import org.fife.rsta.ui.search.ReplaceToolBar;
import org.fife.rsta.ui.search.SearchEvent;
import static org.fife.rsta.ui.search.SearchEvent.Type.FIND;
import static org.fife.rsta.ui.search.SearchEvent.Type.MARK_ALL;
import static org.fife.rsta.ui.search.SearchEvent.Type.REPLACE;
import static org.fife.rsta.ui.search.SearchEvent.Type.REPLACE_ALL;
import org.fife.rsta.ui.search.SearchListener;
import org.fife.ui.rsyntaxtextarea.ErrorStrip;
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;
import org.fife.ui.rsyntaxtextarea.folding.FoldParserManager;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.fife.ui.rtextarea.SearchContext;
import org.fife.ui.rtextarea.SearchEngine;
import org.fife.ui.rtextarea.SearchResult;

/**
 *
 * @author David
 */
public class JanelaPrincipal extends javax.swing.JFrame implements SearchListener {

    private static final String VERSAO = "v0.1";
    private static final boolean PRODUCAO = false;
    private static final boolean DEBUG_PARSER = false;

    private Font fontePadrao;

    private Tartaruga tartaruga;

    private File arquivoAtual;
    private FileNameExtensionFilter filtroExtensao;

    private boolean pararPassoAPasso;
    private boolean pararPassoAPassoAutomatico;
    private boolean deveAtualizarComponentesExecutarPassoAPasso;

    private RSyntaxTextArea textAreaCodigo;
    private ErrorStrip errorStrip;
    private StatusBar statusBar;
    private RTextScrollPane scrollPaneCodigo;

    private FindDialog findDialog;
    private ReplaceDialog replaceDialog;
    private FindToolBar findToolBar;
    private ReplaceToolBar replaceToolBar;
    private CollapsibleSectionPanel csp;
    
    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {

        initComponents();
        montarTitulo( true );

        configurarTextAreaCodigo();
        configurarDialogosDeBusca();
        
        atualizarBotoesDesfazerRefazer( textAreaCodigo );
        atualizarQuadrosPorSegundo();
        
        fontePadrao = textAreaCodigo.getDefaultFont();
        textPaneSaida.setFont( fontePadrao );

        filtroExtensao = new FileNameExtensionFilter(
                "Arquivo AuroraLogo", "aulg" );

        // *********** persistir nas preferências ****************
        //setExtendedState( MAXIMIZED_BOTH );
        tartaruga = new Tartaruga(
                painelDesenho.getWidth() / 2,
                painelDesenho.getHeight() / 2,
                0, 1,
                Color.BLACK,
                Color.WHITE,
                true,
                painelDesenho,
                fontePadrao );
        painelDesenho.setTartaruga( tartaruga );

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupTemas = new javax.swing.ButtonGroup();
        paineCodigoFonte = new javax.swing.JPanel();
        painelTextAreaCodigo = new javax.swing.JPanel();
        painelSaida = new javax.swing.JPanel();
        scrollPaneSaida = new javax.swing.JScrollPane();
        textPaneSaida = new javax.swing.JTextPane();
        barraFerramentas = new javax.swing.JToolBar();
        btnNovo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSalvarComo = new javax.swing.JButton();
        separador1 = new javax.swing.JToolBar.Separator();
        btnDesfazer = new javax.swing.JButton();
        btnRefazer = new javax.swing.JButton();
        separador2 = new javax.swing.JToolBar.Separator();
        btnAumentarFonte = new javax.swing.JButton();
        btnDiminuirFonte = new javax.swing.JButton();
        separador3 = new javax.swing.JToolBar.Separator();
        btnExecutar = new javax.swing.JButton();
        separador4 = new javax.swing.JToolBar.Separator();
        btnExecutarPassoAPasso = new javax.swing.JButton();
        btnPararPassoAPasso = new javax.swing.JButton();
        btnInicioPassoAPasso = new javax.swing.JButton();
        btnAnteriorPassoAPasso = new javax.swing.JButton();
        btnProximoPassoAPasso = new javax.swing.JButton();
        btnFinalPassoAPasso = new javax.swing.JButton();
        sliderEstadoAtual = new javax.swing.JSlider();
        separador5 = new javax.swing.JToolBar.Separator();
        btnExecutarPassoAPassoAutomatico = new javax.swing.JButton();
        btnPararPassoAPassoAutomatico = new javax.swing.JButton();
        sliderQuadrosPorSegundo = new javax.swing.JSlider();
        lblQuadrosPorSegundo = new javax.swing.JLabel();
        preenchimento = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnGrade = new javax.swing.JToggleButton();
        btnDepurador = new javax.swing.JToggleButton();
        painelDesenhoContainer = new javax.swing.JPanel();
        painelDesenho = new br.com.davidbuzatto.auroralogo.gui.PainelDesenho();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemNovo = new javax.swing.JMenuItem();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemSalvar = new javax.swing.JMenuItem();
        menuItemSalvarComo = new javax.swing.JMenuItem();
        separadorMenuArquivo1 = new javax.swing.JPopupMenu.Separator();
        menuSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuItemDesfazer = new javax.swing.JMenuItem();
        menuItemRefazer = new javax.swing.JMenuItem();
        separadorMenuEditar1 = new javax.swing.JPopupMenu.Separator();
        menuItemRecortar = new javax.swing.JMenuItem();
        menuItemCopiar = new javax.swing.JMenuItem();
        menuItemColar = new javax.swing.JMenuItem();
        separadorMenuEditar2 = new javax.swing.JPopupMenu.Separator();
        menuItemCopiarTextoFormatado = new javax.swing.JMenuItem();
        separadorMenuEditar3 = new javax.swing.JPopupMenu.Separator();
        menuItemProcurar = new javax.swing.JMenuItem();
        menuItemSubstituir = new javax.swing.JMenuItem();
        menuItemIrPara = new javax.swing.JMenuItem();
        separadorMenuEditar4 = new javax.swing.JPopupMenu.Separator();
        menuItemAumentarFonte = new javax.swing.JMenuItem();
        menuItemDiminuirFonte = new javax.swing.JMenuItem();
        menuExecutar = new javax.swing.JMenu();
        menuItemExecutar = new javax.swing.JMenuItem();
        menuItemExecutarPassoAPasso = new javax.swing.JMenuItem();
        menuItemExecutarPassoAPassoAutomatico = new javax.swing.JMenuItem();
        separadorMenuExecutar1 = new javax.swing.JPopupMenu.Separator();
        menuItemCBGrade = new javax.swing.JCheckBoxMenuItem();
        menuItemCBDepurador = new javax.swing.JCheckBoxMenuItem();
        menuExemplos = new javax.swing.JMenu();
        menuTemas = new javax.swing.JMenu();
        menuItemRTemaClaro = new javax.swing.JRadioButtonMenuItem();
        menuItemRTemaEscuro = new javax.swing.JRadioButtonMenuItem();
        menuItemRTemaNimbus = new javax.swing.JRadioButtonMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("AuroraLogo");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        paineCodigoFonte.setBorder(javax.swing.BorderFactory.createTitledBorder("Código Fonte"));

        painelTextAreaCodigo.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout paineCodigoFonteLayout = new javax.swing.GroupLayout(paineCodigoFonte);
        paineCodigoFonte.setLayout(paineCodigoFonteLayout);
        paineCodigoFonteLayout.setHorizontalGroup(
            paineCodigoFonteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineCodigoFonteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTextAreaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );
        paineCodigoFonteLayout.setVerticalGroup(
            paineCodigoFonteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineCodigoFonteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTextAreaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Saída"));

        scrollPaneSaida.setAutoscrolls(true);

        textPaneSaida.setFocusable(false);
        scrollPaneSaida.setViewportView(textPaneSaida);

        javax.swing.GroupLayout painelSaidaLayout = new javax.swing.GroupLayout(painelSaida);
        painelSaida.setLayout(painelSaidaLayout);
        painelSaidaLayout.setHorizontalGroup(
            painelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneSaida)
                .addContainerGap())
        );
        painelSaidaLayout.setVerticalGroup(
            painelSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneSaida, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/page_white_add.png"))); // NOI18N
        btnNovo.setToolTipText("Novo");
        btnNovo.setFocusable(false);
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnNovo);

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/folder.png"))); // NOI18N
        btnAbrir.setToolTipText("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnAbrir);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/disk.png"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnSalvar);

        btnSalvarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/disk_multiple.png"))); // NOI18N
        btnSalvarComo.setToolTipText("Salvar Como");
        btnSalvarComo.setFocusable(false);
        btnSalvarComo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarComo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarComoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnSalvarComo);
        barraFerramentas.add(separador1);

        btnDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/arrow_undo.png"))); // NOI18N
        btnDesfazer.setToolTipText("Desfazer");
        btnDesfazer.setFocusable(false);
        btnDesfazer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDesfazer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfazerActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnDesfazer);

        btnRefazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/arrow_redo.png"))); // NOI18N
        btnRefazer.setToolTipText("Salvar Como");
        btnRefazer.setFocusable(false);
        btnRefazer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefazer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRefazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefazerActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnRefazer);
        barraFerramentas.add(separador2);

        btnAumentarFonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/font_add.png"))); // NOI18N
        btnAumentarFonte.setToolTipText("Aumentar Fonte");
        btnAumentarFonte.setFocusable(false);
        btnAumentarFonte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAumentarFonte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAumentarFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarFonteActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnAumentarFonte);

        btnDiminuirFonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/font_delete.png"))); // NOI18N
        btnDiminuirFonte.setToolTipText("Diminuir Fonte");
        btnDiminuirFonte.setFocusable(false);
        btnDiminuirFonte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiminuirFonte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiminuirFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuirFonteActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnDiminuirFonte);
        barraFerramentas.add(separador3);

        btnExecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/script_go.png"))); // NOI18N
        btnExecutar.setToolTipText("Executar");
        btnExecutar.setFocusable(false);
        btnExecutar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExecutar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnExecutar);
        barraFerramentas.add(separador4);

        btnExecutarPassoAPasso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/script_lightning.png"))); // NOI18N
        btnExecutarPassoAPasso.setToolTipText("Executar Passo a Passo");
        btnExecutarPassoAPasso.setFocusable(false);
        btnExecutarPassoAPasso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExecutarPassoAPasso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExecutarPassoAPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarPassoAPassoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnExecutarPassoAPasso);

        btnPararPassoAPasso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/control_stop_blue.png"))); // NOI18N
        btnPararPassoAPasso.setToolTipText("Parar Execução Passo a Passo");
        btnPararPassoAPasso.setEnabled(false);
        btnPararPassoAPasso.setFocusable(false);
        btnPararPassoAPasso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPararPassoAPasso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPararPassoAPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararPassoAPassoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnPararPassoAPasso);

        btnInicioPassoAPasso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/control_start_blue.png"))); // NOI18N
        btnInicioPassoAPasso.setToolTipText("Início");
        btnInicioPassoAPasso.setEnabled(false);
        btnInicioPassoAPasso.setFocusable(false);
        btnInicioPassoAPasso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicioPassoAPasso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInicioPassoAPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioPassoAPassoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnInicioPassoAPasso);

        btnAnteriorPassoAPasso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/control_rewind_blue.png"))); // NOI18N
        btnAnteriorPassoAPasso.setToolTipText("Anterior");
        btnAnteriorPassoAPasso.setEnabled(false);
        btnAnteriorPassoAPasso.setFocusable(false);
        btnAnteriorPassoAPasso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnteriorPassoAPasso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnteriorPassoAPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorPassoAPassoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnAnteriorPassoAPasso);

        btnProximoPassoAPasso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/control_fastforward_blue.png"))); // NOI18N
        btnProximoPassoAPasso.setToolTipText("Próximo");
        btnProximoPassoAPasso.setEnabled(false);
        btnProximoPassoAPasso.setFocusable(false);
        btnProximoPassoAPasso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProximoPassoAPasso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProximoPassoAPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoPassoAPassoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnProximoPassoAPasso);

        btnFinalPassoAPasso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/control_end_blue.png"))); // NOI18N
        btnFinalPassoAPasso.setToolTipText("Final");
        btnFinalPassoAPasso.setEnabled(false);
        btnFinalPassoAPasso.setFocusable(false);
        btnFinalPassoAPasso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFinalPassoAPasso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFinalPassoAPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalPassoAPassoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnFinalPassoAPasso);

        sliderEstadoAtual.setMaximum(50);
        sliderEstadoAtual.setSnapToTicks(true);
        sliderEstadoAtual.setToolTipText("Estado Atual");
        sliderEstadoAtual.setValue(0);
        sliderEstadoAtual.setEnabled(false);
        sliderEstadoAtual.setMaximumSize(new java.awt.Dimension(150, 20));
        sliderEstadoAtual.setMinimumSize(new java.awt.Dimension(150, 20));
        sliderEstadoAtual.setPreferredSize(new java.awt.Dimension(150, 20));
        sliderEstadoAtual.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderEstadoAtualStateChanged(evt);
            }
        });
        barraFerramentas.add(sliderEstadoAtual);
        barraFerramentas.add(separador5);

        btnExecutarPassoAPassoAutomatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/clock_go.png"))); // NOI18N
        btnExecutarPassoAPassoAutomatico.setToolTipText("Executar Passo a Passo Automático");
        btnExecutarPassoAPassoAutomatico.setFocusable(false);
        btnExecutarPassoAPassoAutomatico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExecutarPassoAPassoAutomatico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExecutarPassoAPassoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarPassoAPassoAutomaticoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnExecutarPassoAPassoAutomatico);

        btnPararPassoAPassoAutomatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/control_stop_blue.png"))); // NOI18N
        btnPararPassoAPassoAutomatico.setToolTipText("Parar Execução Passo a Passo Automático");
        btnPararPassoAPassoAutomatico.setEnabled(false);
        btnPararPassoAPassoAutomatico.setFocusable(false);
        btnPararPassoAPassoAutomatico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPararPassoAPassoAutomatico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPararPassoAPassoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararPassoAPassoAutomaticoActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnPararPassoAPassoAutomatico);

        sliderQuadrosPorSegundo.setMajorTickSpacing(5);
        sliderQuadrosPorSegundo.setMaximum(300);
        sliderQuadrosPorSegundo.setMinimum(5);
        sliderQuadrosPorSegundo.setMinorTickSpacing(5);
        sliderQuadrosPorSegundo.setSnapToTicks(true);
        sliderQuadrosPorSegundo.setToolTipText("Velocidade Passo a Passo");
        sliderQuadrosPorSegundo.setValue(100);
        sliderQuadrosPorSegundo.setMaximumSize(new java.awt.Dimension(150, 20));
        sliderQuadrosPorSegundo.setMinimumSize(new java.awt.Dimension(150, 20));
        sliderQuadrosPorSegundo.setPreferredSize(new java.awt.Dimension(150, 20));
        sliderQuadrosPorSegundo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderQuadrosPorSegundoStateChanged(evt);
            }
        });
        barraFerramentas.add(sliderQuadrosPorSegundo);

        lblQuadrosPorSegundo.setText("quadros por segundo");
        lblQuadrosPorSegundo.setMaximumSize(new java.awt.Dimension(150, 16));
        lblQuadrosPorSegundo.setMinimumSize(new java.awt.Dimension(150, 16));
        lblQuadrosPorSegundo.setPreferredSize(new java.awt.Dimension(150, 16));
        barraFerramentas.add(lblQuadrosPorSegundo);
        barraFerramentas.add(preenchimento);

        btnGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/note.png"))); // NOI18N
        btnGrade.setToolTipText("Grade");
        btnGrade.setFocusable(false);
        btnGrade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradeActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnGrade);

        btnDepurador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/bug.png"))); // NOI18N
        btnDepurador.setToolTipText("Depurador");
        btnDepurador.setFocusable(false);
        btnDepurador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDepurador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDepurador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepuradorActionPerformed(evt);
            }
        });
        barraFerramentas.add(btnDepurador);

        painelDesenhoContainer.setBorder(javax.swing.BorderFactory.createTitledBorder("Desenho"));

        javax.swing.GroupLayout painelDesenhoLayout = new javax.swing.GroupLayout(painelDesenho);
        painelDesenho.setLayout(painelDesenhoLayout);
        painelDesenhoLayout.setHorizontalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelDesenhoLayout.setVerticalGroup(
            painelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelDesenhoContainerLayout = new javax.swing.GroupLayout(painelDesenhoContainer);
        painelDesenhoContainer.setLayout(painelDesenhoContainerLayout);
        painelDesenhoContainerLayout.setHorizontalGroup(
            painelDesenhoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDesenhoContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDesenhoContainerLayout.setVerticalGroup(
            painelDesenhoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDesenhoContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDesenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuArquivo.setText("Arquivo");

        menuItemNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/page_white_add.png"))); // NOI18N
        menuItemNovo.setText("Novo");
        menuItemNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNovoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemNovo);

        menuItemAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/folder.png"))); // NOI18N
        menuItemAbrir.setText("Abrir");
        menuItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemAbrir);

        menuItemSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/disk.png"))); // NOI18N
        menuItemSalvar.setText("Salvar");
        menuItemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSalvar);

        menuItemSalvarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/disk_multiple.png"))); // NOI18N
        menuItemSalvarComo.setText("Salvar Como");
        menuItemSalvarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalvarComoActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSalvarComo);
        menuArquivo.add(separadorMenuArquivo1);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/door_out.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        barraMenu.add(menuArquivo);

        menuEditar.setText("Editar");

        menuItemDesfazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/arrow_undo.png"))); // NOI18N
        menuItemDesfazer.setText("Defazer");
        menuItemDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDesfazerActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemDesfazer);

        menuItemRefazer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/arrow_redo.png"))); // NOI18N
        menuItemRefazer.setText("Refazer");
        menuItemRefazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRefazerActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemRefazer);
        menuEditar.add(separadorMenuEditar1);

        menuItemRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/cut_red.png"))); // NOI18N
        menuItemRecortar.setText("Recortar");
        menuItemRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRecortarActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemRecortar);

        menuItemCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/page_white_copy.png"))); // NOI18N
        menuItemCopiar.setText("Copiar");
        menuItemCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCopiarActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemCopiar);

        menuItemColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/page_white_paste.png"))); // NOI18N
        menuItemColar.setText("Colar");
        menuItemColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemColarActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemColar);
        menuEditar.add(separadorMenuEditar2);

        menuItemCopiarTextoFormatado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/page_word.png"))); // NOI18N
        menuItemCopiarTextoFormatado.setText("Copiar Texto Formatado");
        menuItemCopiarTextoFormatado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCopiarTextoFormatadoActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemCopiarTextoFormatado);
        menuEditar.add(separadorMenuEditar3);

        menuItemProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/find.png"))); // NOI18N
        menuItemProcurar.setText("Procurar...");
        menuItemProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemProcurarActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemProcurar);

        menuItemSubstituir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/arrow_refresh_small.png"))); // NOI18N
        menuItemSubstituir.setText("Substituir...");
        menuItemSubstituir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSubstituirActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemSubstituir);

        menuItemIrPara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/pencil_go.png"))); // NOI18N
        menuItemIrPara.setText("Ir para linha...");
        menuItemIrPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIrParaActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemIrPara);
        menuEditar.add(separadorMenuEditar4);

        menuItemAumentarFonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/font_add.png"))); // NOI18N
        menuItemAumentarFonte.setText("Aumentar Fonte");
        menuItemAumentarFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAumentarFonteActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemAumentarFonte);

        menuItemDiminuirFonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/font_delete.png"))); // NOI18N
        menuItemDiminuirFonte.setText("Diminuir Fonte");
        menuItemDiminuirFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDiminuirFonteActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemDiminuirFonte);

        barraMenu.add(menuEditar);

        menuExecutar.setText("Executar");

        menuItemExecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/script_go.png"))); // NOI18N
        menuItemExecutar.setText("Executar");
        menuItemExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExecutarActionPerformed(evt);
            }
        });
        menuExecutar.add(menuItemExecutar);

        menuItemExecutarPassoAPasso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/script_lightning.png"))); // NOI18N
        menuItemExecutarPassoAPasso.setText("Executar Passo a Passo");
        menuItemExecutarPassoAPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExecutarPassoAPassoActionPerformed(evt);
            }
        });
        menuExecutar.add(menuItemExecutarPassoAPasso);

        menuItemExecutarPassoAPassoAutomatico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/clock_go.png"))); // NOI18N
        menuItemExecutarPassoAPassoAutomatico.setText("Executar Passo a Passo (Automático)");
        menuItemExecutarPassoAPassoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExecutarPassoAPassoAutomaticoActionPerformed(evt);
            }
        });
        menuExecutar.add(menuItemExecutarPassoAPassoAutomatico);
        menuExecutar.add(separadorMenuExecutar1);

        menuItemCBGrade.setText("Mostrar Grade");
        menuItemCBGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/note.png"))); // NOI18N
        menuItemCBGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCBGradeActionPerformed(evt);
            }
        });
        menuExecutar.add(menuItemCBGrade);

        menuItemCBDepurador.setText("Mostrar Depurador");
        menuItemCBDepurador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/bug.png"))); // NOI18N
        menuItemCBDepurador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCBDepuradorActionPerformed(evt);
            }
        });
        menuExecutar.add(menuItemCBDepurador);

        barraMenu.add(menuExecutar);

        menuExemplos.setText("Exemplos");
        barraMenu.add(menuExemplos);

        menuTemas.setText("Temas");

        btnGroupTemas.add(menuItemRTemaClaro);
        menuItemRTemaClaro.setSelected(true);
        menuItemRTemaClaro.setText("Claro");
        menuItemRTemaClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRTemaClaroActionPerformed(evt);
            }
        });
        menuTemas.add(menuItemRTemaClaro);

        btnGroupTemas.add(menuItemRTemaEscuro);
        menuItemRTemaEscuro.setText("Escuro");
        menuItemRTemaEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRTemaEscuroActionPerformed(evt);
            }
        });
        menuTemas.add(menuItemRTemaEscuro);

        btnGroupTemas.add(menuItemRTemaNimbus);
        menuItemRTemaNimbus.setText("Nimbus");
        menuItemRTemaNimbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRTemaNimbusActionPerformed(evt);
            }
        });
        menuTemas.add(menuItemRTemaNimbus);

        barraMenu.add(menuTemas);

        menuAjuda.setText("Ajuda");

        menuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/davidbuzatto/auroralogo/gui/icones/help.png"))); // NOI18N
        menuItemSobre.setText("Sobre...");
        menuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemSobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paineCodigoFonte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDesenhoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(barraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(barraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paineCodigoFonte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelDesenhoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        novoArquivo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        abrirArquivo();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarArquivo();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        executar();
    }//GEN-LAST:event_btnExecutarActionPerformed

    private void btnExecutarPassoAPassoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarPassoAPassoAutomaticoActionPerformed
        executarPassoAPassoAutomatico();
    }//GEN-LAST:event_btnExecutarPassoAPassoAutomaticoActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized

        if ( tartaruga != null ) {

            tartaruga.limpar();
            tartaruga.atualizarPosicaoEstadoInicial( painelDesenho.getWidth() / 2, painelDesenho.getHeight() / 2 );
            painelTextAreaCodigo.repaint();

            mudarEstadoGUI( true );
            btnPararPassoAPasso.setEnabled( false );
            btnInicioPassoAPasso.setEnabled( false );
            btnAnteriorPassoAPasso.setEnabled( false );
            btnProximoPassoAPasso.setEnabled( false );
            btnFinalPassoAPasso.setEnabled( false );

            deveAtualizarComponentesExecutarPassoAPasso = false;
            sliderEstadoAtual.setEnabled( false );
            sliderEstadoAtual.setValue( 0 );
            sliderEstadoAtual.setMaximum( 100 );
            deveAtualizarComponentesExecutarPassoAPasso = true;

            btnPararPassoAPassoAutomatico.setEnabled( false );

            pararPassoAPasso = true;

        }

    }//GEN-LAST:event_formComponentResized

    private void btnSalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarComoActionPerformed
        salvarArquivoComo();
    }//GEN-LAST:event_btnSalvarComoActionPerformed

    private void menuItemNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNovoActionPerformed
        novoArquivo();
    }//GEN-LAST:event_menuItemNovoActionPerformed

    private void menuItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAbrirActionPerformed
        abrirArquivo();
    }//GEN-LAST:event_menuItemAbrirActionPerformed

    private void menuItemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalvarActionPerformed
        salvarArquivo();
    }//GEN-LAST:event_menuItemSalvarActionPerformed

    private void menuItemSalvarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalvarComoActionPerformed
        salvarArquivoComo();
    }//GEN-LAST:event_menuItemSalvarComoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        sair();
    }//GEN-LAST:event_menuSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sair();
    }//GEN-LAST:event_formWindowClosing

    private void btnDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesfazerActionPerformed
        desfazer();
    }//GEN-LAST:event_btnDesfazerActionPerformed

    private void btnRefazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefazerActionPerformed
        refazer();
    }//GEN-LAST:event_btnRefazerActionPerformed

    private void btnPararPassoAPassoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararPassoAPassoAutomaticoActionPerformed

        mudarEstadoGUI( true );

        btnExecutarPassoAPassoAutomatico.setEnabled( true );
        btnPararPassoAPassoAutomatico.setEnabled( false );

        pararPassoAPassoAutomatico = true;

    }//GEN-LAST:event_btnPararPassoAPassoAutomaticoActionPerformed

    private void btnInicioPassoAPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioPassoAPassoActionPerformed
        tartaruga.irParaEstadoInicial();
        atualizarComponentesExecutarPassoAPasso();
        sliderEstadoAtual.setValue( tartaruga.getEstadoAtual() );
        painelDesenho.repaint();
    }//GEN-LAST:event_btnInicioPassoAPassoActionPerformed

    private void btnAnteriorPassoAPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorPassoAPassoActionPerformed
        tartaruga.irParaEstadoAnterior();
        atualizarComponentesExecutarPassoAPasso();
        sliderEstadoAtual.setValue( tartaruga.getEstadoAtual() );
        painelDesenho.repaint();
    }//GEN-LAST:event_btnAnteriorPassoAPassoActionPerformed

    private void btnProximoPassoAPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoPassoAPassoActionPerformed
        tartaruga.irParaProximoEstado();
        atualizarComponentesExecutarPassoAPasso();
        sliderEstadoAtual.setValue( tartaruga.getEstadoAtual() );
        painelDesenho.repaint();
    }//GEN-LAST:event_btnProximoPassoAPassoActionPerformed

    private void btnFinalPassoAPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalPassoAPassoActionPerformed
        tartaruga.irParaEstadoFinal();
        atualizarComponentesExecutarPassoAPasso();
        sliderEstadoAtual.setValue( tartaruga.getEstadoAtual() );
        painelDesenho.repaint();
    }//GEN-LAST:event_btnFinalPassoAPassoActionPerformed

    private void btnExecutarPassoAPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarPassoAPassoActionPerformed
        executarPassoAPasso();
    }//GEN-LAST:event_btnExecutarPassoAPassoActionPerformed

    private void btnPararPassoAPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararPassoAPassoActionPerformed

        mudarEstadoGUI( true );

        btnExecutarPassoAPasso.setEnabled( true );
        btnPararPassoAPasso.setEnabled( false );

        btnInicioPassoAPasso.setEnabled( false );
        btnProximoPassoAPasso.setEnabled( false );
        btnAnteriorPassoAPasso.setEnabled( false );
        btnFinalPassoAPasso.setEnabled( false );

        deveAtualizarComponentesExecutarPassoAPasso = false;
        sliderEstadoAtual.setEnabled( false );
        sliderEstadoAtual.setValue( 0 );
        sliderEstadoAtual.setMaximum( 100 );
        deveAtualizarComponentesExecutarPassoAPasso = true;

        btnPararPassoAPassoAutomatico.setEnabled( false );

        //tartaruga.limpar();
        painelDesenho.repaint();

    }//GEN-LAST:event_btnPararPassoAPassoActionPerformed

    private void menuItemDesfazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDesfazerActionPerformed
        desfazer();
    }//GEN-LAST:event_menuItemDesfazerActionPerformed

    private void menuItemRefazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRefazerActionPerformed
        refazer();
    }//GEN-LAST:event_menuItemRefazerActionPerformed

    private void menuItemRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRecortarActionPerformed
        textAreaCodigo.cut();
    }//GEN-LAST:event_menuItemRecortarActionPerformed

    private void menuItemCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCopiarActionPerformed
        textAreaCodigo.copy();
    }//GEN-LAST:event_menuItemCopiarActionPerformed

    private void menuItemColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemColarActionPerformed
        textAreaCodigo.paste();
    }//GEN-LAST:event_menuItemColarActionPerformed

    private void menuItemCopiarTextoFormatadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCopiarTextoFormatadoActionPerformed
        textAreaCodigo.copyAsStyledText();
    }//GEN-LAST:event_menuItemCopiarTextoFormatadoActionPerformed

    private void menuItemAumentarFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAumentarFonteActionPerformed
        aumentarFonte();
    }//GEN-LAST:event_menuItemAumentarFonteActionPerformed

    private void menuItemDiminuirFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDiminuirFonteActionPerformed
        diminuirFonte();
    }//GEN-LAST:event_menuItemDiminuirFonteActionPerformed

    private void menuItemExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExecutarActionPerformed
        executar();
    }//GEN-LAST:event_menuItemExecutarActionPerformed

    private void menuItemExecutarPassoAPassoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExecutarPassoAPassoAutomaticoActionPerformed
        executarPassoAPassoAutomatico();
    }//GEN-LAST:event_menuItemExecutarPassoAPassoAutomaticoActionPerformed

    private void menuItemExecutarPassoAPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExecutarPassoAPassoActionPerformed
        executarPassoAPasso();
    }//GEN-LAST:event_menuItemExecutarPassoAPassoActionPerformed

    private void menuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSobreActionPerformed
        JOptionPane.showMessageDialog( this, "AuroraLogo - " + VERSAO, "Sobre...", JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_menuItemSobreActionPerformed

    private void btnDiminuirFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuirFonteActionPerformed
        diminuirFonte();
    }//GEN-LAST:event_btnDiminuirFonteActionPerformed

    private void btnAumentarFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarFonteActionPerformed
        aumentarFonte();
    }//GEN-LAST:event_btnAumentarFonteActionPerformed

    private void btnDepuradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepuradorActionPerformed

        tartaruga.setDepuradorAtivo( !tartaruga.isDepuradorAtivo() );
        setBooleanPref( PREF_DEPURADOR_ATIVO, tartaruga.isDepuradorAtivo() );

        menuItemCBDepurador.setSelected( tartaruga.isDepuradorAtivo() );
        menuItemCBDepurador.setText( tartaruga.isDepuradorAtivo() ? "Esconder Depurador" : "Mostrar Depurador" );

        painelDesenho.repaint();

    }//GEN-LAST:event_btnDepuradorActionPerformed

    private void menuItemCBDepuradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCBDepuradorActionPerformed

        tartaruga.setDepuradorAtivo( !tartaruga.isDepuradorAtivo() );
        setBooleanPref( PREF_DEPURADOR_ATIVO, tartaruga.isDepuradorAtivo() );

        btnDepurador.setSelected( tartaruga.isDepuradorAtivo() );
        menuItemCBDepurador.setText( tartaruga.isDepuradorAtivo() ? "Esconder Depurador" : "Mostrar Depurador" );

        painelDesenho.repaint();

    }//GEN-LAST:event_menuItemCBDepuradorActionPerformed

    private void sliderQuadrosPorSegundoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderQuadrosPorSegundoStateChanged
        atualizarQuadrosPorSegundo();
        setIntPref( PREF_VALOR_SLIDER_PASSO_AUTOMATICO, sliderQuadrosPorSegundo.getValue() );
    }//GEN-LAST:event_sliderQuadrosPorSegundoStateChanged

    private void menuItemRTemaClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRTemaClaroActionPerformed
        configurarTemaClaro();
    }//GEN-LAST:event_menuItemRTemaClaroActionPerformed

    private void menuItemRTemaEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRTemaEscuroActionPerformed
        configurarTemaEscuro();
    }//GEN-LAST:event_menuItemRTemaEscuroActionPerformed

    private void menuItemRTemaNimbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRTemaNimbusActionPerformed
        configurarTemaNimbus();
    }//GEN-LAST:event_menuItemRTemaNimbusActionPerformed

    private void btnGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradeActionPerformed

        tartaruga.setGradeAtiva( !tartaruga.isGradeAtiva() );
        setBooleanPref( PREF_GRADE_ATIVA, tartaruga.isGradeAtiva() );

        menuItemCBGrade.setSelected( tartaruga.isGradeAtiva() );
        menuItemCBGrade.setText( tartaruga.isGradeAtiva() ? "Esconder Grade" : "Mostrar Grade" );

        painelDesenho.repaint();

    }//GEN-LAST:event_btnGradeActionPerformed

    private void menuItemCBGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCBGradeActionPerformed

        tartaruga.setGradeAtiva( !tartaruga.isGradeAtiva() );
        setBooleanPref( PREF_GRADE_ATIVA, tartaruga.isGradeAtiva() );

        btnGrade.setSelected( tartaruga.isGradeAtiva() );
        menuItemCBGrade.setText( tartaruga.isGradeAtiva() ? "Esconder Grade" : "Mostrar Grade" );

        painelDesenho.repaint();

    }//GEN-LAST:event_menuItemCBGradeActionPerformed

    private void sliderEstadoAtualStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderEstadoAtualStateChanged

        tartaruga.setEstadoAtual( sliderEstadoAtual.getValue() );

        if ( deveAtualizarComponentesExecutarPassoAPasso ) {
            atualizarComponentesExecutarPassoAPasso();
        }

        painelDesenho.repaint();

    }//GEN-LAST:event_sliderEstadoAtualStateChanged

    private void menuItemProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemProcurarActionPerformed
        if ( replaceDialog.isVisible() ) {
            replaceDialog.setVisible( false );
        }
        findDialog.setVisible( true );
    }//GEN-LAST:event_menuItemProcurarActionPerformed

    private void menuItemSubstituirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSubstituirActionPerformed
        if ( findDialog.isVisible() ) {
            findDialog.setVisible( false );
        }
        replaceDialog.setVisible( true );
    }//GEN-LAST:event_menuItemSubstituirActionPerformed

    private void menuItemIrParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIrParaActionPerformed

        if ( findDialog.isVisible() ) {
            findDialog.setVisible( false );
        }
        
        if ( replaceDialog.isVisible() ) {
            replaceDialog.setVisible( false );
        }
        
        GoToDialog dialogo = new GoToDialog( JanelaPrincipal.this );
        dialogo.setMaxLineNumberAllowed( textAreaCodigo.getLineCount() );
        dialogo.setVisible( true );
        int linha = dialogo.getLineNumber();
        
        if ( linha > 0 ) {
            try {
                textAreaCodigo.setCaretPosition( textAreaCodigo.getLineStartOffset( linha - 1 ) );
            } catch ( BadLocationException exc ) {
                UIManager.getLookAndFeel().provideErrorFeedback( textAreaCodigo );
                exc.printStackTrace();
            }
        }

    }//GEN-LAST:event_menuItemIrParaActionPerformed

    private void atualizarQuadrosPorSegundo() {
        lblQuadrosPorSegundo.setText(
                String.format( " %d quadros por segundo",
                        sliderQuadrosPorSegundo.getValue() ) );
    }

    private void montarTitulo() {

        setTitle( "AuroraLogo - " + VERSAO );

        if ( arquivoAtual != null ) {
            setTitle( getTitle() + " - " + arquivoAtual.getName() );
        } else {
            setTitle( getTitle() + " - " + "Sem título" );
        }

    }

    private void montarTitulo( boolean inserirAsterisco ) {

        montarTitulo();

        /*if ( inserirAsterisco ) {
            setTitle( getTitle() + "*" );
        }*/
    }

    private void configurarTextAreaCodigo() {

        textAreaCodigo = new RSyntaxTextArea();

        textAreaCodigo.setTabSize( 4 );
        textAreaCodigo.setCaretPosition( 0 );
        textAreaCodigo.setMarkOccurrences( true );
        textAreaCodigo.setCodeFoldingEnabled( true );
        textAreaCodigo.setClearWhitespaceLinesEnabled( false );
        textAreaCodigo.setMarginLineEnabled( true );
        textAreaCodigo.requestFocusInWindow();

        DefaultCaret caret = ( DefaultCaret ) textPaneSaida.getCaret();
        caret.setUpdatePolicy( DefaultCaret.ALWAYS_UPDATE );

        InputMap im = textAreaCodigo.getInputMap();
        ActionMap am = textAreaCodigo.getActionMap();

        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_MINUS, KeyEvent.CTRL_DOWN_MASK ), "decreaseFontSize" );
        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_SUBTRACT, KeyEvent.CTRL_DOWN_MASK ), "decreaseFontSize" );
        //am.put( "decreaseFontSize", new RSyntaxTextAreaEditorKit.DecreaseFontSizeAction() );
        am.put( "decreaseFontSize", new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                diminuirFonte();
            }
        } );

        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_PLUS, KeyEvent.CTRL_DOWN_MASK ), "increaseFontSize" );
        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_EQUALS, KeyEvent.CTRL_DOWN_MASK ), "increaseFontSize" );
        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_ADD, KeyEvent.CTRL_DOWN_MASK ), "increaseFontSize" );
        //am.put( "increaseFontSize", new RSyntaxTextAreaEditorKit.IncreaseFontSizeAction() );
        am.put( "increaseFontSize", new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                aumentarFonte();
            }
        } );

        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_0, KeyEvent.CTRL_DOWN_MASK ), "fontSizeToDefault" );
        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_NUMPAD0, KeyEvent.CTRL_DOWN_MASK ), "fontSizeToDefault" );
        am.put( "fontSizeToDefault", new AbstractAction() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                textAreaCodigo.setFont( fontePadrao );
                textPaneSaida.setFont( fontePadrao );
            }
        } );

        int ctrlShift = InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK;
        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_C, ctrlShift ), "copyAsStyledText" );
        am.put( "copyAsStyledText", new RSyntaxTextAreaEditorKit.CopyCutAsStyledTextAction( false ) );

        JPopupMenu pMenu = textAreaCodigo.getPopupMenu();
        JMenuItem menuItemCor = new JMenuItem( "Inserir Cor" );
        menuItemCor.setIcon( new ImageIcon( getClass().getResource( "/br/com/davidbuzatto/auroralogo/gui/icones/palette.png" ) ) );
        pMenu.add( new JSeparator() );
        pMenu.add( menuItemCor );

        menuItemCor.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                inserirCorTextAreaCodigo();
            }
        } );

        textAreaCodigo.getDocument().addDocumentListener( new DocumentListener() {

            @Override
            public void insertUpdate( DocumentEvent e ) {
                montarTitulo( true );
                atualizarBotoesDesfazerRefazer( textAreaCodigo );
            }

            @Override
            public void removeUpdate( DocumentEvent e ) {
                montarTitulo( true );
                atualizarBotoesDesfazerRefazer( textAreaCodigo );
            }

            @Override
            public void changedUpdate( DocumentEvent e ) {
                montarTitulo( true );
                atualizarBotoesDesfazerRefazer( textAreaCodigo );
            }

        } );

        FoldParserManager.get().addFoldParserMapping( "text/AuroraLogo", new CurlyFoldParser() );

        AbstractTokenMakerFactory atmf = ( AbstractTokenMakerFactory ) TokenMakerFactory.getDefaultInstance();
        atmf.putMapping( "text/AuroraLogo", "br.com.davidbuzatto.auroralogo.gui.sh.AuroraLogoSyntaxHighlighter" );
        textAreaCodigo.setSyntaxEditingStyle( "text/AuroraLogo" );

        // se definido pelo usuário
        /*SyntaxScheme syntaxScheme = new SyntaxScheme( true );
        syntaxScheme.setStyle( SyntaxScheme.RESERVED_WORD, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.RESERVED_WORD_2, new Style( new Color( getIntPref( "RESERVED_WORD_2" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.IDENTIFIER, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.OPERATOR, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.FUNCTION, new Style( new Color( getIntPref( "FUNCTION" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.LITERAL_NUMBER_DECIMAL_INT, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.LITERAL_NUMBER_FLOAT, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.LITERAL_NUMBER_HEXADECIMAL, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.COMMENT_EOL, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.COMMENT_MULTILINE, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        syntaxScheme.setStyle( SyntaxScheme.COMMENT_DOCUMENTATION, new Style( new Color( getIntPref( "RESERVED_WORD" ) ) ) );
        textAreaCodigo.setSyntaxScheme( syntaxScheme );*/
        
        errorStrip = new ErrorStrip( textAreaCodigo );
        scrollPaneCodigo = new RTextScrollPane( textAreaCodigo, true );
        statusBar = new StatusBar();
        
        csp = new CollapsibleSectionPanel();
        csp.add( scrollPaneCodigo );
        
        painelTextAreaCodigo.add( csp, BorderLayout.CENTER );
        painelTextAreaCodigo.add( errorStrip, BorderLayout.LINE_END );
        painelTextAreaCodigo.add( statusBar, BorderLayout.SOUTH );

        if ( PRODUCAO ) {
            carregarTemplate( "novoArquivo", true );
        } else {
            carregarTemplate( "testesGrande", true );
        }

    }

    private void configurarDialogosDeBusca() {

        findDialog = new FindDialog( this, this );
        replaceDialog = new ReplaceDialog( this, this );
        
        /*SwingUtilities.updateComponentTreeUI(JanelaPrincipal.this);
        findDialog.updateUI();
        replaceDialog.updateUI();*/

        // This ties the properties of the two dialogs together (match case,
        // regex, etc.).
        SearchContext context = findDialog.getSearchContext();
        replaceDialog.setSearchContext( context );

        // Create tool bars and tie their search contexts together also.
        findToolBar = new FindToolBar( this );
        findToolBar.setSearchContext( context );
        replaceToolBar = new ReplaceToolBar( this );
        replaceToolBar.setSearchContext( context );
        
        KeyStroke ks = KeyStroke.getKeyStroke( KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK );
        Action a = csp.addBottomComponent( ks, findToolBar );
        a.putValue( Action.NAME, "Mostrar Barra Localizar");
        
        ks = KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK );
        a = csp.addBottomComponent(ks, replaceToolBar);
        a.putValue( Action.NAME, "Mostrar Barra Substituir");

    }

    private void desfazer() {
        textAreaCodigo.undoLastAction();
        atualizarBotoesDesfazerRefazer( textAreaCodigo );
    }

    private void refazer() {
        textAreaCodigo.redoLastAction();
        atualizarBotoesDesfazerRefazer( textAreaCodigo );
    }

    private void aumentarFonte() {
        Font f = textAreaCodigo.getFont();
        Font nf = new Font( f.getName(), f.getStyle(), f.getSize() == 40 ? 40 : f.getSize() + 1 );
        textAreaCodigo.setFont( nf );
        textPaneSaida.setFont( nf );
    }

    private void diminuirFonte() {
        Font f = textAreaCodigo.getFont();
        Font nf = new Font( f.getName(), f.getStyle(), f.getSize() == 2 ? 2 : f.getSize() - 1 );
        textAreaCodigo.setFont( nf );
        textPaneSaida.setFont( nf );
    }

    private void atualizarBotoesDesfazerRefazer( RSyntaxTextArea textAreaCodigo ) {

        if ( textAreaCodigo.canUndo() ) {
            btnDesfazer.setEnabled( true );
            menuItemDesfazer.setEnabled( true );
        } else {
            btnDesfazer.setEnabled( false );
            menuItemDesfazer.setEnabled( false );
        }

        if ( textAreaCodigo.canRedo() ) {
            btnRefazer.setEnabled( true );
            menuItemRefazer.setEnabled( true );
        } else {
            btnRefazer.setEnabled( false );
            menuItemRefazer.setEnabled( false );
        }

    }

    private boolean executarCodigo() {

        try {

            String codigo = textAreaCodigo.getText().trim();
            AuroraLogoErrorListener errorListener = new AuroraLogoErrorListener(
                    textAreaCodigo,
                    errorStrip,
                    textPaneSaida,
                    this,
                    painelDesenho,
                    tartaruga );

            textPaneSaida.setText( "" );

            if ( !codigo.isEmpty() ) {

                AuroraLogoLexer lexer = new AuroraLogoLexer(
                        CharStreams.fromString( textAreaCodigo.getText() ) );
                CommonTokenStream tokens = new CommonTokenStream( lexer );

                AuroraLogoParser parser = new AuroraLogoParser( tokens );
                parser.removeErrorListeners();
                parser.addErrorListener( errorListener );
                //parser.setErrorHandler( new BailErrorStrategy() );

                ParseTree tree = parser.prog();

                if ( !errorListener.houveErro() ) {
                    DesenhistaAuroraLogoVisitor visitor = new DesenhistaAuroraLogoVisitor( tartaruga, this );
                    visitor.visit( tree );
                }

                if ( DEBUG_PARSER ) {
                    mostrarDados( null, parser, tree, true );
                }

            } else {
                tartaruga.limpar();
            }

            return !errorListener.houveErro();

        } catch ( RecognitionException exc ) {
            tartaruga.limpar();
        } catch ( Exception exc ) {
            tartaruga.limpar();
        }

        return false;

    }

    private void novoArquivo() {

        salvar( arquivoAtual );
        arquivoAtual = null;
        carregarTemplate( "novoArquivo", false );

        tartaruga.limpar();
        painelDesenho.repaint();

        montarTitulo( false );

    }

    private void abrirArquivo() {

        salvar( arquivoAtual );

        File diretorioAtual = new File( getPref( PREF_CAMINHO_ABRIR_SALVAR ) );
        JFileChooser jfc = new JFileChooser( diretorioAtual );
        jfc.setDialogTitle( "Abrir..." );
        jfc.setMultiSelectionEnabled( false );
        jfc.removeChoosableFileFilter( jfc.getFileFilter() );
        jfc.setFileFilter( filtroExtensao );

        if ( jfc.showOpenDialog( this ) == JFileChooser.APPROVE_OPTION ) {

            File arquivo = jfc.getSelectedFile();
            arquivoAtual = arquivo;
            carregarArquivo( arquivo, true );

        }

        montarTitulo( false );

    }

    private void salvarArquivo() {

        if ( arquivoAtual == null ) {
            fragmentoSalvar( "Salvar..." );
        }

        salvar( arquivoAtual );

    }

    private void salvarArquivoComo() {

        salvar( arquivoAtual );
        fragmentoSalvar( "Salvar Como..." );
        salvar( arquivoAtual );

    }

    private void salvar( File arquivo ) {

        if ( arquivo != null ) {
            try (  PrintStream ps = new PrintStream( new FileOutputStream( arquivo ) ) ) {
                ps.print( textAreaCodigo.getText() );
            } catch ( FileNotFoundException exc ) {
                exc.printStackTrace();
            }
        }

        montarTitulo( false );

    }

    private void fragmentoSalvar( String tituloDialogo ) {

        File diretorioAtual = new File( getPref( PREF_CAMINHO_ABRIR_SALVAR ) );
        JFileChooser jfc = new JFileChooser( diretorioAtual );
        jfc.setDialogTitle( tituloDialogo );
        jfc.setMultiSelectionEnabled( false );
        jfc.removeChoosableFileFilter( jfc.getFileFilter() );
        jfc.setFileFilter( filtroExtensao );

        if ( jfc.showSaveDialog( this ) == JFileChooser.APPROVE_OPTION ) {

            File arquivo = jfc.getSelectedFile();
            boolean salvar = true;

            if ( arquivo.exists() ) {
                if ( JOptionPane.showConfirmDialog( null,
                        "O arquivo já existe, deseja sobrescrevê-lo?",
                        "Confirmação",
                        JOptionPane.YES_NO_OPTION ) == JOptionPane.NO_OPTION ) {
                    salvar = false;
                }
            } else {
                if ( !arquivo.getName().endsWith( ".aulg" ) ) {
                    arquivo = new File( arquivo.getAbsolutePath() + ".aulg" );
                }
            }

            if ( salvar ) {

                setPref( PREF_CAMINHO_ABRIR_SALVAR, arquivo.getParentFile().getAbsolutePath() );
                arquivoAtual = arquivo;

            }

        }

    }

    private void executar() {

        salvar( arquivoAtual );
        tartaruga.limpar();
        tartaruga.setPassoAPasso( false );

        if ( executarCodigo() ) {
            tartaruga.irParaEstadoFinal();
        }

        painelDesenho.repaint();

    }

    private void executarPassoAPasso() {

        salvar( arquivoAtual );
        tartaruga.limpar();
        tartaruga.setPassoAPasso( true );

        if ( executarCodigo() ) {

            mudarEstadoGUI( false );

            sliderEstadoAtual.setEnabled( true );
            sliderEstadoAtual.setValue( 0 );
            sliderEstadoAtual.setMaximum( tartaruga.getUltimoEstado() );

            tartaruga.irParaEstadoInicial();
            atualizarComponentesExecutarPassoAPasso();

        }

        painelDesenho.repaint();

    }

    private void executarPassoAPassoAutomatico() {

        salvar( arquivoAtual );
        tartaruga.limpar();
        tartaruga.setPassoAPasso( true );

        if ( executarCodigo() ) {

            mudarEstadoGUI( false );

            sliderQuadrosPorSegundo.setEnabled( true );
            btnExecutarPassoAPassoAutomatico.setEnabled( false );
            btnPararPassoAPassoAutomatico.setEnabled( true );

            tartaruga.irParaEstadoInicial();

            new Thread( new Runnable() {
                @Override
                public void run() {

                    pararPassoAPassoAutomatico = false;

                    while ( !tartaruga.isEstadoFinal() && !pararPassoAPassoAutomatico ) {
                        EventQueue.invokeLater( new Runnable() {
                            public void run() {
                                tartaruga.irParaProximoEstado();
                                painelDesenho.repaint();
                            }
                        } );
                        try {
                            Thread.sleep( 1000 / sliderQuadrosPorSegundo.getValue() );
                        } catch ( InterruptedException exc ) {
                        }
                    }

                    mudarEstadoGUI( true );

                    btnInicioPassoAPasso.setEnabled( false );
                    btnProximoPassoAPasso.setEnabled( false );
                    btnAnteriorPassoAPasso.setEnabled( false );
                    btnFinalPassoAPasso.setEnabled( false );
                    btnPararPassoAPasso.setEnabled( false );
                    sliderEstadoAtual.setEnabled( false );

                    btnExecutarPassoAPassoAutomatico.setEnabled( true );
                    btnPararPassoAPassoAutomatico.setEnabled( false );

                }
            } ).start();

        }

        painelDesenho.repaint();

    }

    private void sair() {

        if ( PRODUCAO ) {

            salvarArquivo();

            if ( JOptionPane.showConfirmDialog(
                    this,
                    "Deseja mesmo sair?", "Sair",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE ) == JOptionPane.YES_OPTION ) {
                System.exit( 0 );
            }

        } else {
            System.exit( 0 );
        }

    }

    private void carregarTemplate( String template, boolean inicio ) {

        try (  Scanner s = new Scanner(
                getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/templates/"
                        + template + ".aulg" ), StandardCharsets.UTF_8 ) ) {
            carregar( s, inicio );
        }

    }

    private void carregarArquivo( File arquivo, boolean inicio ) {

        try (  Scanner s = new Scanner( arquivo, StandardCharsets.UTF_8 ) ) {
            carregar( s, inicio );
        } catch ( IOException exc ) {
            exc.printStackTrace();
        }

    }

    private void carregar( Scanner s, boolean inicio ) {

        StringBuilder sb = sb = new StringBuilder();
        sb.append( s.nextLine() );
        while ( s.hasNextLine() ) {
            sb.append( "\n" ).append( s.nextLine() );
        }

        String codigo = sb.toString();
        String data = new SimpleDateFormat(
                "dd/MM/yyyy", Locale.forLanguageTag( "pt-BR" ) ).format(
                new Date() );

        codigo = codigo.replace( "<USUARIO>", System.getProperty( "user.name" ) );
        codigo = codigo.replace( "<DATA>", data );

        textAreaCodigo.setText( codigo );
        textAreaCodigo.setCaretPosition( inicio ? 0 : textAreaCodigo.getText().length() );

    }

    private void configurarTemaClaro() {

        FlatIntelliJLaf.setup();
        SwingUtilities.updateComponentTreeUI( this );

        try {
            Theme t = Theme.load( getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/gui/temasrsta/claro.xml" ) );
            t.apply( textAreaCodigo );
            setPref( PREF_TEMA, "claro" );
            findDialog.updateUI();
            replaceDialog.updateUI();
        } catch ( IOException exc ) {
            exc.printStackTrace();
        }
    }

    private void configurarTemaEscuro() {

        FlatDarculaLaf.setup();
        SwingUtilities.updateComponentTreeUI( this );

        try {
            Theme t = Theme.load( getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/gui/temasrsta/escuro.xml" ) );
            t.apply( textAreaCodigo );
            setPref( PREF_TEMA, "escuro" );
            findDialog.updateUI();
            replaceDialog.updateUI();
        } catch ( IOException exc ) {
            exc.printStackTrace();
        }
    }

    private void configurarTemaNimbus() {

        try {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ) {
                if ( "Nimbus".equals( info.getName() ) ) {
                    javax.swing.UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        } catch ( ClassNotFoundException exc ) {
            java.util.logging.Logger.getLogger( getClass().getName() ).log( java.util.logging.Level.SEVERE, null, exc );
        } catch ( InstantiationException exc ) {
            java.util.logging.Logger.getLogger( getClass().getName() ).log( java.util.logging.Level.SEVERE, null, exc );
        } catch ( IllegalAccessException exc ) {
            java.util.logging.Logger.getLogger( getClass().getName() ).log( java.util.logging.Level.SEVERE, null, exc );
        } catch ( javax.swing.UnsupportedLookAndFeelException exc ) {
            java.util.logging.Logger.getLogger( getClass().getName() ).log( java.util.logging.Level.SEVERE, null, exc );
        }

        SwingUtilities.updateComponentTreeUI( this );

        try {
            Theme t = Theme.load( getClass().getResourceAsStream( "/br/com/davidbuzatto/auroralogo/gui/temasrsta/nimbus.xml" ) );
            t.apply( textAreaCodigo );
            setPref( PREF_TEMA, "nimbus" );
            findDialog.updateUI();
            replaceDialog.updateUI();
        } catch ( IOException exc ) {
            exc.printStackTrace();
        }
    }

    private void inserirCorTextAreaCodigo() {

        Color cor = JColorChooser.showDialog( this, "Cor", Color.BLACK, true );

        if ( cor != null ) {
            inserirCorCodigo( textAreaCodigo, cor );
        }

    }

    private void atualizarComponentesExecutarPassoAPasso() {

        btnExecutarPassoAPasso.setEnabled( false );
        btnPararPassoAPasso.setEnabled( true );

        if ( tartaruga.isEstadoInicial() ) {
            btnInicioPassoAPasso.setEnabled( false );
            btnAnteriorPassoAPasso.setEnabled( false );
        } else {
            btnInicioPassoAPasso.setEnabled( true );
            btnAnteriorPassoAPasso.setEnabled( true );
        }

        if ( tartaruga.isEstadoFinal() ) {
            btnFinalPassoAPasso.setEnabled( false );
            btnProximoPassoAPasso.setEnabled( false );
        } else {
            btnFinalPassoAPasso.setEnabled( true );
            btnProximoPassoAPasso.setEnabled( true );
        }

    }

    private void mudarEstadoGUI( boolean habilitar ) {

        Component[] componentes = {
            menuArquivo,
            menuEditar,
            menuExecutar,
            menuExemplos,
            menuTemas,
            menuAjuda,
            btnNovo,
            btnAbrir,
            btnSalvar,
            btnSalvarComo,
            btnDesfazer,
            btnRefazer,
            btnAumentarFonte,
            btnDiminuirFonte,
            btnExecutar,
            btnExecutarPassoAPasso,
            btnPararPassoAPasso,
            btnInicioPassoAPasso,
            btnAnteriorPassoAPasso,
            btnProximoPassoAPasso,
            btnFinalPassoAPasso,
            sliderEstadoAtual,
            btnExecutarPassoAPassoAutomatico,
            btnPararPassoAPassoAutomatico,
            sliderQuadrosPorSegundo,
            btnDepurador,
            btnGrade,
            textAreaCodigo
        };

        for ( Component c : componentes ) {
            c.setEnabled( habilitar );
        }

        if ( habilitar ) {
            atualizarBotoesDesfazerRefazer( textAreaCodigo );
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main( String args[] ) {

        EventQueue.invokeLater( new Runnable() {
            public void run() {

                preparePreferences();
                JanelaPrincipal janela = new JanelaPrincipal();

                switch ( getPref( PREF_TEMA ) ) {
                    case "claro":
                        janela.configurarTemaClaro();
                        janela.menuItemRTemaClaro.setSelected( true );
                        break;
                    case "escuro":
                        janela.configurarTemaEscuro();
                        janela.menuItemRTemaEscuro.setSelected( true );
                        break;
                    case "nimbus":
                        janela.configurarTemaNimbus();
                        janela.menuItemRTemaNimbus.setSelected( true );
                        break;
                }

                janela.setVisible( true );

                boolean depuradorAtivo = getBooleanPref( PREF_DEPURADOR_ATIVO );
                boolean gradeAtiva = getBooleanPref( PREF_GRADE_ATIVA );

                janela.btnDepurador.setSelected( depuradorAtivo );
                janela.menuItemCBDepurador.setSelected( depuradorAtivo );
                janela.tartaruga.setDepuradorAtivo( depuradorAtivo );
                janela.menuItemCBDepurador.setText( depuradorAtivo ? "Esconder Depurador" : "Mostrar Depurador" );

                janela.btnGrade.setSelected( gradeAtiva );
                janela.menuItemCBGrade.setSelected( gradeAtiva );
                janela.tartaruga.setGradeAtiva( gradeAtiva );
                janela.menuItemCBGrade.setText( gradeAtiva ? "Esconder Grade" : "Mostrar Grade" );

                janela.sliderQuadrosPorSegundo.setValue( getIntPref( PREF_VALOR_SLIDER_PASSO_AUTOMATICO ) );

            }
        } );

    }

    @Override
    public void searchEvent( SearchEvent e ) {

        SearchEvent.Type tipo = e.getType();
        SearchContext contexto = e.getSearchContext();
        SearchResult resultado;

        switch ( tipo ) {
            default:
            case MARK_ALL:
                resultado = SearchEngine.markAll( textAreaCodigo, contexto );
                break;
            case FIND:
                resultado = SearchEngine.find( textAreaCodigo, contexto );
                if ( !resultado.wasFound() || resultado.isWrapped() ) {
                    UIManager.getLookAndFeel().provideErrorFeedback( textAreaCodigo );
                }
                break;
            case REPLACE:
                resultado = SearchEngine.replace( textAreaCodigo, contexto );
                if ( !resultado.wasFound() || resultado.isWrapped() ) {
                    UIManager.getLookAndFeel().provideErrorFeedback( textAreaCodigo );
                }
                break;
            case REPLACE_ALL:
                resultado = SearchEngine.replaceAll( textAreaCodigo, contexto );
                JOptionPane.showMessageDialog( null, resultado.getCount()
                        + " ocorrências substituídas." );
                break;
        }

        String texto;
        
        if ( resultado.wasFound() ) {
            texto = "Texto encontrado; ocorrências marcadas: " + resultado.getMarkedCount() + ".";
        } else if ( tipo == SearchEvent.Type.MARK_ALL ) {
            if ( resultado.getMarkedCount() > 0 ) {
                texto = "Ocorrências marcadas: " + resultado.getMarkedCount() + ".";
            } else {
                texto = "";
            }
        } else {
            texto = "Texto não encontrado.";
        }

        statusBar.setLabel( texto );

    }

    @Override
    public String getSelectedText() {
        return textAreaCodigo.getSelectedText();
    }

    private static class StatusBar extends JPanel {

        private JLabel label;

        StatusBar() {
            label = new JLabel( "Pronto" );
            setLayout( new BorderLayout() );
            add( label, BorderLayout.LINE_START );
            //add( new JLabel( new SizeGripIcon() ), BorderLayout.LINE_END );
        }

        void setLabel( String label ) {
            this.label.setText( label );
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraFerramentas;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnteriorPassoAPasso;
    private javax.swing.JButton btnAumentarFonte;
    private javax.swing.JToggleButton btnDepurador;
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JButton btnDiminuirFonte;
    private javax.swing.JButton btnExecutar;
    private javax.swing.JButton btnExecutarPassoAPasso;
    private javax.swing.JButton btnExecutarPassoAPassoAutomatico;
    private javax.swing.JButton btnFinalPassoAPasso;
    private javax.swing.JToggleButton btnGrade;
    private javax.swing.ButtonGroup btnGroupTemas;
    private javax.swing.JButton btnInicioPassoAPasso;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPararPassoAPasso;
    private javax.swing.JButton btnPararPassoAPassoAutomatico;
    private javax.swing.JButton btnProximoPassoAPasso;
    private javax.swing.JButton btnRefazer;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarComo;
    private javax.swing.JLabel lblQuadrosPorSegundo;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuExecutar;
    private javax.swing.JMenu menuExemplos;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemAumentarFonte;
    private javax.swing.JCheckBoxMenuItem menuItemCBDepurador;
    private javax.swing.JCheckBoxMenuItem menuItemCBGrade;
    private javax.swing.JMenuItem menuItemColar;
    private javax.swing.JMenuItem menuItemCopiar;
    private javax.swing.JMenuItem menuItemCopiarTextoFormatado;
    private javax.swing.JMenuItem menuItemDesfazer;
    private javax.swing.JMenuItem menuItemDiminuirFonte;
    private javax.swing.JMenuItem menuItemExecutar;
    private javax.swing.JMenuItem menuItemExecutarPassoAPasso;
    private javax.swing.JMenuItem menuItemExecutarPassoAPassoAutomatico;
    private javax.swing.JMenuItem menuItemIrPara;
    private javax.swing.JMenuItem menuItemNovo;
    private javax.swing.JMenuItem menuItemProcurar;
    private javax.swing.JRadioButtonMenuItem menuItemRTemaClaro;
    private javax.swing.JRadioButtonMenuItem menuItemRTemaEscuro;
    private javax.swing.JRadioButtonMenuItem menuItemRTemaNimbus;
    private javax.swing.JMenuItem menuItemRecortar;
    private javax.swing.JMenuItem menuItemRefazer;
    private javax.swing.JMenuItem menuItemSalvar;
    private javax.swing.JMenuItem menuItemSalvarComo;
    private javax.swing.JMenuItem menuItemSobre;
    private javax.swing.JMenuItem menuItemSubstituir;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuTemas;
    private javax.swing.JPanel paineCodigoFonte;
    private br.com.davidbuzatto.auroralogo.gui.PainelDesenho painelDesenho;
    private javax.swing.JPanel painelDesenhoContainer;
    private javax.swing.JPanel painelSaida;
    private javax.swing.JPanel painelTextAreaCodigo;
    private javax.swing.Box.Filler preenchimento;
    private javax.swing.JScrollPane scrollPaneSaida;
    private javax.swing.JToolBar.Separator separador1;
    private javax.swing.JToolBar.Separator separador2;
    private javax.swing.JToolBar.Separator separador3;
    private javax.swing.JToolBar.Separator separador4;
    private javax.swing.JToolBar.Separator separador5;
    private javax.swing.JPopupMenu.Separator separadorMenuArquivo1;
    private javax.swing.JPopupMenu.Separator separadorMenuEditar1;
    private javax.swing.JPopupMenu.Separator separadorMenuEditar2;
    private javax.swing.JPopupMenu.Separator separadorMenuEditar3;
    private javax.swing.JPopupMenu.Separator separadorMenuEditar4;
    private javax.swing.JPopupMenu.Separator separadorMenuExecutar1;
    private javax.swing.JSlider sliderEstadoAtual;
    private javax.swing.JSlider sliderQuadrosPorSegundo;
    private javax.swing.JTextPane textPaneSaida;
    // End of variables declaration//GEN-END:variables
}
