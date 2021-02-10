package org.vorobiev.lawOrder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.vorobiev.lawOrder.db.CustomerRepo;
import org.vorobiev.lawOrder.model.Customer;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        System.out.println("############################### appStatusMessage:");

        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner initialize(CustomerRepo customerRepo) {



        return args -> {
          //  if (customerRepo.count()<10){
            if (0<0){


           /* Stream.of("1st test message  ", "2nd test message", "3rd test message").forEach(text -> {

                Request req = new Request(text);

                repoRequest.save(req);
            });*/
                int i=0;



                while(i<1){


                    Customer req = new Customer("customer N "+Integer.toString(i),"","");
                    i++;
                   customerRepo.save(req);
                    }

                /**/
            }
           customerRepo.findAll().forEach(System.out::println);
                System.out.println("nn");
        };
    }
}