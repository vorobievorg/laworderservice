package org.vorobiev.lawOrder.db;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.vorobiev.lawOrder.db.CustomerRepo;
import org.vorobiev.lawOrder.model.*;
import sun.awt.X11.XSystemTrayPeer;


@org.springframework.web.bind.annotation.RestController
public class RestController {

 private LawOrderRepo  lawOrderRepo;


    @Autowired
    public RestController(LawOrderRepo lawOrderRepo)
    {
        this.lawOrderRepo = lawOrderRepo;
        //this.dealRepo = dealRepo;
       // this.debtItemRepo = debtItemRepo;
        //this.customerDebtItemRepo = customerDebtItemRepo;

    }

    /*
 @RequestMapping(path = "/customer",
   method = RequestMethod.POST,
   consumes = MediaType.APPLICATION_JSON_VALUE,
   produces = MediaType.APPLICATION_JSON_VALUE)

 public ResponseEntity<String> postCustomer(@RequestBody Customer customer) {
     //System.out.println(sCustomer);
     try {
         customer.setId(0);
        customer = customerRepo.save(customer);
//       for (CustomerDebtItem cd:customer.getCustomerDebtItems()){
//            cd.setId(0);
//            cd.setCustomer(customer);
//            customerDebtItemRepo.save(cd);
//         }
            return new ResponseEntity<String>("{\"id\": \"" + customer.getId() + "\"}", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("{\"fault\": \"" + e.getMessage() + "\"}", HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }

    @GetMapping("/customers")
    public Page<Customer> findAllCustomers(Pageable pageable) {
        return customerRepo.findAll(pageable);
    }
*/

    @GetMapping("/lawOrders")
    public Page<LawOrder> findAllDeals(Pageable pageable) {
        return lawOrderRepo.findAll(pageable);
    }


    @RequestMapping(path = "/lawOrder",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<String> postlawOrder(@RequestBody LawOrder lawOrder) {
        //System.out.println(sCustomer);
        try {
            lawOrder.setId(0);
            lawOrder = lawOrderRepo.save(lawOrder);

            return new ResponseEntity<String>("{\"id\": \"" + lawOrder.getLawOrderId()+ "\"}", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("{\"fault\": \"" + e.getMessage() + "\"}", HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }


    @RequestMapping(path = "/lawOrder",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<String> putLawOrder(@RequestBody  LawOrder lawOrder){

        try {
            lawOrder = lawOrderRepo.save(lawOrder);
            return new ResponseEntity<String>("{\"status\": \"Ok\"}", HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("{\"fault\": \""+e.getMessage()+"\"}", HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }


    @GetMapping("/lawOrder/{id}")
    public LawOrder findLawOrderById(@PathVariable("id") int id) throws InterruptedException {

        return lawOrderRepo.findById(id).get();
    }



    @DeleteMapping("/lawOrder/{id}")
    public ResponseEntity delLawOrder(@PathVariable("id") int id){

        try{
            lawOrderRepo.deleteById(id);
            return new ResponseEntity<String>("{\"status\": \"Ok\"}", HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<String>("{\"fault\": \""+e.getMessage()+"\"}", HttpStatus.INTERNAL_SERVER_ERROR);

        }

    }


/*
    @RequestMapping(path = "/debtItem",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<String> postDebtItem(@RequestBody DebtItem debtItem) {

        try {
            debtItem.setId(0);
            debtItem = debtItemRepo.save(debtItem);
            return new ResponseEntity<String>("{\"id\": \"" + debtItem.getId() + "\"}", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<String>("{\"fault\": \"" + e.getMessage() + "\"}", HttpStatus.INTERNAL_SERVER_ERROR);

        }


    }


    @GetMapping("/debtitems")
    public Page<DebtItem> findAllDebtItems(Pageable pageable) {
        return debtItemRepo.findAll(pageable);
    }
    */

}



