/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class ClientService {

    public int saveClient(Client client, ArrayList<Client> clients) {
        Client loadedClient = findById(client.getId(), clients);
        if (loadedClient != null) {
            return -1;
        } else if (client.getId().isEmpty() == true || client.getAdresse().isEmpty() == true || client.getNom().isEmpty() == true || client.getPassword().isEmpty() == true) {
            return -2;
        } else {
            clients.add(client);
            return 1;
        }

    }

    public int loginClient(String id, String password, ArrayList<Client> clients) {
        Client c = findById(id, clients);
        if (c == null) {
            return -1;
        } else if (!c.getId().equals(id)) {
            return -2;
        } else if (!c.getPassword().equals(password)) {
            return -3;
        } else {
            return 1;
        }
    }

    public Client findById(String id, ArrayList<Client> clients) {
        for (int i = 0; i < clients.size(); i++) {
            Client c = clients.get(i);
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

}
