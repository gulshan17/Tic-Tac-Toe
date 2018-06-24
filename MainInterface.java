import java.awt.*;
import java.awt.event.*;

class MainInterface extends Frame implements ActionListener
{
    Button b[] = new Button[10];
    char []data;       
    
    MainInterface(char []dataobj)
    {       
        data = dataobj;        
        
        Button b1 = new Button("" + dataobj[0]);
        Button b2 = new Button("" + dataobj[1]);
        Button b3 = new Button("" + dataobj[2]);
        Button b4 = new Button("" + dataobj[3]);
        Button b5 = new Button("" + dataobj[4]);
        Button b6 = new Button("" + dataobj[5]);
        Button b7 = new Button("" + dataobj[6]);
        Button b8 = new Button("" + dataobj[7]);
        Button b9 = new Button("" + dataobj[8]);
        Button b10 = new Button("RESET");

        setLayout(null);

        b[0] = (Button) add(b1);
        b[1] = (Button) add(b2);
        b[2] = (Button) add(b3);
        b[3] = (Button) add(b4);
        b[4] = (Button) add(b5);
        b[5] = (Button) add(b6);
        b[6] = (Button) add(b7);
        b[7] = (Button) add(b8);
        b[8] = (Button) add(b9);
        b[9] = (Button) add(b10);

        b[0].setBounds(250,50,200,200);
        b[1].setBounds(450,50,200,200);
        b[2].setBounds(650,50,200,200);
        b[3].setBounds(250,250,200,200);
        b[4].setBounds(450,250,200,200);
        b[5].setBounds(650,250,200,200);
        b[6].setBounds(250,450,200,200);
        b[7].setBounds(450,450,200,200);
        b[8].setBounds(650,450,200,200);

        b[9].setBounds(450,650,200,100);

        for(int i = 0; i < 10; i++)
        {
            b[i].addActionListener(this);
        }

        setSize(1080,1080);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
	{
		for(int i = 0; i < 10; i++)
        {
            if(ae.getSource() == b[i])
            {
                System.out.println("Clicked button " + i);

                Data dataobj = new Data();
             
                if( (i >= 0) && (i < 9) )
                {
                    if(data[i] == '-')
                    {
                        dataobj.setdata(i, 1);                   
                        AI aiobj = new AI();
                        dataobj.setdata( (aiobj.aimove(dataobj.returndata())), 0);
                    }
                }
                
                else if(i == 9)
                {
                    dataobj.resetdata();
                }
                /*this.setVisible(false);
                MainInterface mainobj = new MainInterface(dataobj.returndata());*/
                repaint(10);
                break;
            }
        }
	}
    
    public static void main(String []args)
    {
        Data dataobj = new Data();
        dataobj.resetdata();        
        MainInterface mainobj = new MainInterface(dataobj.returndata());
    }
}