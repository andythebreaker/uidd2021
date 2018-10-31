//use for comper command

import java.util.ArrayList;
import java.lang.Object;

public class comper {
	static kyu kyu = new kyu();
	static ArrayList<char[]> word1 = new ArrayList<char[]>();
	static ReadInput inputcc = new ReadInput();
	public static final String c1 = "day";// 1
	public static final String c2 = "exit";// 2
	public static final String c3 = "add";// 3
	public static final String c4 = "month";// 4
	public static final String c5 = "del";// 5
	// public final String c51 = "all";
	public static final String c6 = "edit";// 6

	public static void set() {
		char[] Cc1 = c1.toCharArray();
		// Character[] CO1 = ArrayUtils.toObject(Cc1);
		char[] Cc2 = c2.toCharArray();
		// Character[] CO2 = ArrayUtils.toObject(Cc2);
		char[] Cc3 = c3.toCharArray();
		// Character[] CO3 = ArrayUtils.toObject(Cc3);
		char[] Cc4 = c4.toCharArray();
		// Character[] CO4 = ArrayUtils.toObject(Cc4);
		char[] Cc5 = c5.toCharArray();
		// Character[] CO5 = ArrayUtils.toObject(Cc5);
		// char[] Cc51 = c51.toCharArray();
		// Character[] CO51 = ArrayUtils.toObject(Cc51);
		char[] Cc6 = c6.toCharArray();
		// Character[] CO6 = ArrayUtils.toObject(Cc6);
		/*
		 * char[][] Cc1 = {c1.toCharArray(),'z'}; //Character[] CO1 =
		 * ArrayUtils.toObject(Cc1); char[][] Cc2 = {c2.toCharArray(),'z'};
		 * //Character[] CO2 = ArrayUtils.toObject(Cc2); char[][] Cc3 =
		 * {c3.toCharArray(),'z'}; //Character[] CO3 = ArrayUtils.toObject(Cc3);
		 * char[][] Cc4 = {c4.toCharArray(),'z'}; //Character[] CO4 =
		 * ArrayUtils.toObject(Cc4); char[][] Cc5 = {c5.toCharArray(),'z'};
		 * //Character[] CO5 = ArrayUtils.toObject(Cc5); //char[] Cc51 =
		 * c51.toCharArray(); //Character[] CO51 = ArrayUtils.toObject(Cc51); char[][]
		 * Cc6 = {c6.toCharArray(),'z'}; //Character[] CO6 = ArrayUtils.toObject(Cc6);
		 */
		word1.add(Cc1);
		word1.add(Cc2);
		word1.add(Cc3);
		word1.add(Cc4);
		word1.add(Cc5);
		// keyword.add(CO51);
		word1.add(Cc6);
	}

	//
	public static int comper() {
		int bufferSAV = 0;
		int sav = 0;
		int ckinC = 0;
		int ckinC2 = 0;
		String targstr = new String();
		targstr = inputcc.Getinput(0);
		char yn = targstr.charAt(0);
		int yni = (int) yn;
		if ((yni < 97) || (yni > 122)) {
			System.out.println("不支援的指令，所有指令開頭須為小寫英文字，不得含有符號或數字；其中大小寫不相容!");
			return (-1);
		}
		int[][] yes = { { 0, 1 }, { 0, 1 }, { 0, 1 }, { 0, 1 }, { 0, 1 }, { 0, 1 } };
		// int yes[][] = new int[6][2];
		// System.out.println(targstr);
//
		char[] targcharArray = targstr.toCharArray();
//char[] targcharObjectArray = targcharArray.toCharArray();XXX
		int Howlong = targcharArray.length;
//System.out.println(Howlong);
		int slash = 0;
		for (int i = 0; i < Howlong; i++) {
			ckinC2 = (int) targcharArray[i];
			if (ckinC2 == 45) {
				slash = i;
				break;
			}
		}
		for (int i = 0; i < Howlong; i++) {
			// System.out.println(targcharArray[i]);
			ckinC = (int) targcharArray[i];
			// System.out.println(ckinC);
			// System.out.println((ckinC>=58));
			// System.out.println((ckinC<=47));
			// System.out.println((ckinC!=45));
			if (((ckinC >= 58) || (ckinC <= 47)) && (ckinC != 45)) {
				// System.out.println("gt");
				for (int k = 0; k < word1.size(); k++) {
					bufferSAV = yes[k][1];

					int kyT = word1.get(k).length;
					for (int ky = 0; ky < kyT; ky++) {
						// System.out.println("target="+word1.get(k)[ky]);
						for (int i999 = 0; i999 < yes.length; i999++) {
							// System.out.print(yes[i999][0]+"*");
							// System.out.print(yes[i999][1]+" ");
						}
						// System.out.print("\n");
						if (ckinC != (int) word1.get(k)[ky]) {
							yes[k][1] = yes[k][1] * 1;
						} else {
							yes[k][1] = yes[k][1] * 0;
							kyu.kyu(k, ky);
							/*
							 * if (sav>=(1000/(Math.abs(((i*1000)/(slash*1000))-((ky*1000)/((word1.get(k).
							 * length+1)*1000)))+1))) { ; } yes[k][1]=bufferSAV;
							 * System.out.println(slash*1000);
							 * System.out.println((word1.get(k).length+1)*1000);
							 * System.out.println(Math.abs(((i*1000)/(slash*1000))-((ky*1000)/((word1.get(k)
							 * .length+1)*1000)))+1);
							 * yes[k][1]=yes[k][1]*(1000/(Math.abs(((i*1000)/(slash*1000))-((ky*1000)/((
							 * word1.get(k).length+1)*1000)))+1));
							 * sav=(1000/(Math.abs(((i*1000)/(slash*1000))-((ky*1000)/((word1.get(k).length+
							 * 1)*1000)))+1));
							 */
						}

					}
					yes[k][0] = yes[k][0] + yes[k][1];
					yes[k][1] = 1;
					sav = 0;
				}
			} else if (ckinC == 45) {
				break;
			}

		}
		/*
		 * LinkedList ll = new LinkedList(Arrays.asList(yes));
		 * System.out.println(Collections.min(list));
		 */
		for (int i999 = 0; i999 < yes.length; i999++) {
			// System.out.print(yes[i999][0]+"*");
			// System.out.print(yes[i999][1]+" ");
		}
		// System.out.print("\n");
//System.out.println("OK!");
		int big2 = yes[0][0];
		int big2i = 0;
		int samex = -1;
		int samey = -1;
		int finalo = 0;
		int ifn = 1;
		for (int i1x = 0; i1x < yes.length; i1x++) {
			for (int i1y = 0; i1y < yes.length; i1y++) {
				if ((i1y != i1x) && (yes[i1x][0] == yes[i1y][0])) {
					// System.out.println("(yes[i1x][0]==yes[i1y][0])"+(yes[i1x][0]==yes[i1y][0]));
					samex = i1x;
					samey = i1y;
					finalo = kyu.gtky();
					// System.out.println("gtky"+finalo);
					ifn = 0;
					break;
				}

			}
			if (ifn == 0) {
				break;
			}
		}
//System.out.println("8701");
		for (int i1 = 0; i1 < yes.length; i1++) {
			// System.out.println("8702");
			if (yes[i1][0] < big2) {
				big2 = yes[i1][0];
				big2i = i1;
				// System.out.println((finalo==big2i));

			}

		}
		if (big2 != 0) {
			System.out.println("輸入指令錯誤，已自動判斷");
		}
//System.out.println("samey"+samey+"finalo"+finalo+","+"big2i"+big2i);
		if ((samex == big2i) || (samey == big2i)) {
			;
		} else {
			// System.out.println("samey"+samey+"finalo"+finalo+","+"big2i"+big2i);
			finalo = big2i;
		}
//System.out.println("fanal"+finalo);
		kyu.clc();
		return (finalo);
	}

	public static class kyu {
		static ArrayList<int[]> k1 = new ArrayList<int[]>();

		public static void kyu(int pk, int pkyi) {
			int ok = 1;
			for (int i = 0; i < k1.size(); i++) {
				if (k1.get(i)[1] != pkyi) {
					ok = ok * 1;
				} else {
					ok = ok * 0;
				}

			}
			if (ok == 1) {
				int it[] = { pk, pkyi };
				k1.add(it);
			}
		}

		public static int gtky() {
			int k6[] = { 0, 0, 0, 0, 0, 0 };

			for (int i2 = 0; i2 < k1.size(); i2++) {
				// System.out.println("k1.get(i2)[0]"+k1.get(i2)[0]);
				k6[k1.get(i2)[0]]++;
				// for(int i21 =0;i21<k6.length ;i21++) {System.out.println("k6"+k6[i21]);}
			}
			int big = 0;
			int bigi = 0;
			for (int i21 = 0; i21 < k6.length; i21++) {
				// System.out.println("pig"+big+"_"+bigi);
				if (k6[i21] > big) {
					big = k6[i21];
					bigi = i21;

				}

			}
			k1.clear();
			return bigi;
		}

		public static void clc() {
			k1.clear();
		}

	}
}