
public class PilhaTest {
	Pilha pilha = new Pilha();
	
	public boolean testRetiraUltimoLivro() {
		Livro livro = new Livro("A Fortaleza");
		pilha.push(livro);
		
		livro = new Livro("A Emboscada");
		pilha.push(livro);
		
		livro = new Livro("O Naufrago");
		pilha.push(livro);
		
		String resultadoEsperado = "O Naufrago";
		
		return pilha.pop().getTitulo().equals(resultadoEsperado);
	}
	
	public boolean testNaoAdicionaLivroAlemLimite() {
		Pilha pilha = new Pilha();
		Livro livro1 = new Livro("A Fortaleza");
		Livro livro2 = new Livro("A Emboscada");
		Livro livro3 = new Livro("O Imperio");
		Livro livro4 = new Livro("A Terra");
		Livro livro5 = new Livro("O Sol");
		Livro livro6 = new Livro("A Lua");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		pilha.push(livro5);
		pilha.push(livro6);
		
		String resultadoEsperado = "O Sol";
		
		return pilha.pop().getTitulo().equals(resultadoEsperado);
		
	}
	
	public boolean testnaoAdicionaLivroForaPadraoNome() {
		Pilha pilha = new Pilha();
		Livro livro = new Livro("A Fortaleza");
		pilha.push(livro);
		Livro livro2 = new Livro("Homem de Ferro");
		pilha.push(livro2);
		
		String resultadoEsperado = "A Fortaleza";
		
		return pilha.pop().getTitulo().equals(resultadoEsperado);
	}

}
