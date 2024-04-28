package io.dowlath.design_pattern.proxy;
/*
 *    Proxy Design Pattern :
 *                            An Object representing another object. (or) Class representing functionality of another class.
 */

public class ProxyDesignPatternTest {
    public static void main(String args[]){
    	ProxyImage proxy = new ProxyImage("Dowlath.jpg");
    	proxy.display();
    	proxy.display();
    }
}
