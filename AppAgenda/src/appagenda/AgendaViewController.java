/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appagenda;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javax.persistence.EntityManager;

/**
 * FXML Controller class
 *
 * @author Victor Garcia Vera 2DAM
 */
public class AgendaViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
