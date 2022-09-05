public class Arroz extends Comida{

    public Arroz(double pesoComida) {
        super(pesoComida);
    }


    //Métodos sobrescritos da super classe Comida 
    @Override
    public double getPesoComida() {
        // TODO Auto-generated method stub
        return super.getPesoComida();
    }

    @Override
    public void setPesoComida(double pesoComida) {
        // TODO Auto-generated method stub
        super.setPesoComida(pesoComida);
    }  
}
