class Professor extends Funcionario{
    String curso;
    
    Professor(String n, int m,Float s, String c) {
      super (n,m,s);
      curso =c;
    }
    void setCurso(String c){
        curso = c;
    }
    String getCurso(){
        return curso;
    
    }
    public String toString(){
        String saida ="Nome....:"+nome+"\n";
        saida+="Matricula:"+ matricula+"\n";
        saida+="Salario...:" + salario + "\n";
        saida+="curso...:" + curso;
        return saida;
        
    }
}