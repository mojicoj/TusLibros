package main;

public class Cliente {

    private String clientId;
    private String password;

    public Cliente(String clientId, String password){
        this.clientId = clientId;
        this.password = password;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
