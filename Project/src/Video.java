import database.Model;

import javax.swing.JFrame;

import control.Controller;
import util.TablePanel;
import view.MainFrame;
import view.body.TableListener;

public class Video implements TableListener{
	public Video() {
		try{
			Model model = new Model();
			//sqlTester(model);
			Controller controller = new Controller(model);
			MainFrame frame = new MainFrame(controller);
			//testTable(model);
			
		}catch(Exception e){}
	}
	
	public static void main(String[] args) {
		Video v = new Video();
	}
	
	public void testTable(Model model) throws Exception{
		model.select("select * from history");
		String str = model.getResult();
		System.out.println(str);
		
		JFrame frame = new JFrame();
		frame.setSize(600, 300);
		TablePanel tp = new TablePanel(str, this);
		frame.add(tp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
	
	public void sqlTester(Model model) throws Exception{
		int i = model.update("delete from history where uid = 7 and vid = 516");
		model.select("select * from history");
		System.out.println(i);
		System.out.println(model.getResult());
	}

	@Override
	public void selectRow(String[] row) {
		// TODO Auto-generated method stub
		for(int i = 0; i<row.length;i++)
			System.out.println(row[i]);
	}

	@Override
	public int getWidth() {
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
