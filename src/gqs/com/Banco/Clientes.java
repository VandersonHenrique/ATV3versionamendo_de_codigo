public class Cliente {

    private int id;
    private String nome;
    private int desconto;   
    private String genero;  

    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.genero = "nd";          
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getDesconto() {
        return desconto;
    }


    public void setDesconto(int desconto) {
        if (desconto < 0 || desconto > 100) {
            throw new IllegalArgumentException("Desconto precisa estar entre 0 e 100.");
        }
        this.desconto = desconto;
    }

    public void setGenero(String genero) {
        if (!genero.equals("m") && !genero.equals("f") && !genero.equals("nd")) {
            throw new IllegalArgumentException("Gênero inválido. Use \"m\", \"f\" ou \"nd\".");
        }
        this.genero = genero;
    }

    @Override
    public String toString() {
        return String.format("%s(%d) (%d%%)", nome, id, desconto);
    }
}
