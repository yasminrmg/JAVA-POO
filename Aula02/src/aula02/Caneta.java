/*foi ensinado como 
    criar classes 
    instanciar um objeto, 
    criar metodos, 
    e atributos
*/
package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("modelo: "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Ponta "+ this.ponta);
        System.out.println("carga "+ this.carga);
        System.out.println("Esta tampada "+ this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! não posso rabiscar");
        }else {
            System.out.println("Estou rabiscando");
        }
    }  
    void tampar (){
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}
