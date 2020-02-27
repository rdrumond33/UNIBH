# Teoria da Computacao

 Implementação de um Autômato Determinístico em JAVA 

## Descrição

 O objetivo de um analisador lexico de um compilador é ler os caracteres do programa fonte,agrupa-los em lexemas, identificar o **token** correspondente ao lexema e gerar como saída uma sequência de tokens.

- Um lexema é uma sequencia de caracteres do programa fonte que casa com o padrão de algum token.
- Um padrão é uma especificação da forma que os lexemas de um token podem assumir.
- Um token é um par <"nome,valor">:
  - Nome: Símbolo abstrato que representa um tipo de unidade léxica (por exemplo, identificador,palavra-chave, constante inteira,operador de atribuição, etc).
  - Valor: O lexema representado pelo token.
  
## AFD para a especificação de padrões em Javinha

![Figura AFD](https://user-images.githubusercontent.com/31081356/75406694-e4f65b80-58ef-11ea-8f2b-99db7ff1fe37.png)

## Exemplo de Programa Javinha

### HelloJavinha

```Java
public class HelloJavinha
    integer data_entrega;
    string msgm;//Comentario

    data_entrega != 2.54 / 11;

    msgm = "Bom trabalho!" ;

    SystemOutDispln ("Caros alunos, O TP ja esta disponivel.");

end
```

#### Resultado

![Resultado Javinha](https://user-images.githubusercontent.com/31081356/75406543-74e7d580-58ef-11ea-9863-e36febf2bd9b.png)

### Programa Javinha com error

```java
public class HelloJavinhaComErro
    integer x; 
    integer y;
    double media;

    media = x + y / 2.a;

end
```

#### Resultado

![error-javinha](https://user-images.githubusercontent.com/31081356/75406935-89789d80-58f0-11ea-9464-705ff8d5d8cd.png)
