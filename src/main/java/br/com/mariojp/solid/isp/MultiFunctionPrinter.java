package br.com.mariojp.solid.isp;

public class MultiFunctionPrinter implements MultiFunctionDevice {
    @Override
    public void print(String content) {
        System.out.println("Printing from MultiFunctionPrinter: " + content);
    }

    @Override 
    public void scan(String content) {
        System.out.println("Scanning with MultiFunctionPrinter: " + content);
    }

}
