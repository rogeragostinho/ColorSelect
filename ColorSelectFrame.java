import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
//import javax.swing.
import javax.swing.JPanel;
import javax.swing.JButton;
//import java.awt.
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

class ColorSelectFrame extends JFrame
{
	private final JComboBox<String> comboBox;
	private final String[] colors = {"RED", "BLUE", "GREEN", "BLACK"};
	private final JPanel panelCenter;
	private final JCheckBox checkBoxBackground;
	private final JCheckBox checkBoxForeground;
	private final JButton buttonOK;
	private final JButton buttonCancel;
	private final JPanel panelSouth;

	public ColorSelectFrame()
	{
		super("ColorSelect");
		setLayout(new BorderLayout());

		comboBox = new JComboBox<>(colors);

		panelCenter = new JPanel(new FlowLayout(FlowLayout.CENTER));

		checkBoxBackground = new JCheckBox("Background");
		checkBoxForeground = new JCheckBox("Foreground");

		panelCenter.add(checkBoxBackground);
		panelCenter.add(checkBoxForeground);

		panelSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));

		buttonOK = new JButton("OK");
		buttonCancel = new JButton("Cancel");

		panelSouth.add(buttonOK);
		panelSouth.add(buttonCancel);

		add(comboBox, BorderLayout.NORTH);
		add(panelCenter, BorderLayout.CENTER);
		add(panelSouth, BorderLayout.SOUTH);
	}
}