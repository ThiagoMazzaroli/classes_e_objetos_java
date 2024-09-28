public class App {
    public static void main(String[] args) {

        Celular celularA = new Celular();

        celularA.nome = "Iphone 12";
        celularA.sistemaOperacional = "IOS";
        celularA.armazenamento = 256;
        celularA.tamanhoTela = 5.5f;

        Celular celularB = new Celular();

        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.sistemaOperacional = "Android";
        celularB.armazenamento = 256;
        celularB.tamanhoTela = 6.9f;

        Celular celularC = new Celular();

        celularC.nome = "Xiaomi Mi 11 pro";
        celularC.sistemaOperacional = "Android";
        celularC.armazenamento = 128;
        celularC.tamanhoTela = 6.81f;

    }
}
