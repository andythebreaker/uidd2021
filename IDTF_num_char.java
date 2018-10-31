/*
 * STATIC :: CODE == undevelop !
 * (...) ;
 * 
 *  NOTE:
 *  (...)
 */

/*area of import*/
//(...)
/*EOF import*/

public class IDTF_num_char {

	// area of set up*
	//(...)
	// EOF set up

	// area of Fn
	public String NumChar(int bytelenghtIn) {
		
		//area of setup
		
		//EOF set up

		// area of main*
		
		//area of set
		if (bytelenghtIn == 0) { bytelenghtIn = 5000;}
		
		try {// 'exception
				byte[] inbyte = new byte[bytelenghtIn];//CALL BUG!
				ArrayList bytelist = new ArrayList();
				if (in.read(inbyte) > 0 ) {// at here will not use lenght logic (*NO USE LENGHT)
				
					String str = new String(inbyte, "Big5").trim();
				
					//area of out put
					String returnS = str;//<!--str === put str
					return (returnS);
					//EOF out put
				
				}/*{if in read}*/else {
					System.out.print("輸入不合法!請重新輸入!(輸入數字長度屬不合法區間)\n");//due to NO USE LENGHT -> well not run!
				}	
		} catch (java.io.IOException ex) {
			System.out.print("輸入不合法!請重新輸入!(錯誤代碼:IOException)\n");
		} catch (java.lang.StringIndexOutOfBoundsException ex) {
			System.out.print("輸入不合法!請重新輸入!(錯誤代碼:字串過長)\n");
		} catch (java.lang.NumberFormatException ex) {
			System.out.print("輸入不合法!請重新輸入!(錯誤代碼:型別錯誤)\n");
		}//{EOF try and catch
		// EOF main
		
		//area of return
		return "";
		//EOF of return

	}//(FN)

	// EOF Fn
	
	//start of outter class
	public static class num{
		
	}
	//EOF out class

}// {public class ReadInput}