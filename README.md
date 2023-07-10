# Testes Automatizados em Java com JUnit e TDD


## Introdução
Este projeto fornece uma visão geral dos testes automatizados em Java, usando o JUnit e o desenvolvimento orientado por testes (Test-Driven Development, TDD). O JUnit é uma das estruturas de teste unitário mais populares para Java, e o TDD é uma metodologia de desenvolvimento que incentiva a escrita de testes antes do código de produção.

## JUnit
O JUnit é uma estrutura simples para escrever testes repetíveis em Java, tornando possível escrever código mais robusto e minimizando a introdução de bugs no sistema.

Principais métodos do JUnit:

* assertEquals(expected, actual): Verifica se duas variáveis são iguais. 
* assertNotEquals(expected, actual): Verifica se duas variáveis não são iguais.
* assertTrue(condition): Verifica se uma condição é verdadeira.
* assertFalse(condition): Verifica se uma condição é falsa.
* assertNotNull(object): Verifica se um objeto não é nulo.
* assertNull(object): Verifica se um objeto é nulo.
* assertSame(expected, actual): Verifica se duas referências de objeto apontam para o mesmo objeto.
* assertNotSame(expected, actual): Verifica se duas referências de objeto não apontam para o mesmo objeto.
* assertArrayEquals(expectedArray, actualArray): Verifica se duas arrays são iguais.

## Test-Driven Development (TDD)
TDD é uma abordagem de desenvolvimento de software que envolve escrever um teste que define uma melhoria de função ou um novo recurso. Esse teste deve falhar inicialmente, o desenvolvedor então implementa a funcionalidade para passar no teste e finalmente refatora o novo código para padrões aceitáveis.

Os passos do TDD são:

* Escrever o teste: Escreva um teste que descreve uma função que você deseja implementar.
* Rodar o teste: O teste deve falhar, pois a função ainda não foi implementada.
* Escrever o código: Escreva o código mínimo necessário para fazer o teste passar.
* Rodar o teste novamente: Se o teste passar, a implementação está correta.
* Refatorar: Agora você pode limpar seu código sabendo que não está quebrando nada, pois tem um teste que confirma a funcionalidade.
* Espera-se que, com o TDD, o código seja mais limpo e de maior qualidade, reduzindo os bugs e facilitando a manutenção.

Lembrando que para iniciar a escrita dos testes em Java, precisará das dependências do JUnit no seu projeto. No caso de um projeto Maven, por exemplo, você precisaria incluir algo assim no seu pom.xml:

````
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>
</dependencies>
````

# Conclusão
Testes automatizados e TDD são práticas essenciais para garantir a qualidade do código e minimizar a introdução de bugs em um sistema. O JUnit oferece uma gama de métodos de asserção que facilitam a implementação desses testes em Java.