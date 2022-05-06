package com.example.conceptionlogiciel.Controllers;

import com.example.conceptionlogiciel.Models.Client;
import com.example.conceptionlogiciel.Repository.ClientRepository;

import java.util.List;
//************Kévine Sawadogo************************

public class ControleurClient {


    private Client client;
    private List<Client> clients;
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


    public void getClient(String numeroImmatriculation)
    {
        repo.getClient(numeroImmatriculation);
    }

    public Client getClient() {return client;}

    public void setClient(Client client) {this.client = client;}
    public List<Client> getClients()
    {
        return clients;
    }


    public void setClient(List<Client> clients)
    {
        this.clients = clients;
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
