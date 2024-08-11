package leituraEGravacaoDeArquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivosTexto {
    public static void main(String[] args) {
        // Stream de caracteres - compostos apenas de caracteres e organizados em linhas

        // modo texto - classes abstratas Reader e Writer
        // declarar objetos usando a classe FileReader e FileWriter

        FileReader re = null;
        FileWriter wr = null;

         
        // Writer - metodos:

        // write(int) - grava o int especificado no fluxo de saida
        
        // write(string) - grava a sequencia de caracteres (string) especificada no fluxo de saida

        try {
            String dado = "boa noite a todos";
            
            // gravar no arquivo - caso nao exista o arquivo com o nome passado, um novo e criado na raiz do projeto
            wr = new FileWriter("dados.txt");
            wr.write(dado);

        } catch (IOException e) {
            e.printStackTrace();
        
        } finally {
            try {
                wr.close();
                
            } catch (IOException e) {
                e.printStackTrace();

            }
        }


        // Reader - metodos:

        // read() - le caracter a caracter - retorna o caracter representado por um int e retorna -1 quando chega ao final do arquivo
        
        try {
            // ler o arquivo
            re = new FileReader("dados.txt");

            int c;

            while ((c = re.read()) != -1) {
                // para obter o caracter de sua representacao em int, adicione um cast (char)
                System.out.print((char)c);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                // fechar
                re.close();

            } catch (IOException e) {
                e.printStackTrace();
                
            }
        }
    }
}