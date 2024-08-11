# Aulas de lp2

Este repositório é destinado aos conteúdos de Linguagem de Programação 2 do curso de Informática do Instituto Federal de São Paulo. O lp2-331-Estudo-Java foca exclusivamente no estudo da programação em Java, abordando conceitos e recursos mais complexos da linguagem em relação ao repositório lp1-331-Estudo-Java, incluindo formas de interação e manipulação de dados de arquivos e interfaces de Collection.

## Estruturação do repositório

- **Raiz:**

    - /src.
    - Arquivos para teste - `dados.bin` e `dados.txt`.
    - `README.md`.

- **/src:**
    - Código-fonte.

- **README.md:**
    - Descrição do repositório:
        - Motivo.
        - Estruturação do repositório.
        - Conteúdos.
        - Observações.
        - Contato.

## Conteúdos - /src

### /metodosDeUtilidadeDeObjeto:

Neste diretório, são apresentados três dos mais usados métodos da classe Object, que podem ser sobreescritos para que se adeque à classe em que forem usados. Esses métodos são: hashCode, equals e toString.

- Funções e estrutura dos métodos de utilidade de Objeto:
    - hashCode. 
    - equals.
    - toString. 

- `Main.java` - Teste que mostra o funcionamento dos métodos.


### /Collections:

Neste diretório, o foco é descrever o que é a interface Collection e as outras principais interfaces que a extendem, evidênciando suas diferenças mais importantes. Interfaces para a ordenação, principalmente de listas, também foram apresentadas. 

- **/tiposESeusMetodos:**   
    - Métodos próprios e descrição das interfaces de Collection:
        - List.
        - Map.
        - Queue.
        - Set.

    - `MetodosDeCollection.java` - Métodos comuns entre List, Set e Queue.

- **/interfacesDeComparacaoDeObjetos:**
    - Comparable:
        - Objetivo e funcionamento.
        - Métodos compareTo e sort.
        - Formas de comparação (igual para o Comparator).
        - `Main.java` - Teste que mostra o funcionamento da interface.

    - Comparator:
        - Objetivo e funcionamento.
        - Métodos compare e sort.
        - `Main.java` - Teste que mostra o funcionamento da interface.

### /leituraEGravacaoDeArquivos:

Neste diretório, o foco é explicar como funciona para ler e gravar informações em um arquivo de dados em formato binário e em um arquivo de texto. Classes que possuem os métodos que tornam esses processos possíveis também foram apresentadas.

- `ArquivosBinarios.java`:
    - Stream de dados.
    - Java I/O.
    - Arquivo binário.
    - Classes para interagir com arquivo binário - InputStream e OutputStream.
    - Tratamento de exceções - try, catch e finally.
    - Métodos para ler e gravar no arquivo binário - read e write.
    - Teste neste mesmo arquivo que mostra o funcionamento dos métodos de interação com o arquivo `dados.bin`.

- `ArquivosTexto.java`:
    - Arquivo de texto.
    - Classes para interagir com arquivo de texto - Reader e Writer.
    - Métodos para ler e gravar no arquivo de texto - read e write.
    - Teste neste mesmo arquivo que mostra o funcionamento dos métodos de interação com o arquivo `dados.txt`.

## Observações



## Contato

Caso tenha dúvidas, entre em contato:

- Nome: Paulo Henrique Barbosa do Prado Pereira
- E-mail: pereirapaulo436@gmail.com
- LinkedIn: [Paulo Barbosa](https://www.linkedin.com/in/paulo-barbosa-61a860303/)
- GitHub: [2007paulohenrique](https://github.com/2007paulohenrique)