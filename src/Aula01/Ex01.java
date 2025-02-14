package Aula01;
//Revisão básica sobre JAVA
public class Ex01 {
    public static void main(String[]args){
        String name = "Matheus Chaves";
        int age = 19;
        double height = 1.75;

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Altura: " + height);

        if(age<=15){
            System.out.println(name + ", " + "Não pode votar!");
        }else if(age<18 || age>64){
            System.out.println(name + ", " + "O seu voto é facultativo!");
        }else{
            System.out.println(name + ", " + "O seu voto é obrigatório!");
        }
    }
}
