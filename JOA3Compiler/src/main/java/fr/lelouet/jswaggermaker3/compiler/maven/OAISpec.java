package fr.lelouet.jswaggermaker3.compiler.maven;


public class OAISpec {
	public String url;
	public String pck;

	@Override
	public String toString() {
		return "" + url + (pck == null ? "" : "[" + pck + "]");
	}
}
