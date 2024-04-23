import java.util.ArrayList;
import java.util.Scanner;

public class EliminacaoBbb {
    public static void main(String[] args) {
        // Introdução
        System.out.println("Bem vindo(a)");
        System.out.println("Hoje é dia de votação no BBB.");
        System.out.println("Vamos começar?");

        ArrayList<Jogador> participantes = new ArrayList<Jogador>();
        participantes.add(new Jogador("Alane Dias"));
        participantes.add(new Jogador("Beatriz Reis"));
        participantes.add(new Jogador("Deniziane Ferreira"));
        participantes.add(new Jogador("Davi Brito"));
        participantes.add(new Jogador("Fernanda Bande"));
        participantes.add(new Jogador("Giovanna Lima"));
        participantes.add(new Jogador("Giovanna Pitel"));
        participantes.add(new Jogador("Isabelle Nogueira"));
        participantes.add(new Jogador("Juninho"));
        participantes.add(new Jogador("Leidy Elin"));
        participantes.add(new Jogador("Lucas Henrique"));
        participantes.add(new Jogador("Lucas Luigi"));
        participantes.add(new Jogador("Lucas Pizane"));
        participantes.add(new Jogador("Marcus Vinicius"));
        participantes.add(new Jogador("Matteus Amaral"));
        participantes.add(new Jogador("Maycon Cosmer"));
        participantes.add(new Jogador("MC Bin Laden"));
        participantes.add(new Jogador("Michel Nogueira"));
        participantes.add(new Jogador("Nizam"));
        participantes.add(new Jogador("Raquele Cardozo"));
        participantes.add(new Jogador("Rodriguinho"));
        participantes.add(new Jogador("Thalyta Alves"));
        participantes.add(new Jogador("Vanessa Lopes"));
        participantes.add(new Jogador("Vinicius Rodrigues"));
        participantes.add(new Jogador("Wanessa Camargo"));
        participantes.add(new Jogador("Yasmin Brunet"));

        System.out.println("Em quem você vota para sair da casa?");
        Scanner sc = new Scanner(System.in);
        String voto = sc.nextLine();
        

        int contador = 0;
        while (!voto.equals("sair")) {
            contador++;
            for (Jogador jogador : participantes) {
                if (jogador.getNome().equals(voto)) {
                    jogador.incrementaUmVoto();
                    System.out.println("Voto computado! Vote novamente ou digite 'sair' para ver o resultado da eliminação");
                    break;
                }
            }
            voto = sc.nextLine();
        }

        Jogador eliminado = participantes.get(0);
        for (Jogador jogador : participantes) {
            if (jogador.getVotos() > eliminado.getVotos()) {
                eliminado = jogador;
            }
        }

        int QtdVotos = eliminado.getVotos();
 

        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu vou conseguir te eliminar com alegria. Com " + QtdVotos + " votos, é você quem sai: " + eliminado.getNome());
        System.out.println("O número de votos computados foi: " + contador);
        System.out.println("Obrigado por participar!");


        sc.close();
    }
}

class Jogador {
    private String nome;
    private int votos;

    public Jogador(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementaUmVoto() {
        this.votos++;
    }
}