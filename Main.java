import javax.swing.JFrame;

public class Main
{
	public static void main(String[] args)
	{
		ColorSelectFrame colorSelectFrame = new ColorSelectFrame();
		colorSelectFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorSelectFrame.setSize(300, 140);
		colorSelectFrame.setResizable(false);

		if (colorSelectFrame.isResizable())
			System.out.println("Certo");
		else
			System.out.println("Merda");

		colorSelectFrame.setVisible(true);
	}
}