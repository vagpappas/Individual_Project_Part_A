/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registration;

import data.Data;
import java.util.ArrayList;
import java.util.Scanner;
import models.Trainer;

/**
 *
 * @author Vaggelis
 */
public class TrainerService {
    
    

   static ArrayList<Trainer> trainerList = new ArrayList<>();

    public Trainer addTrainer() {

        Data data = new Data();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give trainer's first name");
        String fName = scanner.nextLine();
        System.out.println("Give trainer's last name");
        String lName = scanner.nextLine();
        System.out.println("Give trainer's subject");
        String subject = scanner.nextLine();



        Trainer trainer = new Trainer(fName,lName,subject);
        trainerList.add(trainer);
        data.addTrainer(trainer);
        System.out.println(trainerList);
        return trainer;
    }
    
}
