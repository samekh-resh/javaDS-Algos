import java.util.Optional;

public class CustomerDao {
    public Customer retrieveCustomerFromDatabase(String name){
        if (name.equals("sang")){
            return new Customer("sang");
        }else{
            return null;
        }

    }

    public Optional<Customer> retrieveCustomerFromDataBaseOptional(String name){
        if(name.equals("snag")){
            return Optional.of((new Customer("sang")));
        }else{
            return Optional.empty();
        }


    }
}