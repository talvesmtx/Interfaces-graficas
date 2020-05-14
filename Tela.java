import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


> public class Tela extends JFrame implements ActionListener{
>    private JTextField txtTexto;
>    private JButton btnMostrar, btnLimpar, btnSair;
>    
>    public Tela(){
>       super("Exercicio 1");
>       
>       txtTexto = new JTextField("Texto");
>       btnMostrar = new JButton("Mostrar");
>       btnLimpar = new JButton("Limpar");
>       btnSair = new JButton("Sair");
>       
>       Container caixa = getContentPane();
>       caixa.setLayout(new FlowLayout());
>       
>       caixa.add(txtTexto);
>       caixa.add(btnMostrar);
>       caixa.add(btnLimpar);
>       caixa.add(btnSair);
>       
>       btnMostrar.addActionListener(this);
>       btnLimpar.addActionListener(this);
>       btnSair.addActionListener(this);
>       
>       setSize(200,150);
>       setLocationRelativeTo(null);
>       setVisible(true);
>       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
>       
>    }
>    public void actionPerformed(ActionEvent e){
>       if (e.getSource()==btnMostrar){
>          String sText = txtTexto.getText();
>          JOptionPane.showMessageDialog(null,sText);
>       }
>    }
> }










