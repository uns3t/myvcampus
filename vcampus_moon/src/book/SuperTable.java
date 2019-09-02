package Book;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import Message.BookMessage;
//import Message.BorrowMessage;

public class SuperTable extends JPanel {

	public ArrayList<JLabel > TableHeadArray = new ArrayList<JLabel>();
	public ArrayList<ArrayList<JLabel>> TableArray = new ArrayList<ArrayList<JLabel>>();
	public ArrayList<ArrayList<JButton>> ButtonArray = new ArrayList<ArrayList<JButton>>();
	
	
	
	int width;
	int height;
	public int row;
	public int column;
	public int changerow;
	public int changeheight;
	public int changecolumn;
	public int changewidth;
	public int tableheadHeight=10;

	String[] TableHeadText;
	String[] TableHeadContent;
	String [][] TableAllText;
	String [][] TableAllContent; 
		
	public int[] rowheight;
	public int[] columnwidth;
	public int[] columnText;
	public int[] rowText;
	
	
	
	public void setTableHeadHeight(int headheight)
	{
		tableheadHeight = headheight;
		int bound = 0;
		for (int i =0;i<column;i++)
		{
			
			TableHeadArray.get(i).setBounds(bound, 0, columnwidth[i], tableheadHeight);
			bound +=columnwidth[i];
		}
		
		setRowHeightSize(0, TableArray.get(0).get(0).getHeight());
	}
	
	
	
	public void setTextTableHead(String[] headtext)
	{
		TableHeadText = headtext;
		for (int i=0;i<headtext.length;i++)
		{
			TableHeadArray.get(i).setText(TableHeadText[i]);
			TableHeadArray.get(i).setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,15));
		}
		
	}
	public void setTextTableHead(int i,String text)
	{
		TableHeadText[i] = text;
		TableHeadArray.get(i).setText(TableHeadText[i]);

		
	}
	
	
	
	public void setTextTableAll(String[][] alltext)
	{
		//TableAllText = alltext;
		for (int i=0;i<alltext.length;i++)
		{
			for (int j=0;j<alltext[0].length;j++)
			{
				TableArray.get(i).get(j).setText(alltext[i][j]);
				TableArray.get(i).get(j).setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,15));
				
			}
			
		}
		
	}
	
	
	
	public String[][] getTextTableAll()
	{
		
		String[][] alltext = new String[row][column];
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				alltext[i][j]=TableArray.get(i).get(j).getText();
			}
		}
		return alltext;
	}
	
	
	
	public void setTextColumn(int setcolumn,String[] columntext)
	{
		for(int i=0;i<row;i++)
		{
			TableArray.get(i).get(setcolumn).setText(columntext[i]);
		}
	}

	
	
	public String[] getTextColumn(int getcolumn)
	{
		String[] columntext = new String[row];
		for (int i=0;i<row;i++)
		{
			columntext[i] = TableArray.get(i).get(getcolumn).getText(); 
		}
		return columntext;
	}

	
	public void setButtonColumn(int setcolumn,String columntext)
	{
		for (int i=0;i<row;i++)
		{
			ButtonArray.get(i).get(setcolumn).setText(columntext);
			ButtonArray.get(i).get(setcolumn).setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,15));
			ButtonArray.get(i).get(setcolumn).setLocation(0,0);
			ButtonArray.get(i).get(setcolumn).setSize(TableArray.get(i).get(setcolumn).getSize());
			TableArray.get(i).get(setcolumn).add(ButtonArray.get(i).get(setcolumn));
			ButtonArray.get(i).get(setcolumn).setBackground(new Color(0x009AD6));
			ButtonArray.get(i).get(setcolumn).setFocusPainted(false);
		}
	}

	
	
	public void setTextRow(int setrow,String[] rowtext)
	{
		for(int i=0;i<column;i++)
		{
			TableArray.get(setrow).get(i).setText(rowtext[i]);
		}
	}
	
	
	
	public String[] getTextRow(int getrow)
	{
		String[] rowtext = new String[column];
		for (int i=0;i<column;i++)
		{
			rowtext[i] = TableArray.get(getrow).get(i).getText(); 
		}
		return rowtext;
	}
	
	
	public void setTextTableCell(int setrow,int setcolumn,String celltext)
	{
	
		TableArray.get(setrow).get(setcolumn).setText(celltext);
	}

	
	
	public String getTextTableCell(int getrow,int getcolumn)
	{
		return TableArray.get(getrow).get(getcolumn).getText();
	}
	
	
	public void setButtonCell(int setrow,int setcolumn,String buttontext)
	{
		ButtonArray.get(setrow).get(setcolumn).setText(buttontext);
		ButtonArray.get(setrow).get(setcolumn).setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,15));
		ButtonArray.get(setrow).get(setcolumn).setLocation(0,0);
		ButtonArray.get(setrow).get(setcolumn).setSize(TableArray.get(setrow).get(setcolumn).getSize());
		TableArray.get(setrow).get(setcolumn).add(ButtonArray.get(setrow).get(setcolumn));
		ButtonArray.get(setrow).get(setcolumn).setBackground(new Color(0x009AD6));
		ButtonArray.get(setrow).get(setcolumn).setFocusPainted(false);
		
	}

	

	public void setCellSize(int w, int h)
	{
		width = w;
		height = h;
		
		for (int i =0;i<column;i++)
		{
			TableHeadArray.get(i).setBounds(i*width, 0, width, tableheadHeight);
			TableHeadArray.get(i).setOpaque(true);
			TableHeadArray.get(i).setBackground(Color.gray);
			TableHeadArray.get(i).setBorder(BorderFactory.createLineBorder(new Color(0xAAAAAA)));
		}
		
		setTextTableHead(TableHeadText);
		setTextTableAll(TableAllText);
		
		for (int i=0;i<row;i++)
		{
			rowheight[i]=height;
		}
		
		for (int i=0;i<column;i++)
		{
			columnwidth[i]=width;
		}
		
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				
				TableArray.get(i).get(j).setBounds(j*width, i*height+tableheadHeight, width, height);
				TableArray.get(i).get(j).setOpaque(true);
				TableArray.get(i).get(j).setBorder(BorderFactory.createLineBorder(new Color(0xAAAAAA)));
				
				if (i%2==0)
				{
					TableArray.get(i).get(j).setBackground(Color.WHITE);
				}
				else
				{
					TableArray.get(i).get(j).setBackground(new Color(0xBFEFFF));
				}
				
				
			}
			
		}
		this.setSize(column*width, row*height+tableheadHeight);
	}

	
	
	public void setRowHeightSize(int r,int h ){
		
	changerow = r;
	changeheight = h;
	rowheight[r] = changeheight;
	
	int bounds1=0;
	int bounds2=0;

	for (int i=0;i<row;i++)
	{
		bounds1=0;
		
		for (int j=0;j<column;j++)
		{
			
			TableArray.get(i).get(j).setBounds(bounds1, bounds2+tableheadHeight, columnwidth[j], rowheight[i]);
			bounds1=bounds1+columnwidth[j];
			
		}
		bounds2=bounds2+rowheight[i];
	}
	
	int panelHeight = 0;
	int panelWidth = 0;
	for (int i=0;i<row;i++)
	{
		panelHeight += rowheight[i]; 
	}
	
	for (int i=0;i<column;i++)
	{
		panelWidth += columnwidth[i];
	}
	this.setSize(panelWidth, panelHeight+tableheadHeight);
	
}

	
	
	public void setColumnWidthSize(int columntochange,int widthtochange ){
		
		changecolumn = columntochange;
		changewidth = widthtochange;
		columnwidth[columntochange]=changewidth;
		
		int bounds1=0;
		int bounds2=0;
		
		for (int i=0;i<row;i++)
		{
			bounds1=0;
			
			for (int j=0;j<column;j++)
			{
				
				TableArray.get(i).get(j).setBounds(bounds1, bounds2+tableheadHeight, columnwidth[j], rowheight[i]);
				bounds1=bounds1+columnwidth[j];
				
			}
			bounds2=bounds2+rowheight[i];
		}
		
		setTableHeadHeight(TableHeadArray.get(0).getHeight());
		
		int panelHeight = 0;
		int panelWidth = 0;
		for (int i=0;i<row;i++)
		{
			panelHeight += rowheight[i]; 
		}
		
		for (int i=0;i<column;i++)
		{
			panelWidth += columnwidth[i];
		}
		this.setSize(panelWidth, panelHeight+tableheadHeight);
		
		
}

	

	
	public SuperTable(int c,/*ArrayList<BorrowMessage>*/String[] array)
	{
		this.setLayout(null);
		if (array.length<=15)row=15;
		else		row = array.length;
		column = c;
		
		rowheight  = new int[row];
		columnwidth = new int[column];
		TableHeadText = new String[column];
		TableAllText = new String[row][column];
		
		
		for (int i=0;i<column;i++)
		{
			TableHeadArray.add(new JLabel("",JLabel.CENTER));
			this.add(TableHeadArray.get(i));
			//TableHeadText[i]="";
		}

		
		for (int i=0;i<row;i++)
		{
			rowheight[i]=height;
		}
		
		for (int i=0;i<column;i++)
		{
			columnwidth[i]=width;
		}
		
		
		for (int i=0;i<row;i++)
		{
			TableArray.add(new ArrayList<JLabel>());
			ButtonArray.add(new ArrayList<JButton>());
		}
		
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				TableArray.get(i).add(new JLabel("",JLabel.CENTER));
				this.add(TableArray.get(i).get(j));
				
				ButtonArray.get(i).add(new JButton());
				//TableAllText[i][j]="";
				
			}
			
		}
	
		
	}
	public SuperTable(/*ArrayList<BookMessage>*/String[] array,int c)
	{
		this.setLayout(null);
		if (array.length<=15)row=15;
		else		row = array.length;
		column = c;
		
		rowheight  = new int[row];
		columnwidth = new int[column];
		TableHeadText = new String[column];
		TableAllText = new String[row][column];
		
		
		for (int i=0;i<column;i++)
		{
			TableHeadArray.add(new JLabel("",JLabel.CENTER));
			this.add(TableHeadArray.get(i));
			//TableHeadText[i]="";
		}
		
		for (int i=0;i<row;i++)
		{
			rowheight[i]=height;
		}
		
		for (int i=0;i<column;i++)
		{
			columnwidth[i]=width;
		}

		
		for (int i=0;i<row;i++)
		{
			TableArray.add(new ArrayList<JLabel>());
			ButtonArray.add(new ArrayList<JButton>());
		}
		
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				TableArray.get(i).add(new JLabel("",JLabel.CENTER));
				this.add(TableArray.get(i).get(j));
				
				ButtonArray.get(i).add(new JButton());
				//TableAllText[i][j]="";
				
			}
			
		}
		
	}
	
	public SuperTable(int r,int c){
		this.setLayout(null);
		
		row = r;
		column = c;
		
		rowheight  = new int[row];
		columnwidth = new int[column];
		TableHeadText = new String[column];
		TableAllText = new String[row][column];
		
		
		for (int i=0;i<column;i++)
		{
			TableHeadArray.add(new JLabel("",JLabel.CENTER));
			this.add(TableHeadArray.get(i));
			//TableHeadText[i]="";
		}
		
		
		for (int i=0;i<row;i++)
		{
			rowheight[i]=height;
		}
		
		for (int i=0;i<column;i++)
		{
			columnwidth[i]=width;
		}

		
		
		for (int i=0;i<row;i++)
		{
			TableArray.add(new ArrayList<JLabel>());
			ButtonArray.add(new ArrayList<JButton>());
		}
		
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				TableArray.get(i).add(new JLabel("",JLabel.CENTER));
				this.add(TableArray.get(i).get(j));
				
				ButtonArray.get(i).add(new JButton());
				//TableAllText[i][j]="";
				
			}
			
		}
	
		
		

	}

}
