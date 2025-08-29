package br.com.mariojp.solid.isp;

public interface MultiFunctionDevice extends Printer{
	void print(String content);

	void scan(String targetFile);
}
