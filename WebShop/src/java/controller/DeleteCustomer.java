package controller;

import mod.Customers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeleteCustomer {
    
    
                 @RequestMapping(value = "/delete_customer", method = RequestMethod.GET)
       public String delCustomer( ModelMap model) {
            model.addAttribute("customers2",new Customers() );
              return "delete_customer";
}
       
           @RequestMapping(value="/delete_customer",method=RequestMethod.POST)     
       public String delete1 (@ModelAttribute("customers2") Customers customers2,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "delete_customer";
               }
     
                        
        customers2.delete();
        delCustomer(model);
        return "delete_customer";              
}
    
    
}
