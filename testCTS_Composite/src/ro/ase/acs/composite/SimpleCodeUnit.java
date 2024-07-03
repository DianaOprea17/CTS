package ro.ase.acs.composite;

public class SimpleCodeUnit implements Code{

    private String codeSnippet;

    public SimpleCodeUnit(String codeSnippet) {
        this.codeSnippet = codeSnippet;
    }

    @Override
    public boolean containsUnsafeCode() {
        return codeSnippet.contains("strcpy");
    }
}
