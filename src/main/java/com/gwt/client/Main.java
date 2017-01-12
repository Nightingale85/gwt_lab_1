package com.gwt.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Main implements EntryPoint {

	public static final String IMAGE_URL = "https://avatars-01.gitter.im/group/iv/3/57542d2fc43b8c601977a5b5";

	public void onModuleLoad() {

		  final Label label = new Label(); 
		  label.setText("Hello World!");

		  final Image image = new Image();
		  image.setUrl(IMAGE_URL);
		  image.setPixelSize(40, 40);

		  HorizontalPanel panel = new HorizontalPanel();
		  panel.add(image);
		  panel.add(label);

	          RootPanel.get("gwtContainer").add(panel);
   }
}
