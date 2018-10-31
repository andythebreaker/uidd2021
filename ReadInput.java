/*
 * STATIC :: CODE == final !
 * CODE USE :: no use input Fn() ; clone USER CMD input ;
 * 
 *  NOTE:
 *  1. inside "//" use "'" to RPS fn command ; "~" to RPS NO USE line of code
 */

/*area of import*/
import java.util.ArrayList; //'motivation array used import
import java.util.Arrays; //'same as up
/*EOF import*/

public class ReadInput {

	// area of set up*
	java.io.InputStream in = System.in;// <!--?-->
	String input = new String();
	static String buffer = new String();
	// ~int bytelenghtIn = 0;
	// EOF set up

	// area of buffer
	public String Inbuffer() {
		/* System.out.println(buffer+"CK"); */return (buffer);
	}
	// EOF buffer

	// area of Fn
	public String Getinput(int bytelenghtIn) {// if == 0 -> no use of ... ; set == 5000

		// area of setup
		// ~String returnS = "OK";
		// ~return (returnS);
		/*
		 * ~ANOTHER WAY IS OK ! * REF to <use []> (SEE main.java "REF to <use...>")
		 * public String[] Getinput (int how) { String[] returnS = {"OK"}; return
		 * (returnS); } ~EOF way2
		 */
		// EOF set up

		// area of input main*

		// area of set
		if (bytelenghtIn == 0) {
			bytelenghtIn = 5000;
		}

		try {// 'exception
			byte[] inbyte = new byte[bytelenghtIn];// CALL BUG!
			ArrayList bytelist = new ArrayList();
			if (in.read(inbyte) > 0) {// at here will not use lenght logic (*NO USE LENGHT)

				String str = new String(inbyte, "Big5").trim();

				// area of out put
				String returnS = str;// <!--str === put str
				buffer = str;
				/* System.out.println(buffer+"CK1"); */
				return (returnS);
				// EOF out put

			} /* {if in read} */else {
				System.out.print("輸入不合法!請重新輸入!(輸入數字長度屬不合法區間)\n");// due to NO USE LENGHT -> well not run!
			}
		} catch (java.io.IOException ex) {
			System.out.print("輸入不合法!請重新輸入!(錯誤代碼:IOException)\n");
		} catch (java.lang.StringIndexOutOfBoundsException ex) {
			System.out.print("輸入不合法!請重新輸入!(錯誤代碼:字串過長)\n");
		} catch (java.lang.NumberFormatException ex) {
			System.out.print("輸入不合法!請重新輸入!(錯誤代碼:型別錯誤)\n");
		} // {EOF try and catch
			// EOF input

		// area of return
		return "";
		// EOF of return

	}

	// EOF Fn

}// {public class ReadInput}