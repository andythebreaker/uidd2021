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
					System.out.print("��J���X�k!�Э��s��J!(��J�Ʀr�����ݤ��X�k�϶�)\n");//due to NO USE LENGHT -> well not run!
				}	
		} catch (java.io.IOException ex) {
			System.out.print("��J���X�k!�Э��s��J!(���~�N�X:IOException)\n");
		} catch (java.lang.StringIndexOutOfBoundsException ex) {
			System.out.print("��J���X�k!�Э��s��J!(���~�N�X:�r��L��)\n");
		} catch (java.lang.NumberFormatException ex) {
			System.out.print("��J���X�k!�Э��s��J!(���~�N�X:���O���~)\n");
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