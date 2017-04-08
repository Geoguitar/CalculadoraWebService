package BouncingBall;
/**
 * @version 1.20 1999-04-25
 * @author Cay Horstmann
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BounceRunnableBall
{  public static void main(String[] args)
   {  JFrame frame = new BounceThreadFrame();
      frame.setVisible(true);
   }
}

class BounceThreadFrame extends JFrame
{  public BounceThreadFrame()
   {  setSize(300, 200);
      setTitle("Bounce");

      addWindowListener(new WindowAdapter()
         {  public void windowClosing(WindowEvent e)
            {  System.exit(0);
            }
         } );

      Container contentPane = getContentPane();
      canvas = new JPanel();
      contentPane.add(canvas, "Center");
      JPanel p = new JPanel();
      addButton(p, "Start",
         new ActionListener()
         {  public void actionPerformed(ActionEvent evt)
            {  Thread b = new Thread(new RunnableBall(canvas,Color.blue));
               b.start();
            }
         });

      addButton(p, "Close",
         new ActionListener()
         {  public void actionPerformed(ActionEvent evt)
            {  canvas.setVisible(false);
               System.exit(0);
            }
         });
      contentPane.add(p, "South");
   }

   public void addButton(Container c, String title,
      ActionListener a)
   {  JButton b = new JButton(title);
      c.add(b);
      b.addActionListener(a);
   }

   private JPanel canvas;
}



