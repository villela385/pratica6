package exercicio6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManipuladorArquivo {
		public static void leitor(String path) throws IOException {
			BufferedReader leitor = new BufferedReader(new FileReader(path));
			String ProjetoSocial = "";
			while (true) {
				if (ProjetoSocial != null) {
					System.out.println(ProjetoSocial);

				} else
					break;
				ProjetoSocial = leitor.readLine();
			}
			leitor.close();
		}

		public static void escritor(String path) throws IOException {
			BufferedWriter escrever = new BufferedWriter(new FileWriter(path));
			String linha = "";
	        String nome, arquivo, caminho, titulo, objetivo, endereco, dataInicio, status;
	        ArrayList<String> ProjetoSocial = new ArrayList();
			Scanner ler = new Scanner(System.in);
			System.out.println("");
			System.out.println("Informe o titulo: ");
            titulo=ler.next();
            System.out.println("Informe o objetivo: ");
            objetivo=ler.next();
            System.out.println("Informe o endereço: ");
            endereco=ler.next();
            System.out.println("Informe a data de inicio: ");
            dataInicio=ler.next();
            System.out.println("Informe o status do projeto: ");
            status=ler.next();
            ProjetoSocial.add("Titulo do projeto: "+titulo+" \nObjetivo: "+objetivo+" \nEndereço: "+endereco+" \nData de inicio: "+dataInicio+"\nStatus: "+status);
            escrever.append(Arrays.toString( ProjetoSocial.toArray()));
            System.out.println("");
     		escrever.close();
			
		}
	}