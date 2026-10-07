package org.example;

public interface Autenticavel {
    boolean login(String usuario, String senha);
    void logout();
}
public interface Remotavel {
    void iniciarJornadaRemota();
    void encerrarJornadaRemota();
}