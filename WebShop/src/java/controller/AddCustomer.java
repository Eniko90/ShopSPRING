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
public class AddCustomer {
    
      @RequestMapping(value = "/add_customer", method = RequestMethod.GET)
       public String addCustomer( ModelMap model) {
            model.addAttribute("customers",new Customers() );
              return "add_customer";
}
       
           @RequestMapping(value="/add_customer",method=RequestMethod.POST)     
       public String add(@ModelAttribute("customers") @Valid Customers customers,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "add_customer";
               }
     
                        
        customers.add();
        addCustomer(model);
        return "add_customer";              
}
}
