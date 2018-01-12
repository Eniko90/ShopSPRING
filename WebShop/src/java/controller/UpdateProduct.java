package controller;

import javax.validation.Valid;
import mod.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UpdateProduct {
    
    @RequestMapping(value = "/update_product", method = RequestMethod.GET)
       public String updProduct( ModelMap model) {
            model.addAttribute("products1",new Products() );
              return "update_product";
}
       
           @RequestMapping(value="/update_product",method=RequestMethod.POST)     
       public String change(@ModelAttribute("products1") @Valid Products products1,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "update_product";
               }
     
                        
        products1.update();
        updProduct(model);
                return "update_product";              
}    
}

    
    

