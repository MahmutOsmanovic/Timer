package counter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClockView extends JPanel {

    private ChainedCounterModel secsCounter;

    public ClockView (int h, int m, int s) {
	// skapa 3 r�knare
        ChainedCounterModel hoursCounter = new ChainedCounterModel(h,24,null);
        ChainedCounterModel minsCounter = new ChainedCounterModel(m,60,hoursCounter);
        secsCounter = new ChainedCounterModel(s,60,minsCounter);
		
		// skapa en vy f�r varje r�knare
        CounterView hours = new CounterView(hoursCounter);
        CounterView mins = new CounterView(minsCounter);
        CounterView secs = new CounterView(secsCounter);
        mins.setBackground(Color.GRAY);

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(570,130));
        add(hours,BorderLayout.WEST);
        add(mins,BorderLayout.CENTER);
        add(secs,BorderLayout.EAST);

        Timer timer = new Timer(1000, new SecListener());
        timer.start();
    }
	// this is the controller
    private class SecListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            secsCounter.increment();
            repaint();
        }
    }
}