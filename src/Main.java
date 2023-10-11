public class Main {

    public static void main(String[] args) {
        Aritmetica calculo = new Aritmetica();
        //Geometrica calculo = new Geometrica();

        Disciplina d = new Disciplina(calculo);
        d.setNome( "Padroes de Desenvolvimento");
        d.setP1(8);
        d.setP2(6);
        d.calcularMedia();
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situacao: %s",d.getP1(),d.getP2(), d.getMedia(), d.getSituacao()));
    }
}