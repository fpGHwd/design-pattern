package routines;

import java.awt.Image;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Suzumiya
 * @version Nov 18, 2018 4:06:51 PM
 * 
 */

public class NetworkProgramming {

	public static void test(String args[]) {
		String urlStr = "https://www.baidu.com";
		try {
			URL url = new URL(urlStr);
			try {
				Object content = url.getContent();
				String text;
				Image img;
				if (content instanceof String) {
					text = (String) content;
					System.out.println("string");
				} else if (content instanceof Image) {
					img = (Image) content;
					System.out.println("image");
				} else {
					System.out.println("not string or image");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws IOException {

		URL baidu = new URL("https://www.baidu.com/");
		DataInputStream dis = new DataInputStream(baidu.openStream());
		String inputLine;
		while((inputLine = dis.readLine())!=null){
			System.out.println(inputLine);
		}
		dis.close();

	}
}
