package com.example.conceptionlogiciel.Controllers;

import com.example.conceptionlogiciel.Models.Client;
import com.example.conceptionlogiciel.Repository.ClientRepository;

import java.util.List;
//************Kévine Sawadogo************************

public class ControleurClient {


    private Client client;
    private List<Client> client;
    private ClientRepository repo;

    public ControleurClient()
    {
        repo = new ClientRepository();
    }

    public void createClient()
    {

    }

    public void insert(Client client)
    {
        repo.insert(client);
    }

    public boolean supprimerClient(Client client)
    {
        if (clientSupprimable())
        {
            repo.delete(client);
            return true;
        }
        return false;
    }

    public boolean clientSupprimable()
    {
        return client.isEnLocationClient();
    }

    public void getClient(String numeroImmatriculation)
    {
        repo.getClient(numeroImmatriculation);
    }

    public Client getClient() {return client;}

    public void setClient(client client) {this.client = client;}
    public List<Client> getClient()
    {
        return client;
    }


    public void setClient(List<Client> client)
    {
        this.client = client;
    }

    public ClientRepository getRepo()
    {
        return repo;
    }

    public void setRepo(ClientRepository repo)
    {
        this.repo = repo;
    }
}
