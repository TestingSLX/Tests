import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Color
import java.awt.image.BufferedImage
import java.awt.image.DataBuffer

import javax.imageio.ImageIO

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8081/?config=6477e9530cb64cafb07cc153da28ac98&url=https://streetlogix-dev-server.herokuapp.com&token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTAyNiwibmFtZSI6IlNocnV0aWthIFNhd2FudCIsImV4cCI6MTYyNzE2NjM3OSwiaWF0IjoxNjI0NTc0Mzc5fQ.lfJ6w6AynIdt2n-CGEC9TW9JvJOWH3188kZhjBv6qvs')

WebUI.click(findTestObject('Object Repository/test/Page_Streetlogix/span_Dashboard_esri-icon-close operationIcon'))

File file1 = new File("C:\\Users\\shrut\\Downloads\\screenshot.png")
BufferedImage image1 = ImageIO.read(file1);
DataBuffer imageA = image1.getData().getDataBuffer();

WebUI.takeFullPageScreenshot("C:\\Users\\shrut\\Downloads\\screenshot1.png")

File file2 = new File("C:\\Users\\shrut\\Downloads\\screenshot1.png")
BufferedImage image2 = ImageIO.read(file2);
DataBuffer imageB = image2.getData().getDataBuffer();

WebUI.delay(10)

int w1 = image1.getWidth();
int w2 = image2.getWidth();
int h1 = image1.getHeight();
int h2 = image2.getHeight();
if ((w1!=w2)||(h1!=h2)) {
   System.out.println("Both images should have same dimwnsions");
} else {
   long diff = 0;
   for (int j = 0; j < h1; j++) {
	  for (int i = 0; i < w1; i++) {
		 //Getting the RGB values of a pixel
		 int pixel1 = image1.getRGB(i, j);
		 Color color1 = new Color(pixel1, true);
		 int r1 = color1.getRed();
		 int g1 = color1.getGreen();
		 int b1 = color1.getBlue();
		 int pixel2 = image2.getRGB(i, j);
		 Color color2 = new Color(pixel2, true);
		 int r2 = color2.getRed();
		 int g2 = color2.getGreen();
		 int b2= color2.getBlue();
		 //sum of differences of RGB values of the two images
		 long data = Math.abs(r1-r2)+Math.abs(g1-g2)+ Math.abs(b1-b2);
		 diff = diff+data;
	  }
   }
   double avg = diff/(w1*h1*3);
   double percentage = (avg/255)*100;
   System.out.println("Difference: "+percentage);
}

//if(imageA.getSize() == imageB.getSize()) {
//	for(int i=0; i<imageA; i++) {
//		if(imageA.getElem(i) != imageB.getElem(i)) {
//			return false;
//		}
//	}
//	return true;
//}
//
//if(image1.equals(image2)) {
//	println("BINGOOOOO......")
//}



