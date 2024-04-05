public class Livro {
    private String titulo;
    private String autor;
    private int anodepublicacao;
    private float preco;
    private int qtdpaginas;

    public Livro(String titulo, String autor, int anodepublicacao, float preco, int qtdpaginas){

        this.titulo = titulo;
        this.autor = autor;
        this.anodepublicacao = anodepublicacao;
        this.preco = preco;
        this.qtdpaginas = qtdpaginas;
    }

public String getTitulo(){
        return titulo;
}

public String getAutor(){
        return autor;
}

public int getAnodepublicacao(){
        return anodepublicacao;
}

public float getPreco(){
        return preco;
}
public int getQtdpaginas(){
        return qtdpaginas;
}

public void setTitulo(String titulo){
        this.titulo = titulo;
}
public void setAutor(String autor){
        this.autor = autor;
}
public void setAnodepublicacao(int anodepublicacao){
        this.anodepublicacao =  anodepublicacao;
}
public void setPreco(float preco){
        this.preco = preco;
}
public void setQtdpaginas(int qtdpaginas){
        this.qtdpaginas = qtdpaginas;
}
public double calcularPrecoPorPagina(){
        return preco / qtdpaginas;
    }
public void impressaoLivros() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Ano de publicação: " + anodepublicacao);
    System.out.println("Preço: " + preco);
    System.out.println("Quantidade de páginas: " + qtdpaginas);
}
}
