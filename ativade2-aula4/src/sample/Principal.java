package sample;

public class Principal {
    Aluno a1, a2;

    public void entraDados(){
        a1 = new Aluno();
        a1.setRa(34894898);
        a1.setNome("victor");
        a1.setEnem(900.9);
        a2 = new Aluno();
        a2.setRa(984562354);
        a2.setNome("diniz");
        a2.setEnem(1000.0);

    }
    public void mostraDados(){
        System.out.println("-----------");
        System.out.println("ra   :" + a1.getRa());
        System.out.println("nome  :" + a1.getNome());
        System.out.println("Enem   :"+ a1.getEnem());
        System.out.println("-----------");
        System.out.println("ra   :" + a2.getRa());
        System.out.println("nome  :" + a2.getNome());
        System.out.println("Enem   :"+ a2.getEnem());
    }

    public static void main (String args[]){

        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();

    }

}
