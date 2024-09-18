package defaul;

import java.io.IOException;

import javax.swing.JFrame;

import levels.Level1;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Level1 c=new Level1();
		JFrame p=new JFrame();
		p.setSize(1400,1000);
		p.setVisible(true);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.add(c);
	}

}
