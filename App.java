

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;


class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println("CRIANDO UMA SENHA FORTE!");
        System.out.println("Digite uma senha");
        System.out.println();

        String senha = in.nextLine();
        Pattern p = Pattern.compile("/^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[$*&@#])[0-9a-zA-Z$*&@#]{8,}$/");
        Matcher m = p.matcher(senha);
    
        System.out.println(m.matches());

        if (!senha.matches(senha)){
            System.out.println("Senha Criada com sucesso");
        }
        
    }

}

    

    

