package abp;

import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.interactive.action.PDPageAdditionalActions;

public class ImageToPdf {
	
	 public static void main(String[]args) throws IOException, ClassNotFoundException 
	    {
		 
		 String sourceDir="/Users/bheemesh/Desktop/testing/one.pdf";
		 String destinationDir="/Users/bheemesh/Downloads/logs/";
		 File sourceFile=new File(sourceDir);
		 File destinationFile=new File(destinationDir);
		 if(!destinationFile.exists()){
			 destinationFile.mkdir();
			 System.out.println("Folder Created"+destinationFile);
		 }
		 if(sourceFile.exists())
		 {
			 PDDocument document = PDDocument.load(new File("/Users/bheemesh/Desktop/testing/one.pdf"));
			 @SuppressWarnings("unchecked")
				List<PDPage> list = (List<PDPage>) document.getDocumentCatalog().getPages();
				//String fileName = sourceFile.getName().replace(".pdf", "");
			 String fileName = sourceFile.getName().replace(".pdf", "");
				int pageNumber = 1;
				for (PDPage page : list) {
					PDPageAdditionalActions image =page.getActions();
				File destinationFile1 = new File(destinationDir + fileName + "_" + pageNumber + ".png");
					ImageIO.write((RenderedImage) image, "png", destinationFile1);
					pageNumber++;
				}
				document.close();
				System.out.println("Image saved at -> " + destinationFile.getAbsolutePath());
			} else {
				System.err.println(sourceFile.getName() + " File does not exist");
 }
		 
	 
	 }
	 
}
