class SimuladordeBanco{
    //static private int numeroDoCliente;
    private int numeroDoCliente;
    private int numeroDoCaixa;
    SimuladordeBanco(int n)
    {
        numeroDoCaixa = n;
        numeroDoCliente = 0;
        System.out.println("Caixa" + numeroDoCaixa + "iniciou operação");
    }
 
        public void proximoAtendimento()
        {
            numeroDoCliente = numeroDoCliente +1 ;
            System.out.println("Cliente com senha número" + numeroDoCliente + "favor");
            System.out.println("dirigir-se ao caixa número" + numeroDoCaixa);
        }
 
}