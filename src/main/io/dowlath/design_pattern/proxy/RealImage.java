package io.dowlath.design_pattern.proxy;

public class RealImage implements Image{
private String fileName;
public RealImage(String fileName){
	this.fileName = fileName;
	loadFromDisk(fileName);
}
public void display(){
	System.out.println("Real Image File Name.....: "+fileName);
}

private void loadFromDisk(String fileName){
	System.out.println("Loading from disk.... "+fileName);
}
}
