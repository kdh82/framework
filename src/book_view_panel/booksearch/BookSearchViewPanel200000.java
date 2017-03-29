package book_view_panel.booksearch;

import javax.swing.JPanel;
import java.awt.GridLayout;
import book_panel.BookSearchPanel;
import book_view_panel.AbsViewPanel;

import javax.swing.JButton;
import book_panel.CheckSearchDesign;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class BookSearchViewPanel200000 extends AbsViewPanel {

	public BookSearchViewPanel200000() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{775, 0};
		gridBagLayout.rowHeights = new int[]{199, 364, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		CheckSearchDesign panel = new CheckSearchDesign();
		GridBagLayout gridBagLayout_1 = (GridBagLayout) panel.getLayout();
		gridBagLayout_1.rowHeights = new int[]{227};
		
		BookSearchPanel bsp = new BookSearchPanel();
		panel.getpContent().add(bsp);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weighty = 1.0;
		gbc_panel.weightx = 1.0;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
		
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.weighty = 2.0;
		gbc_panel_1.weightx = 1.0;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		add(panel_1, gbc_panel_1);
	}

}