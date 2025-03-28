import java.util.Scanner;
class Executavel{
    public static void main(String a[]){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Boa Noite Professor!");
        System.out.println("Digite seu Nome: ");
        String nome = teclado.next();
        System.out.println("Digite sua matricula: ");
        int matricula = teclado.nextInt();
        System.out.println("Digite seu Salario: ");
        float salario=teclado.nextFloat();
        System.out.println("Digite seu curso: ");
        String curso=teclado.next();
        Professor p1=new Professor(nome,matricula,salario,curso);
        //p1.setNome(nome);
        //p1.setMatricula(matricula);
        //p1.setSalario(salario);
        //p1.setCurso(curso);
        //System.out.println("Nome....:"+p1.getNome());
        //System.out.println("Matricula:"+p1.getMatricula());
        //System.out.println("Salario...:"+p1.getSalario());
        //System.out.println("curso.....:"+p1.getCurso());
        System.out.println(p1);
    }
}
        
        
        
        
    
