package anotacoes;

public @interface Cabecalho {
	
	String instituicao();
	String projeto();
	String dataCriacao();
	String criador();
	int revisao() default 1;
	
}
