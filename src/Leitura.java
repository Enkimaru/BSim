
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enki
 */
public class Leitura {
    


    
    public Player loadPlayer(){
        Player p1 = null;
        String[] leituraJogador = null;
        try {
            String linha = null;
            
            File caminho = new File("src/Arquivos/statsplayer.txt");
            FileReader arquivoPlayer = new FileReader(caminho.getAbsolutePath());
            BufferedReader leitor = new BufferedReader(arquivoPlayer);
            while ((linha = leitor.readLine()) != null) {
               
                leituraJogador = linha.split ("/");
            }
            p1 = new Player(leituraJogador[0], 
                    Integer.parseInt(leituraJogador[1]), Integer.parseInt(leituraJogador[2]),
                    Integer.parseInt(leituraJogador[3]), Integer.parseInt(leituraJogador[4]),
                    Integer.parseInt(leituraJogador[5]),Integer.parseInt(leituraJogador[6]),
                    Integer.parseInt(leituraJogador[7]));
            
        } catch(IOException e){
	    	System.out.println("Error" + e);
	    }
        return p1;
    }
}
