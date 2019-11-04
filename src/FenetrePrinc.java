import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FenetrePrinc extends JFrame implements KeyListener {

    JPanel containerMain = new JPanel();
    GridLayout GridMain = new GridLayout(2, 1);

    //-Panel top-
        JPanel panelTop = new JPanel();
        GridLayout GridTop = new GridLayout(1, 5);

            JPanel panelPou = new JPanel();
                String[] ListPou = {"NothingPou", "GreenPou", "RedPou"};
                CardLayout CardPou = new CardLayout();

                    JPanel NothingPou = new JPanel();
                    JPanel GreenPou = new JPanel();
                    JPanel RedPou = new JPanel();


            JPanel panelInd = new JPanel();
                String[] ListInd = {"NothingInd", "GreenInd", "RedInd"};
                CardLayout CardInd = new CardLayout();

                    JPanel NothingInd = new JPanel();
                    JPanel GreenInd = new JPanel();
                    JPanel RedInd = new JPanel();


            JPanel panelMaj = new JPanel();
                String[] ListMaj = {"NothingMaj", "GreenMaj", "RedMaj"};
                CardLayout CardMaj = new CardLayout();

                    JPanel NothingMaj = new JPanel();
                    JPanel GreenMaj = new JPanel();
                    JPanel RedMaj = new JPanel();


            JPanel panelAnu = new JPanel();
                String[] ListAnu = {"NothingAnu", "GreenAnu", "RedAnu"};
                CardLayout CardAnu = new CardLayout();

                    JPanel NothingAnu = new JPanel();
                    JPanel GreenAnu = new JPanel();
                    JPanel RedAnu = new JPanel();


            JPanel panelOri = new JPanel();
                String[] ListOri = {"NothingOri", "GreenOri", "RedOri"};
                CardLayout CardOri = new CardLayout();

                    JPanel NothingOri = new JPanel();
                    JPanel GreenOri = new JPanel();
                    JPanel RedOri = new JPanel();

//-Panel bot-
        JPanel panelBot = new JPanel();
            String[] ListBot = {"text_1", "code_2"};
            CardLayout CardBot = new CardLayout();
                    JPanel text_1 = new JPanel();
                    JPanel code_2 = new JPanel();

    FenetrePrinc() {


//--Paramètre--

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//--Fin Paramètre--


//--Début add && setLayout on TOP--

        this.getContentPane().add(containerMain);

        containerMain.setLayout(GridMain);

        containerMain.add(panelTop);

        panelTop.setLayout(GridTop);

//-panel pouce-
        panelTop.add(panelPou);
        panelPou.setLayout(CardPou);

        panelPou.add(NothingPou, ListPou[0]);
        NothingPou.setBackground(Color.BLACK);

        panelPou.add(GreenPou, ListPou[1]);
        GreenPou.setBackground(Color.GREEN);


        panelPou.add(RedPou, ListPou[2]);
        RedPou.setBackground(Color.RED);


//-panel index-
        panelTop.add(panelInd);
        panelInd.setLayout(CardInd);

        panelInd.add(NothingInd, ListInd[0]);
        NothingInd.setBackground(Color.BLACK);

        panelInd.add(GreenInd, ListInd[1]);
        GreenInd.setBackground(Color.GREEN);

        panelInd.add(RedInd, ListInd[2]);
        RedInd.setBackground(Color.RED);

//-panel majeur-
        panelTop.add(panelMaj);
        panelMaj.setLayout(CardMaj);

        panelMaj.add(NothingMaj, ListMaj[0]);
        NothingMaj.setBackground(Color.BLACK);

        panelMaj.add(GreenMaj, ListMaj[1]);
        GreenMaj.setBackground(Color.GREEN);

        panelMaj.add(RedMaj, ListMaj[2]);
        RedMaj.setBackground(Color.RED);

//-panel anulaire-
        panelTop.add(panelAnu);
        panelAnu.setLayout(CardAnu);

        panelAnu.add(NothingAnu, ListAnu[0]);
        NothingAnu.setBackground(Color.BLACK);

        panelAnu.add(GreenAnu, ListAnu[1]);
        GreenAnu.setBackground(Color.GREEN);

        panelAnu.add(RedAnu, ListAnu[2]);
        RedAnu.setBackground(Color.RED);


//-panel oriculaire-
        panelTop.add(panelOri);
        panelOri.setLayout(CardOri);

        panelOri.add(NothingOri, ListOri[0]);
        NothingOri.setBackground(Color.BLACK);

        panelOri.add(GreenOri, ListOri[1]);
        GreenOri.setBackground(Color.GREEN);

        panelOri.add(RedOri, ListOri[2]);
        RedOri.setBackground(Color.RED);


//--Fin add && setLayout on TOP--


//--Début add && setLayout on BOT--


        containerMain.add(panelBot);
        panelBot.setLayout(CardBot);

        panelBot.add(text_1, ListBot[0]);
        text_1.setBackground(Color.BLACK);

        panelBot.add(code_2, ListBot[1]);
        code_2.setBackground(Color.WHITE);


//--Fin add && setLayout on BOT--

        addKeyListener(this);
        requestFocus();

        this.setVisible(true);

        }


        int i = 0;
        String code = "";

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //--Solution--
        if(e.getKeyChar() == 'a'){
            CardPou.show(panelPou, ListPou[1]);
        }
        if(e.getKeyChar() == 'z'){
            CardInd.show(panelInd, ListInd[1]);
        }
        if(e.getKeyChar() == 'e'){
            CardMaj.show(panelMaj, ListMaj[1]);
        }
        if(e.getKeyChar() == 'r'){
            CardAnu.show(panelAnu, ListAnu[1]);
        }
        if(e.getKeyChar() == 't'){
            CardOri.show(panelOri, ListOri[1]);
        }

        if(i == 0 && e.getKeyChar() == 'a'){
            code = code + 'a';
            System.out.println(code);
            i++;
            System.out.println(i);
        }

        if(i == 0){
            if(e.getKeyChar() == 'a'){
                i = 1;
            }
        }
        if(i == 1){
            if(e.getKeyChar() == 'z'){
                i = 2;
            }
        }
        if(i == 2){
            if(e.getKeyChar() == 'e'){
                i = 3;
            }
        }
        if(i == 3){
            if(e.getKeyChar() == 'r'){
                i = 4;
            }
        }
        if(i == 4){
            if(e.getKeyChar() == 't'){
                CardBot.show(panelBot, ListBot[1]);
            }
        }
    }


    @Override
    public void keyReleased(KeyEvent e){
        if(e.getKeyChar() == 'a'){
            CardPou.show(panelPou, ListPou[0]);
            i = 0;
        }
        if(e.getKeyChar() == 'z'){
            CardInd.show(panelInd, ListInd[0]);
            i = 0;
        }
        if(e.getKeyChar() == 'e'){
            CardMaj.show(panelMaj, ListMaj[0]);
            i = 0;
        }
        if(e.getKeyChar() == 'r'){
            CardAnu.show(panelAnu, ListAnu[0]);
            i = 0;
        }
        if(e.getKeyChar() == 't'){
            CardOri.show(panelOri, ListOri[0]);
            i = 0;
        }
    }
}
