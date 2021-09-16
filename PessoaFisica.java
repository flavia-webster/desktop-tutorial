package ACMEContabilidade;
public class PessoaFisica extends Pessoa implements Calculavel {


    private double salario;


    public PessoaFisica(String nome, Estado estado, double salario) {
        super(nome, estado);
        this.salario = salario;

        //TODO Auto-generated constructor stub
    }
    
    public double getSalario() {
        return salario;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + " Estado: " + getEstado() + " Salario: " + getSalario();
    }

    @Override
    public String getNomeIdentificador() {
        return getNome();
    }

    @Override
    public double getRendimento() {
        return 0;
    }

    @Override
    public double CalculaImposto() {
        double  aliquota;
        if (getSalario() > 0 && getSalario() <= 1903.98){
            aliquota = getSalario() * 0;
            return aliquota;
        }
        if (getSalario() >= 1903.99 && getSalario() <= 4664.68 ){
            aliquota = getSalario() * 0.15;
            return aliquota;
        }
        else {
            aliquota = getSalario() * 0.275 ;
            return aliquota ;
        }
    }
    
}
