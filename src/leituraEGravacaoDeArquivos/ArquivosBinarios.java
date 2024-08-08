package leituraEGravacaoDeArquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArquivosBinarios {
    public static void main(String[] args) {
        // Stream de dados - dados gerados continuamente por milhares de fontes de dados diferentes
        // Stream binario - qualquer tipo de dado - os bytes de dados nao sao traduzidos ou interpretados como caracteres

        // Java I/O - pacote java.io
        // possui classes responsaveis pela leitura e gravacao de dados
        // em formato texto ou binario em arquivos ou outras fontes de dados

        // modo binario - classes abstratas InputStream e OutputStream
        // declarar objetos usando a classe FileInputStream e FileOutputStream

        FileInputStream in = null;
        FileOutputStream out = null;

        // arquivo binario - contem dados ilegiveis por editores de texto comuns
        // todos os arquivos que nao possuem formato de texto - ex: jpg, mp3, mp4, pdf

        // try, catch e finally - usado para tratar excecoes

        // try - trabalhar com o arquivo
        // catch - tratar excecoes
        // finally - fechar o FileInputStream ou FileOutputStream
        

        // OutputStream - metodos:

        // write(int) - grava o byte especificado no fluxo de saida
        
        // write(byte[] b) - grava a matriz especificada de bytes no fluxo de saida

        try {
            byte[] dados = {10, 20, 30, 40, 50};

            // gravar no arquivo - caso nao exista o arquivo com o nome passado, um novo e criado na raiz do projeto
            out = new FileOutputStream("dados.bin");
            out.write(dados);

        } catch (IOException e) {
            e.printStackTrace();
        
        } finally {
            try {
                out.close();
                
            } catch (IOException e) {
                e.printStackTrace();

            }
        }


        // InputStream - metodos:

        // read() - le byte a byte - retorna o byte representado por um int e retorna -1 quando chega ao final do arquivo

        // read(byte[] b) - le ate b.length bytes de dados do fluxo de entrada e os armazena no array de bytes fornecido
        // retorna o numero de bytes lidos, ou -1 se o final do fluxo de saida foi alcancado ou se nao houver mais dados

        try {
            // ler o arquivo
            in = new FileInputStream("dados.bin");
            in.read();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                // fechar
                in.close();

            } catch (IOException e) {
                e.printStackTrace();
                
            }
        }
    }
}