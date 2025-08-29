package br.com.mariojp.solid.isp;

import br.com.mariojp.solid.isp.Printer;
import javax.swing.text.StringContent;

public class OfficeService {
    private final Printer device;

    public OfficeService(Printer device) {
        this.device = device;
    }

    public void printReport(String content) {
        device.print(content);
    }
}
