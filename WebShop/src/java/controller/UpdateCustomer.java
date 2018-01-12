package controller;

import javax.validation.Valid;
import mod.Customers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UpdateCustomer {
    
    
         @RequestMapping(value = "/update_customer", method = RequestMethod.GET)
       public String updCustomer( ModelMap model) {
            model.addAttribute("customers1",new Customers() );
              return "update_customer";
}
       
           @RequestMapping(value="/update_customer",method=RequestMethod.POST)     
       public String change(@ModelAttribute("customers1") @Valid Customers customers1,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "update_customer";
               }
     
                        
        customers1.update();
        updCustomer(model);
                return "update_customer";              
}
    
    
}
