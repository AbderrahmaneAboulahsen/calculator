import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        boolean T;
        String op;
        int numéro1,numéro2,resulats = 0;
        Scanner ecrire1= new Scanner(System.in);
        System.out.println("ajouter le 1er numéro ");
        numéro1=ecrire1.nextInt();
        System.out.println("ajouter le 2eme numéro ");
        numéro2=ecrire1.nextInt();
        System.out.println("donner le nom de l'opperation que vous voulaiz ");
        Scanner ecrire2= new Scanner(System.in);
        op=ecrire2.nextLine();
        if (op.equals("+")){
            resulats=numéro1+numéro2;
            T=true;
        }else{
            if (op.equals("-")){
                resulats=numéro1-numéro2;
                T=true;
            }else{
                if (op.equals("/")){
                    resulats=numéro1/numéro2;
                    T=true;
                }else{
                    if (op.equals("x")){
                        resulats=numéro1*numéro2;
                        T=true;
                    }else {System.out.println("error ");
                    T=false;
                    }
                }
                }


        }
        if(T==true){System.out.println(resulats);}
    }
}