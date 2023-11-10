import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class frame extends JFrame  {
    JRadioButton smallsize;
    JRadioButton mediumsize;
    JRadioButton largesize;
    JComboBox comboBox;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JLabel label8;
    JCheckBox bbq;
    JCheckBox cheese;
    JCheckBox arabic;
    JButton cart;
    JButton order;
    JButton plus;
    JButton minus;
    JButton cartt;
    ButtonGroup bt;
    int n=0;
    public frame(){
        this.setSize(400,400);
        this.setTitle("Online Resturant App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.getContentPane().setBackground(new Color(178,175,175));
        String [] opt ={"-- Select Option --","Pizza","Pasta","Fries","Sandwiches"};

        label3=new JLabel(" Welcome Forks!! ");
        label3.setPreferredSize(new Dimension(300,35));
        label3.setToolTipText("From Our oven to your table");
        this.add(label3);


        label2=new JLabel("Select Option: ");
        this.add(label2);

        comboBox=new JComboBox(opt);
        comboBox.setPreferredSize(new Dimension(240,25));
        this.add(comboBox);

        this.add(Box.createVerticalStrut(50));

        label1=new JLabel("Select Size: ");
        label1.setToolTipText("You can select only one size from these options");
        this.add(label1);
        label1.add(Box.createVerticalStrut(20));

        smallsize =new JRadioButton("Small ");
        mediumsize=new JRadioButton("Medium ");
        largesize=new JRadioButton("large ");
        smallsize.setFocusable(false);
        mediumsize.setFocusable(false);
        largesize.setFocusable(false);
        bt=new ButtonGroup();
        bt.add(smallsize);
        bt.add(mediumsize);
        bt.add(largesize);
        smallsize.setFocusable(false);
        mediumsize.setFocusable(false);
        largesize.setFocusable(false);
        this.add(smallsize);
        this.add(mediumsize);
        this.add(largesize);
        this.add(Box.createVerticalStrut(50));

        label4= new JLabel("Quantity :");
        label4.setPreferredSize(new Dimension(150,35));
        this.add(label4);
        plus=new JButton(" + ");
        minus=new JButton(" - ");
        plus.setFocusable(false);
        minus.setFocusable(false);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                label5.setText("     "+n);
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n--;
                label5.setText("     "+n);
            }
        });

        label5=new JLabel("     0");
        label5.setPreferredSize(new Dimension(50,35));

        this.add(plus);
        this.add(label5);
        this.add(minus);
        this.add(Box.createVerticalStrut(50));

        label6=new JLabel("Extras : ");
        label6.setPreferredSize(new Dimension(70,35));
        this.add(label6);
        bbq=new JCheckBox("BBQ Ranch");
        arabic =new JCheckBox("Arabic Ranch");
        cheese=new JCheckBox("Cheese");
        bbq.setFocusable(false);
        arabic.setFocusable(false);
        cheese.setFocusable(false);
        this.add(bbq);
        this.add(arabic);
        this.add(cheese);
        this.add(Box.createVerticalStrut(50));

        label8= new JLabel();
        label8.setPreferredSize(new Dimension(20,35));
        this.add(label8);
        cartt=new JButton("Veiw Cart");
        cartt.setFocusable(false);
        cartt.setBackground(new Color(158,85,85));
        cartt.setPreferredSize(new Dimension(200,26));
        this.add(cartt);

        cart =new JButton("Add to cart");
        cart.setFocusable(false);
        cart.setBackground(new Color(158,75,75));
        this.add(cart);
        order=new JButton("Order");
        order.setFocusable(false);
        order.setBackground(new Color(158,65,65));
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==order && comboBox.getSelectedItem()!="-- Select Option --" ){
                    if(bt.getSelection()!=null){
                    dispose();
                    NewWindow Window=new NewWindow();
                }
                else{
                        NewWindow win =new NewWindow();
                        win.label.setText("Please Select any Size ");
                }}
                else{
                    NewWindow win =new NewWindow();
                    win.label.setText("Please Select any Food Option");
                }
            }
        });
        this.add(order);

        this.add(Box.createVerticalStrut(60));
        label7 =new JLabel("              Baked with Passion, served with Love");
        label7.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,14));
        this.add(label7);


        this.setVisible(true);

    }}


