
/*area of "//"*
*1.use {} to RPS "{" & "}" -> mark end of {} :: easy to read
*2.use "//" area of to mark part of code ::
*__In It :: "*" RPS start of area ; use "EOF" to mark end
*3.use <!-- to mark varible
*4.(...)
*///EOF of "//"

import java.util.*;
import static java.lang.System.out;

public class jvmain {
	public static void main(String args[]) {

		// area of try*
		dayc dayc = new dayc();
		ReadInput input = new ReadInput();
		// ~String getInputStr = input.Getinput(0);
		// ~System.out.println(getInputStr);
		datapack pack = new datapack();
		datebuffer datebuffer =new datebuffer();
		buble buble =new buble();
		/*
		 * ~ANOTHER WAY IS OK! * REF to <use []> (SEE ReadInput.java) ReadInput input =
		 * new ReadInput(); String[] getInputStr = input.Getinput(0);
		 * System.out.println(getInputStr[0]); ~EOF way2
		 */
		// EOF try

		// into basic
		setup steup = new setup();
		steup.setup();
		System.out.print("\n");
		// end of basic

		// comper
		comper com = new comper();
		com.set();
		// com.comper();
		// comper

		int counii = 0;
		while (counii == 0) {
			int date=-1;
			System.out.println("��J���O:");
			int comz = com.comper();
			switch (comz) {
			case 0:
				System.out.println("�t�αo����O:day�F���b����...");
				date = -1;
				String addin = input.Inbuffer();
				if (addin.indexOf("/") != -1) {
					date = Integer.valueOf(addin.substring(addin.indexOf("/") + 1, addin.indexOf("/") + 3));

				} else {
					System.out.println("�������B��ݭn��/�j�}!�����J���~!");break;
				}
				if ((date<1)||(date>31)) {System.out.println("������~!");break;}
				dayc.dayc(date);
				datebuffer.datebuffer(date);
				break;
			case 1:
				System.out.println("�t�αo����O:exit�F���b����...");
				break;
			case 2:
				int wrong = 0;
				try {
					if(datebuffer.GDB()==-1) {System.out.println("add���O�u��Ω�day�Ҧ�!");break;}
					date=datebuffer.GDB();
					System.out.println("�t�αo����O:add�F���b����...");
					String addin2 = input.Inbuffer();
					char[] addiny = addin2.toCharArray();
					int counter2 = 0;
					int recind = -1;
					int recind2 = -1;
					int adT = 0;
					for (int i = 0; i < addiny.length; i++) {
						if (((int) addiny[i] == 45) && (counter2 != 1)) {
							counter2 = 1;
							recind = i;
						} else if (((int) addiny[i] == 45) && (counter2 == 1)) {
							recind2 = i;
							break;
						}
					}
					if (recind2 == -1) {
						System.out.println("���O�榡���~�A�ݭn2��'-'��!(�п�J���ʤ��e�P�ɶ�!)");
						break;
					}
					try {
						adT += (Integer.valueOf(addin2.substring(recind + 1, recind + 2))) * 10000000;
						adT += (Integer.valueOf(addin2.substring(recind + 2, recind + 3))) * 1000000;
					} catch (java.lang.NumberFormatException ex) {
						System.out.println(
								"���~!�ɶ����:�_�l�ɶ�[�p��]�A�s�b���X�k���Ů�βŸ�(�^��P����Ҥ��o�X�{������)�F��J���ɶ����A�p��(������)10���ơA�ХH0�}�Y!(�ɶ�����ܪk��HH:MM~HH:MM)");
						break;

					}
					int inputFOK = -1;
					char mohwc = ':';
					int mohw = (int) mohwc;
					for (int i = 0; i < addiny.length; i++) {
						if (addiny[i] == mohw) {
							inputFOK++;
							switch (inputFOK) {
							case 0:
								try {
									adT += (Integer.valueOf(addin2.substring(i + 1, i + 2))) * 100000;
									adT += (Integer.valueOf(addin2.substring(i + 2, i + 3))) * 10000;
								} catch (java.lang.NumberFormatException ex) {
									System.out.println(
											"���~!�ɶ����:�}�l�ɶ�[����]�A�s�b���X�k���Ů�βŸ�(�^��P����Ҥ��o�X�{������)�F��J���ɶ����A�p��(������)10���ơA�ХH0�}�Y!(�ɶ�����ܪk��HH:MM~HH:MM)");
									wrong = 1;
									break;

								}
								break;
							case 1:
								try {
									adT += (Integer.valueOf(addin2.substring(i + 1, i + 2))) * 10;
									adT += (Integer.valueOf(addin2.substring(i + 2, i + 3))) * 1;
								} catch (java.lang.NumberFormatException ex) {
									System.out.println(
											"���~!�ɶ����:�I��ɶ�[����]�A�s�b���X�k���Ů�βŸ�(�^��P����Ҥ��o�X�{������)�F��J���ɶ����A�p��(������)10���ơA�ХH0�}�Y!(�ɶ�����ܪk��HH:MM~HH:MM)");
									wrong = 1;
									break;

								}
								break;
							}
						}
					}
					if (wrong == 1) {
						break;
					}
					if (inputFOK != 1) {
						System.out.println("���O�榡���~�A�ɶ��ѼƤ��ɻP���Х�':'�j�}(�Фſ�J���ŦX�W�w���ɶ��Ѽ�)!");
						break;
					}
					int lambda = -1;
					char lmdac = '~';
					int lmda = (int) lmdac;
					for (int i = 0; i < addiny.length; i++) {
						if (addiny[i] == lmda) {
							lambda++;
							try {
								adT += (Integer.valueOf(addin2.substring(i + 1, i + 2))) * 1000;
								adT += (Integer.valueOf(addin2.substring(i + 2, i + 3))) * 100;
							} catch (java.lang.NumberFormatException ex) {
								System.out.println(
										"���~!�ɶ����:�I��ɶ�[�p��]�A�s�b���X�k���Ů�βŸ�(�^��P����Ҥ��o�X�{������)�F��J���ɶ����A�p��(������)10���ơA�ХH0�}�Y!(�ɶ�����ܪk��HH:MM~HH:MM)");
								wrong = 1;
								break;

							}

						}
					}
					if (wrong == 1) {
						break;
					}

					if (lambda != 0) {
						System.out.println("���O�榡���~�A��ɶ��Х�'~'�j�}(�Фſ�J���ŦX�W�w���ɶ��Ѽ�)!");
						break;
					}
					
					if (((adT / 1000000) >= 24) || (((adT % 1000000) / 10000) >= 60) || (((adT % 10000 / 100)) >= 24)
							|| ((adT % 100) >= 60) || ((adT / 1000000) < 0) || (((adT % 1000000) / 10000) < 0)
							|| (((adT % 10000 / 100)) < 0) || ((adT % 100) < 0)) {
						System.out.println("���s�b�j��24�ɡB�j��60���B�p��0����ڮɶ��A�Э��s�T�{��J!(�䤤�t�Τ��s�b24:00�A���Ӭ�00:00)");

						break;
					}
					if ((adT / 10000) >= (adT % 10000)) {
						System.out.println("���~!�ɶ��_�l������ɶ��פ�!");

						break;
					}
					//System.out.println("OK");
					int timere=-1;
					for (int i = 0; i < pack.numL(); i++) {
						//System.out.println("OK1");
						//System.out.println((adT / 1000000)+"_"+(adT % 10000 / 100));
						for (int t = (adT / 1000000); t <= (adT % 10000 / 100); t++) {
						//	System.out.println("OK2");
							for (int m = ((adT % 1000000) / 10000); m < (adT % 100); m++) {
								//System.out.println("OK3");
								//System.out.println(((pack.num(i)) / 10000) + "_" + ((t * 100) + m) + "_"
									//	+ ((pack.num(i)) % 10000) + "_" + ((t * 100) + m));
								if (((pack.num(i)) / 10000) == ((t * 100) + m)
										|| ((pack.num(i)) % 10000) == ((t * 100) + m)) {
									System.out.println("���~!�ɶ�����!");
									timere=1;
									break;

								}
							}
						}
					}
if (timere==1) {break;}

int timere2=-1;
for (int i = 0; i < pack.numL(); i++) {
	//System.out.println("OK1");
	//System.out.println((adT / 1000000)+"_"+(adT % 10000 / 100));
	for (int t = (pack.num(i) / 1000000); t <= (pack.num(i) % 10000 / 100); t++) {
		//System.out.println("OK2");
		for (int m = ((pack.num(i) % 1000000) / 10000); m < (pack.num(i) % 100); m++) {
			//System.out.println("OK3");
			//System.out.println((adT / 10000) + "_" + ((t * 100) + m) + "_"
					//+ (adT % 10000) + "_" + ((t * 100) + m));
			if ((adT / 10000) == ((t * 100) + m)
					|| (adT % 10000) == ((t * 100) + m)) {
				System.out.println("���~!�ɶ�����!");
				timere2=1;
				break;

			}
		}
	}
}
if (timere2==1) {break;}
					pack.save(adT, addin2.substring(recind2 + 1, addin2.length()));
					System.out.print("�w�K�[�ɶ�" +(adT / 1000000)+":" +((adT % 1000000) / 10000)+"~"+((adT % 10000 / 100))+":"+(adT % 100)+"�A�䬡�ʬ�:");
					System.out.println(addin2.substring(recind2 + 1, addin2.length()));
					pack.addID(date*1000);
					///System.out.println("date*1000"+(date*1000));
					buble.buble();

				} catch (java.lang.NumberFormatException ex) {
					System.out.println(
							"���~!��J���ɶ����A�p��(������)10���ơA�ХH0�}�Y!(�ɶ�����ܪk��HH:MM~HH:MM)�C�䤤:�ť����ɶ���J���Ȥ����Ѧ۰ʭץ��A���L�k�P�_����ť���F�åB�A�Фũ�ɶ���줤��J�D�Ʀr���r���A�����|�����Ѧ۰ʭץ��C");
					break;
				}

				break;
			case 3:
				System.out.println("�t�αo����O:month�F���b����...");
				datebuffer.datebuffer(-1);
				break;
			case 4:
				System.out.println("�t�αo����O:del�F���b����...");
				break;
			case 5:
				System.out.println("�t�αo����O:edit�F���b����...");
				break;
			}
		}

	}

	/*
	 * history //~String inputU = input.Getinput(0); //~String Scanday = "day";
	 * //~String dash = "-"; //if (((inputU) ->
	 * {return(inputU.indexOf(Scanday));})!=1){System.out.prinr("OK");} CC cc = new
	 * CC() ; //~System.out.println(cc.CheckCommand(cc.exit)); //start save
	 * //~ArrayList<String> list = new ArrayList<String>(); //~public add(int
	 * addday) { if ((cc.CheckCommand(cc.add_))!=0) { //~pack.addID("0"); String
	 * addin = input.Inbuffer(); System.out.println(addin); String d_ ="d-";
	 * //~String a1; //~String a2; //~ArrayList<String> nowhite = new
	 * ArrayList<String>(); //~for (int z = 0 ; z < lengthOf(addin) ; z++)
	 * {nowhite.add(addin.substring(addin.indexOf(z), addin.indexOf(z+1)));} int a1
	 * = Integer.valueOf(addin.substring(addin.indexOf(d_)+2, addin.indexOf(d_)+4));
	 * int a2 = Integer.valueOf(addin.substring(addin.indexOf(":")+1,
	 * addin.indexOf("~"))); String b1; String b2; String b; //~a =
	 * get.index(addin.indexOf(d_)+1); System.out.println(a1*100+a2); //~pack.save(
	 * ,); //~System.out.println(pack.index("v")); //~dayc time = new dayc();
	 * //~time.dayc(1); } //end save history
	 */

	// char PKKITRY = input.Getinput(0).charAt(0);
	// System.out.println((int)PKKITRY);

	/*
	 * HISTORY~ //area of set up* int tryint = 0 ; //<!--just for test //area of set
	 * up EOF //area of try* pack pack1=new pack(); StaticClass StaticClass=new
	 * StaticClass(); StaticClass.StadicClassPrintPrivateInt(); OutClass
	 * OutClass=new OutClass(); OutClass.OutClassPrintPrivateInt();
	 * pack1.PrintPrivateInt(); System.out.print("start"); //area of try EOF
	 */// ~HISTORY

}// {public static void main...}

// area of man add class*

// history
/*
 * //area of eat public static class CC{ ReadInput inputcc = new ReadInput();
 * public final String day_10 = "day-10/"; public final String exit = "exit";
 * public final String add_ = "add-"; public final String month = "month";
 * public final String del_all = "del-all"; public final String edit_ = "edit-";
 * int CheckCommand (String C) { ///*int i = 0 ; ///*while (i<C.length)
 * {//BUG~!!! String CCI= inputcc.Getinput(0); int check_command =
 * CCI.indexOf(C)+1; if (check_command != 0) {return 1;}
 * //&&(inputU.indexOf(dash)!=-1)) {System.out.print("OK");} ///*i=C.lenght;
 * ///*} return 0; } } //EOF eat
 */
//eof-histoty

// set up class

class buble{
	
	static datapack DPB =new datapack();
	public static void buble() {
		//System.out.println("BB");
		int bubBF =-1;
		for (int i=0;i<DPB.idL();i++) {
			//System.out.println("for (int i=0;i<DPB.idL();i++)");
			if (DPB.id(i)!=-1) {
				//System.out.println("if (DPB.id(i)!=-1) {");
				
				bubBF=DPB.id(i)/1000;
				//System.out.println("bubBF"+bubBF);
				int set0 =-1;
				set0=DPB.id(i)/1000;
				set0=set0*1000;
				DPB.listset(i,set0);
				int ifno=0;
				for (int iP=0;iP<DPB.idL();iP++) {
					//System.out.println("for (int iP=0;iP<DPB.idL();iP++) {");
					if ((DPB.id(iP)/1000)==bubBF) {
						//System.out.println("if ((DPB.id(iP)/1000)==bubBF) {");
						//System.out.println(set0);

						//if (iP!=i) {
							//System.out.println("if (iP!=i) {");
							if (DPB.num(i)/10000 < DPB.num(iP)/10000) {
								ifno--;
								//System.out.println("if (DPB.num(i)/10000 < DPB.num(iP)/10000) {");
								int dbiidbuf = -1 ;
								dbiidbuf=DPB.id(i);
								dbiidbuf=dbiidbuf+1;
								//System.out.println(dbiidbuf);
								DPB.listset(i,dbiidbuf);
							}
						//}/*else {
							/*int dbiidbuf = -1 ;
							dbiidbuf=DPB.id(i);
							dbiidbuf=dbiidbuf+1;
							System.out.println(dbiidbuf);
							DPB.listset(i,dbiidbuf);
						}*/
					}
				}
				/*if (ifno==0) {
					int dbiidbuf2 = -1 ;
					dbiidbuf2=DPB.id(i);
					dbiidbuf2=dbiidbuf2;
					System.out.println(dbiidbuf2);
					DPB.listset(i,dbiidbuf2);
				}*/
			}
		}
	}
}

class datebuffer{
	static int DB=-1;
	public static void datebuffer(int DBi) {
	DB=DBi;
	//System.out.println("DB"+DB);
	}
	public static int GDB(){
		//System.out.println("GDB"+DB);
		return(DB);
		
	}
}

class setup {
	public static String[] setup() {
		// into basic
		/**/String[] dayarrayR = new String[32]; /// <!--have 32 day here changable
		int day_filter = 31; // <--!changeable
		int printdayfilter = -1; // <!--counter
		final int week = 7;
		System.out.println("        2018�~10��"/* 8_ */);
		for (int day = 0; day <= day_filter; day++) {
			printdayfilter++;
			/**/dayarrayR[day] = Integer.toString(day);
			if (day == 0) {
				System.out.print("    ")/* 4"_" */;
				continue;
			} else {
				;
			}
			if (printdayfilter < week) {
				// String[] dayarrayR = new String[day+10];
				// System.arraycopy(dayarrayR, 0, dayarrayR, 0, dayarrayR.length);
				System.out.print(dayarrayR[day] + "  ");
			} else {
				System.out.print("\n");
				System.out.print(dayarrayR[day] + "  ");
				printdayfilter = 0;
			}
			if (day < 10) {
				System.out.print(" ");
			} else {
				;
			}
		} // {for.print day}
			// end of basic
		return (dayarrayR);
	}// {setup-fn}
}// {setup-class}

// EOF set up

// day class
class dayc {
	static datapack daycPack = new datapack();
	static int bufc = -1;
	static int ook = 0;
	static int coubfu = 0;

	public static void dayc(int daycIn) {
		bufc = -1;
		ook = 0;
		coubfu = 0;
		System.out.print("        2018�~10��"/* 8_ */);
		System.out.println(daycIn + "��");

		System.out.println("����:");
		if (daycPack.idL() == 0) {
			System.out.println("�|�L���󬡰ʡA�вK�[!");
			return;
		} else {
			bufc = -1;
			ook = 0;
			coubfu = 0;
			//for (int i = 0; i < daycPack.idL(); i++) {
				//if (((daycPack.id(i) / 1000) == daycIn) && (bufc < (daycPack.id(i) % 1000))) {
					//bufc = (daycPack.id(i) % 1000);
				//}
			//}
			if (daycPack.idL() == -1) {
				System.out.println("����L���󬡰�!");
				return;
			}
			//while (ook == 0) {
			System.out.println("OK");
				for (int i = 0; i < daycPack.idL(); i++) {
					//System.out.println("for (int i = 0; i < daycPack.idL(); i++)");
					//System.out.println(coubfu);
					//System.out.println(((daycPack.id(i) / 1000) == daycIn));
					//System.out.println(daycIn);
					//System.out.println(i);
					//System.out.println("daycPack.id(i)"+daycPack.id(i));
					if (((daycPack.id(i) / 1000) == daycIn) && ((daycPack.id(i) % 1000) > coubfu)) {
						//System.out.println(coubfu);
						coubfu = (daycPack.id(i) % 1000);
						//System.out.println((daycPack.id(i) % 1000) + ". "/* 1_ */ + daycPack.num(i) + " "/* 1_ */
								//+ daycPack.txt(i));
					}
				}
				for (int ib = 0; ib < (coubfu+1); ib++) {
				for (int i = 0; i < daycPack.idL(); i++) {
					if (((daycPack.id(i) / 1000) == daycIn) && ((daycPack.id(i) % 1000) == ib)) {
						//coubfu = (daycPack.id(i) % 1000);
						int adTC = daycPack.num(ib);
						System.out.println(((daycPack.id(ib) % 1000)+1) + ". "/* 1_ */ + +(adTC / 1000000)+":" +((adTC % 1000000) / 10000)+"~"+((adTC % 10000 / 100))+":"+(adTC % 100)+ " "/* 1_ */
								+ daycPack.txt(ib));
					}
				}
				}
			//}
		}
		// System.out.print(daycPack.num(0)+" "/*2_*/);
		// System.out.println(daycPack.txt(0));
	}// {setup-fn}
//}// {setup-class}

// EOF day

	/*
	 * HISTORY~ public static class StaticClass{
	 * 
	 * //area of set up private int StaticClassPrivateInt = 870 ; public void
	 * StadicClassPrintPrivateInt () { System.out.print(StaticClassPrivateInt);
	 * }//{public void StadicClassPrintPrivateInt () //area of set up
	 * 
	 * }//{public class}
	 */// ~HISTORY

// end of man add class

}// {public class jvmain}

/*
 * NOTIFICATION! NO WRIGHT THIS WAY!
 * 
 * //area of man add out class //area of set up public class OutClass{ private
 * int OutClassPrivateInt = 870 ; public void OutClassPrintPrivateInt () {
 * System.out.print(OutClassPrivateInt); }//{public void
 * StadicClassPrintPrivateInt () }//{public static class OutClass} //area of set
 * up //end of man add out class
 * 
 */// END of NOTIFICATION~

//***************************************/
/*
 * REF ArrayList �غc�Ψ䥦�`�Τ�k�G
 * 
 * �غc��k:
 * 
 * ArrayList<String> list = new ArrayList<String>(); ArrayList<String> list =
 * new ArrayList(Arrays.asList("Ryan", "Julie", "Bob"));
 * ��ؤ�k�t�b���L��l�ȡA�t�~��ƫ��A���O�i�H�ٲ����g�A������ĳ�ٲ��A�e���X�{Exception�C
 * 
 * 
 * 
 * �Ӧb JAVA 1.7 ���᪺�����ŧi�W�i�H�A��²�ơA�p�U
 * 
 * ArrayList<String> list = new ArrayList<>();
 * 
 * �b new ��誺 <> ����ƫ��A�O�i�H���ε����A�]���P�e���ŧi���@�˩ҥH�i�ٲ�
 * 
 * ��L���O Arrays�BMap�BHashMap �����i�H�ϥΦ���k�֥��@�I�r
 * 
 * 
 * 
 * �g�`�ϥΪ���k�G
 * 
 * 1.�[�J����
 * 
 * String str = new String();
 * 
 * list.add(str);
 * 
 * list.add("Array List!");
 * 
 * 
 * 
 * 2.����
 * 
 * list.get(index);
 * 
 * 
 * 
 * 3.�d��list�j�p
 * 
 * int size = list.size();
 * 
 * 
 * 
 * 4.�d�߯S�w����
 * 
 * boolean isIn = list.contains(s);
 * 
 * boolean isIn = list.contains("value");
 * 
 * �d�ߦ��^��true�A�Ϥ���false
 * 
 * 
 * 
 * 5.�d�߯S�w������m
 * 
 * int idx = list.indexOf(s);
 * 
 * �^�ǼƭȰ_�l�Ȭ�0
 * 
 * 
 * 
 * 6.�P�_List�O�_����
 * 
 * boolean empty = list.isEmpty();
 * 
 * �p�G list.size �j�� 0 �h�^�� true�A�Ϥ��� false
 * 
 * 
 * 
 * 7.�R���S�w����
 * 
 * list.remove(index);
 * 
 * �R����p��index���٦���ơA�᭱����Ʒ|�۰ʦV�e�ɤW
 * 
 * 
 * 
 * 8.�Ƨ�
 * 
 * Collections.sort(ArrayList<?>);
 * 
 * ArrayList �G�߰}�C�Ϊk�G
 * 
 * �غc��k�G
 * 
 * ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
 * 
 * list.add(new ArrayList<String>);
 * 
 * �H�W��泣�O���ݪ��A�b�Ĥ@�檺�ɭ�<>����ArrayList<String>�u�O�ŧilist������ƫ��A��ArrayList<String>�A
 * �èS���blist���[�J����A�ҥH�b�ĤG��[�J����C
 * 
 * �]�i�H�o��
 * 
 * ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
 * 
 * ArrayList<String> inSideList = new ArrayList<String>();
 * 
 * list.add(inSideList);
 * 
 * �n�`�N���O�A�ڭ̲{�b�n���O�G�߰}�C�A��M�̭���ArrayList���|�u���@�ӡA
 * ���p�G�n�s�J�ĤG��ArrayList�ɥ��ݦAnew�X�@��ArrayList�A�s�J�A�ܼƦW�٥i�H�ۦP�A���p�G�Snew���ܷ|�s���P�@�ӰO�����}�A
 * ���M�}�C�j�p�|�O�A���w���A���O�o�쪺�ȳ��|�O�P�@�ӡC
 * 
 * �[�J�����G
 * 
 * list.get(index).add(new ArrayList<String>());
 * 
 * list.get(index).add("value");
 * 
 * �[�J�ĤG�Ӱ}�C�G
 * 
 * list.add(new ArrayList<String>());
 * 
 * 
 * 
 * ���Ȥ�k�G
 * 
 * list.get(index).get(index);
 * 
 * �䥦�Ϊk�G
 * 
 * �]�ثe�u�@�ݭn�A�ҥH�ؤF�@�ӥi�H�s��Ʈw���}�C����
 * 
 * �غc��k�G
 * 
 * Map<String, ArrayList<ArrayList<String>>> map = new HashMap<String,
 * ArrayList<ArrayList<String>>>();
 * 
 * ���ΤT�ߪ�ArrayList�]�i�H�o��t���h���ĪG�A��Map���n�B�N�O�����O�H�Ʀr�Ǹ��@���d�߱���A�ӬO�ۤw���w�@��key�A�Bkey�����٥i�H�۩w�A
 * �ӧڻݭn�s�J��ƪ�W�١A�ҥH�N�O��String�ơC
 * 
 * �b�إߦnMap�����M���e��ArrayList�]�O�ݭnnew���A�إߪ���k�P�G�����ۦP�A�ҥH���A�����C
 * 
 * �[�J�����G
 * 
 * �i�H���إ�map�A�[�J��
 * 
 * Map<String, ArrayList<ArrayList<String>>> map = new HashMap<String,
 * ArrayList<ArrayList<String>>>();
 * 
 * map.put("key", new ArrayList<ArrayList<String>>());
 * 
 * map.get("key").add(new ArrayList<String>());
 * 
 * map.get("key").get(0).add("xxx");
 * 
 * 
 * 
 * �Υ���ArrayList���JMap
 * 
 * ArrayList<ArrayList<String>>() list = new ArrayList<ArrayList<String>>();
 * 
 * list.add(new ArrayList<String>);
 * 
 * list.get(index).add("value");
 * 
 * map.put("key", list);
 * 
 * 
 * 
 * ���Ȥ�k�G
 * 
 * map.get(key).get(index).get(index);
 * 
 * 
 * 
 * �[�J�����L�{�|�]�һݥ\��Ӧ��Ҥ��P�A���䰵�k��곣�j�P�p���A�u�n�F�Ѭ���n�o�˰��AArrayList��Map�|�ܦ��ܦn�Ϊ��u��C
 * 
 */
