package com.fs.tmh;

public class demo01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int f[][] = new int[6][6];
		int []c[] = new int[6][6];
		//int [][] g = new int[6][6];
		//int [][] e = new int[6][];
		
		f[0][0]=15;
            f[0][1]=15;
            f[0][2]=26;
            f[0][3]=32;
            f[0][4]=43;
            f[0][5]=54;
            f[1][3]=65;
            f[1][1]=55;
            f[1][2]=26;
        System.out.println(f[2][1]);
        for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.println(f[i][j]);
				
			}
		}
        
	}

}
