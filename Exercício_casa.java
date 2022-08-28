public class Exercício_casa {
    public static void main(String[] args) {
        String nome = "Bruno Bagetti";
        String emailp1 = "brunotarso";
        String emailp2 = "hotmail.com";
        String cpf1 = "096";
        int cpf2 = 846;
        String cpf3 = "074";
        int cpf4 = 74;
        System.out.println("######### USUÁRIO #########");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf1 + "." + cpf2 + "." + cpf3 + "-" + cpf4);
        System.out.println("Email: " + emailp1 + "@" + emailp2);
        System.out.println("Senha: ************");
        System.out.println("###########################");

        System.out.printf("%s%n%s%s%n%s%s%s%s%s%s%s%s", "######### USUÁRIO #########", "Nome: ", nome, "CPF: ", cpf1, ".", cpf2, ".", cpf3, "-", cpf4);

}}
