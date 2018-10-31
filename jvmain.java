
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
			System.out.println("輸入指令:");
			int comz = com.comper();
			switch (comz) {
			case 0:
				System.out.println("系統得到指令:day；正在執行...");
				date = -1;
				String addin = input.Inbuffer();
				if (addin.indexOf("/") != -1) {
					date = Integer.valueOf(addin.substring(addin.indexOf("/") + 1, addin.indexOf("/") + 3));

				} else {
					System.out.println("日期之月、日需要用/隔開!日期輸入錯誤!");break;
				}
				if ((date<1)||(date>31)) {System.out.println("日期錯誤!");break;}
				dayc.dayc(date);
				datebuffer.datebuffer(date);
				break;
			case 1:
				System.out.println("系統得到指令:exit；正在執行...");
				break;
			case 2:
				int wrong = 0;
				try {
					if(datebuffer.GDB()==-1) {System.out.println("add指令只能用於day模式!");break;}
					date=datebuffer.GDB();
					System.out.println("系統得到指令:add；正在執行...");
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
						System.out.println("指令格式錯誤，需要2個'-'號!(請輸入活動內容與時間!)");
						break;
					}
					try {
						adT += (Integer.valueOf(addin2.substring(recind + 1, recind + 2))) * 10000000;
						adT += (Integer.valueOf(addin2.substring(recind + 2, recind + 3))) * 1000000;
					} catch (java.lang.NumberFormatException ex) {
						System.out.println(
								"錯誤!時間欄位:起始時間[小時]，存在不合法的空格或符號(英文與中文皆不得出現於該欄位)；輸入之時間中，小於(不等於)10之數，請以0開頭!(時間之表示法為HH:MM~HH:MM)");
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
											"錯誤!時間欄位:開始時間[分鐘]，存在不合法的空格或符號(英文與中文皆不得出現於該欄位)；輸入之時間中，小於(不等於)10之數，請以0開頭!(時間之表示法為HH:MM~HH:MM)");
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
											"錯誤!時間欄位:截止時間[分鐘]，存在不合法的空格或符號(英文與中文皆不得出現於該欄位)；輸入之時間中，小於(不等於)10之數，請以0開頭!(時間之表示法為HH:MM~HH:MM)");
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
						System.out.println("指令格式錯誤，時間參數之時與分請用':'隔開(請勿輸入不符合規定的時間參數)!");
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
										"錯誤!時間欄位:截止時間[小時]，存在不合法的空格或符號(英文與中文皆不得出現於該欄位)；輸入之時間中，小於(不等於)10之數，請以0開頭!(時間之表示法為HH:MM~HH:MM)");
								wrong = 1;
								break;

							}

						}
					}
					if (wrong == 1) {
						break;
					}

					if (lambda != 0) {
						System.out.println("指令格式錯誤，兩時間請用'~'隔開(請勿輸入不符合規定的時間參數)!");
						break;
					}
					
					if (((adT / 1000000) >= 24) || (((adT % 1000000) / 10000) >= 60) || (((adT % 10000 / 100)) >= 24)
							|| ((adT % 100) >= 60) || ((adT / 1000000) < 0) || (((adT % 1000000) / 10000) < 0)
							|| (((adT % 10000 / 100)) < 0) || ((adT % 100) < 0)) {
						System.out.println("不存在大於24時、大於60分、小於0之實際時間，請重新確認輸入!(其中系統不存在24:00，應植為00:00)");

						break;
					}
					if ((adT / 10000) >= (adT % 10000)) {
						System.out.println("錯誤!時間起始應早於時間終止!");

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
									System.out.println("錯誤!時間重複!");
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
				System.out.println("錯誤!時間重複!");
				timere2=1;
				break;

			}
		}
	}
}
if (timere2==1) {break;}
					pack.save(adT, addin2.substring(recind2 + 1, addin2.length()));
					System.out.print("已添加時間" +(adT / 1000000)+":" +((adT % 1000000) / 10000)+"~"+((adT % 10000 / 100))+":"+(adT % 100)+"，其活動為:");
					System.out.println(addin2.substring(recind2 + 1, addin2.length()));
					pack.addID(date*1000);
					///System.out.println("date*1000"+(date*1000));
					buble.buble();

				} catch (java.lang.NumberFormatException ex) {
					System.out.println(
							"錯誤!輸入之時間中，小於(不等於)10之數，請以0開頭!(時間之表示法為HH:MM~HH:MM)。其中:空白鍵於時間輸入欄位暫不提供自動修正，恕無法判斷任何空白鍵；並且，請勿於時間欄位中輸入非數字之字元，該欄位尚未提供自動修正。");
					break;
				}

				break;
			case 3:
				System.out.println("系統得到指令:month；正在執行...");
				datebuffer.datebuffer(-1);
				break;
			case 4:
				System.out.println("系統得到指令:del；正在執行...");
				break;
			case 5:
				System.out.println("系統得到指令:edit；正在執行...");
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
		System.out.println("        2018年10月"/* 8_ */);
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
		System.out.print("        2018年10月"/* 8_ */);
		System.out.println(daycIn + "日");

		System.out.println("活動:");
		if (daycPack.idL() == 0) {
			System.out.println("尚無任何活動，請添加!");
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
				System.out.println("本日無任何活動!");
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
 * REF ArrayList 建構及其它常用方法：
 * 
 * 建構方法:
 * 
 * ArrayList<String> list = new ArrayList<String>(); ArrayList<String> list =
 * new ArrayList(Arrays.asList("Ryan", "Julie", "Bob"));
 * 兩種方法差在有無初始值，另外資料型態其實是可以省略不寫，但不建議省略，容易出現Exception。
 * 
 * 
 * 
 * 而在 JAVA 1.7 之後的版本宣告上可以再更簡化，如下
 * 
 * ArrayList<String> list = new ArrayList<>();
 * 
 * 在 new 後方的 <> 內資料型態是可以不用給的，因為與前面宣告的一樣所以可省略
 * 
 * 其他像是 Arrays、Map、HashMap 等都可以使用此方法少打一點字
 * 
 * 
 * 
 * 經常使用的方法：
 * 
 * 1.加入元素
 * 
 * String str = new String();
 * 
 * list.add(str);
 * 
 * list.add("Array List!");
 * 
 * 
 * 
 * 2.取值
 * 
 * list.get(index);
 * 
 * 
 * 
 * 3.查詢list大小
 * 
 * int size = list.size();
 * 
 * 
 * 
 * 4.查詢特定元素
 * 
 * boolean isIn = list.contains(s);
 * 
 * boolean isIn = list.contains("value");
 * 
 * 查詢有回傳true，反之為false
 * 
 * 
 * 
 * 5.查詢特定元素位置
 * 
 * int idx = list.indexOf(s);
 * 
 * 回傳數值起始值為0
 * 
 * 
 * 
 * 6.判斷List是否為空
 * 
 * boolean empty = list.isEmpty();
 * 
 * 如果 list.size 大於 0 則回傳 true，反之為 false
 * 
 * 
 * 
 * 7.刪除特定元素
 * 
 * list.remove(index);
 * 
 * 刪除後如該index後還有資料，後面的資料會自動向前補上
 * 
 * 
 * 
 * 8.排序
 * 
 * Collections.sort(ArrayList<?>);
 * 
 * ArrayList 二唯陣列用法：
 * 
 * 建構方法：
 * 
 * ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
 * 
 * list.add(new ArrayList<String>);
 * 
 * 以上兩行都是必需的，在第一行的時候<>內的ArrayList<String>只是宣告list中的資料型態為ArrayList<String>，
 * 並沒有在list中加入元件，所以在第二行加入元件。
 * 
 * 也可以這麼做
 * 
 * ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
 * 
 * ArrayList<String> inSideList = new ArrayList<String>();
 * 
 * list.add(inSideList);
 * 
 * 要注意的是，我們現在要的是二唯陣列，當然裡面的ArrayList不會只有一個，
 * 但如果要存入第二個ArrayList時必需再new出一個ArrayList再存入，變數名稱可以相同，但如果沒new的話會存取同一個記憶體位址，
 * 雖然陣列大小會是你指定的，但是得到的值都會是同一個。
 * 
 * 加入元素：
 * 
 * list.get(index).add(new ArrayList<String>());
 * 
 * list.get(index).add("value");
 * 
 * 加入第二個陣列：
 * 
 * list.add(new ArrayList<String>());
 * 
 * 
 * 
 * 取值方法：
 * 
 * list.get(index).get(index);
 * 
 * 其它用法：
 * 
 * 因目前工作需要，所以建了一個可以存資料庫的陣列元素
 * 
 * 建構方法：
 * 
 * Map<String, ArrayList<ArrayList<String>>> map = new HashMap<String,
 * ArrayList<ArrayList<String>>>();
 * 
 * 其實用三唯的ArrayList也可以得到差不多的效果，但Map的好處就是它不是以數字序號作為查詢條件，而是自已指定一個key，且key的型還可以自定，
 * 而我需要存入資料表名稱，所以就是用String嘍。
 * 
 * 在建立好Map之後當然內容的ArrayList也是需要new的，建立的方法與二維的相同，所以不再說明。
 * 
 * 加入元素：
 * 
 * 可以先建立map再加入值
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
 * 或先建ArrayList後放入Map
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
 * 取值方法：
 * 
 * map.get(key).get(index).get(index);
 * 
 * 
 * 
 * 加入元素過程會因所需功能而有所不同，但其做法其實都大同小異，只要了解為何要這樣做，ArrayList及Map會變成很好用的工具。
 * 
 */
