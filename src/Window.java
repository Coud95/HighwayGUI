import javax.swing.*;
import java.awt.*;

class Window extends JFrame {

    public JPanel carPanel, queuePanel;
    public JPanel spot1, spot2, spot3, spot4, spot5, spot6, spot7, spot8;
    public JPanel spot1Image, spot2Image, spot3Image, spot4Image, spot5Image, spot6Image, spot7Image, spot8Image;
    public JPanel spot1Action, spot2Action, spot3Action, spot4Action, spot5Action, spot6Action, spot7Action,
            spot8Action;
    public JLabel spot1ActionLabel, spot2ActionLabel, spot3ActionLabel, spot4ActionLabel, spot5ActionLabel,
            spot6ActionLabel, spot7ActionLabel, spot8ActionLabel;
    public JLabel[] actionText, images;
    public JLabel spot1ImageLabel, spot2ImageLabel, spot3ImageLabel, spot4ImageLabel, spot5ImageLabel, spot6ImageLabel,
            spot7ImageLabel, spot8ImageLabel;
    public JLabel queueGate, queueNarrowing, queueGateNumber, queueNarrowingNumber;

    public Window() {
        super("Autostrada");
        setSize(700, 500);
        setLayout(new BorderLayout());
        carPanel = new JPanel();
        queuePanel = new JPanel();
        queuePanel.setLayout(new GridLayout(1, 4));
        queuePanel.setBackground(new Color(200, 233, 255));
        queueGate = new JLabel("Kolejka do bramek:");
        queueGateNumber = new JLabel("0");
        queueNarrowing = new JLabel("Kolejka do zwężenia:");
        queueNarrowingNumber = new JLabel("0");
        queueGate.setFont(new Font("Serif", Font.PLAIN, 18));
        queueNarrowing.setFont(new Font("Serif", Font.PLAIN, 18));
        queueGateNumber.setFont(new Font("Serif", Font.PLAIN, 36));
        queueNarrowingNumber.setFont(new Font("Serif", Font.PLAIN, 36));
        queuePanel.add(queueGate);
        queuePanel.add(queueGateNumber);
        queuePanel.add(queueNarrowing);
        queuePanel.add(queueNarrowingNumber);
        add(carPanel, BorderLayout.CENTER);
        add(queuePanel, BorderLayout.SOUTH);
        carPanel.setLayout(new GridLayout(2, 4));

        spot1 = new JPanel();
        spot1.setLayout(new BorderLayout());
        spot1Image = new JPanel();
        spot1Action = new JPanel();
        spot1ActionLabel = new JLabel("");
        spot1ImageLabel = new JLabel();
        spot1.add(spot1Image, BorderLayout.PAGE_START);
        spot1.add(spot1Action, BorderLayout.PAGE_END);
        spot1Action.add(spot1ActionLabel);
        spot1Image.add(spot1ImageLabel);
        spot1.setBorder(BorderFactory.createLineBorder(Color.black));
        carPanel.add(spot1);

        spot2 = new JPanel();
        spot2.setLayout(new BorderLayout());
        spot2Image = new JPanel();
        spot2Action = new JPanel();
        spot2ActionLabel = new JLabel("");
        spot2ImageLabel = new JLabel();
        spot2.add(spot2Image, BorderLayout.PAGE_START);
        spot2.add(spot2Action, BorderLayout.PAGE_END);
        spot2Action.add(spot2ActionLabel);
        spot2Image.add(spot2ImageLabel);
        spot2.setBorder(BorderFactory.createLineBorder(Color.black));
        carPanel.add(spot2);

        spot3 = new JPanel();
        spot3.setLayout(new BorderLayout());
        spot3Image = new JPanel();
        spot3Action = new JPanel();
        spot3ActionLabel = new JLabel("");
        spot3ImageLabel = new JLabel();
        spot3.add(spot3Image, BorderLayout.PAGE_START);
        spot3.add(spot3Action, BorderLayout.PAGE_END);
        spot3Action.add(spot3ActionLabel);
        spot3Image.add(spot3ImageLabel);
        spot3.setBorder(BorderFactory.createLineBorder(Color.black));
        carPanel.add(spot3);

        spot4 = new JPanel();
        spot4.setLayout(new BorderLayout());
        spot4Image = new JPanel();
        spot4Action = new JPanel();
        spot4ActionLabel = new JLabel("");
        spot4ImageLabel = new JLabel();
        spot4.add(spot4Image, BorderLayout.PAGE_START);
        spot4.add(spot4Action, BorderLayout.PAGE_END);
        spot4Action.add(spot4ActionLabel);
        spot4Image.add(spot4ImageLabel);
        spot4.setBorder(BorderFactory.createLineBorder(Color.black));
        carPanel.add(spot4);

        spot5 = new JPanel();
        spot5.setLayout(new BorderLayout());
        spot5Image = new JPanel();
        spot5Action = new JPanel();
        spot5ActionLabel = new JLabel("");
        spot5ImageLabel = new JLabel();
        spot5.add(spot5Image, BorderLayout.PAGE_START);
        spot5.add(spot5Action, BorderLayout.PAGE_END);
        spot5Action.add(spot5ActionLabel);
        spot5Image.add(spot5ImageLabel);
        spot5.setBorder(BorderFactory.createLineBorder(Color.black));
        carPanel.add(spot5);

        spot6 = new JPanel();
        spot6.setLayout(new BorderLayout());
        spot6Image = new JPanel();
        spot6Action = new JPanel();
        spot6ActionLabel = new JLabel("");
        spot6ImageLabel = new JLabel();
        spot6.add(spot6Image, BorderLayout.PAGE_START);
        spot6.add(spot6Action, BorderLayout.PAGE_END);
        spot6Action.add(spot6ActionLabel);
        spot6Image.add(spot6ImageLabel);
        spot6.setBorder(BorderFactory.createLineBorder(Color.black));
        carPanel.add(spot6);

        spot7 = new JPanel();
        spot7.setLayout(new BorderLayout());
        spot7Image = new JPanel();
        spot7Action = new JPanel();
        spot7ActionLabel = new JLabel("");
        spot7ImageLabel = new JLabel();
        spot7.add(spot7Image, BorderLayout.PAGE_START);
        spot7.add(spot7Action, BorderLayout.PAGE_END);
        spot7Action.add(spot7ActionLabel);
        spot7Image.add(spot7ImageLabel);
        spot7.setBorder(BorderFactory.createLineBorder(Color.black));
        carPanel.add(spot7);

        spot8 = new JPanel();
        spot8.setLayout(new BorderLayout());
        spot8Image = new JPanel();
        spot8Action = new JPanel();
        spot8ActionLabel = new JLabel("");
        spot8ImageLabel = new JLabel();
        spot8.add(spot8Image, BorderLayout.PAGE_START);
        spot8.add(spot8Action, BorderLayout.PAGE_END);
        spot8Action.add(spot8ActionLabel);
        spot8Image.add(spot8ImageLabel);
        spot8.setBorder(BorderFactory.createLineBorder(Color.black));
        carPanel.add(spot8);

        actionText = new JLabel[]{spot1ActionLabel, spot2ActionLabel, spot3ActionLabel, spot4ActionLabel, spot5ActionLabel,
                spot6ActionLabel, spot7ActionLabel, spot8ActionLabel};

        images = new JLabel[]{spot1ImageLabel, spot2ImageLabel, spot3ImageLabel, spot4ImageLabel, spot5ImageLabel,
                spot6ImageLabel, spot7ImageLabel, spot8ImageLabel};

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}