package com.lti.pdf;

import java.io.FileOutputStream;
import java.io.Writer;

import javax.swing.text.html.ParagraphView;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerator {

	public static void main(String[] args) {

		Document document = new Document();
		try {
			PdfWriter pw = PdfWriter.getInstance(document, new FileOutputStream("hello.pdf"));
			document.open();
			document.add(new Paragraph("A Hello World PDF document.this is after new change"));
			document.close();
			pw.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
