import java.sql.SQLOutput;
import java.util.Optional;

public class CustomerMain {

    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        Customer customer = customerDao.retrieveCustomerFromDatabase("xyz");
        if(customer != null){
            System.out.println("customer name: " + customer.getName());
        }else{
            System.out.println("customer not found");
        }


        //we are going to use optional
        Optional<Customer> optionalCustomer = customerDao.retrieveCustomerFromDataBaseOptional("sang");
        if (optionalCustomer.isPresent()){
            System.out.println("customer name: "+ optionalCustomer.get().getName());
        } else{
            System.out.println("customer not found");
        }
        //key point of optional, by returning optional object, forcing the caller of your object to do checking for null pointer exception (the if else)
    }
}