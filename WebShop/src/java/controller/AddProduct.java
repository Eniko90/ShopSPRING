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
public class AddProduct {
    
    
              @RequestMapping(value = "/add_product", method = RequestMethod.GET)
       public String addProduct( ModelMap model) {
            model.addAttribute("products",new Products() );
              return "add_product";
}
       
           @RequestMapping(value="/add_product",method=RequestMethod.POST)     
       public String add (@ModelAttribute("products") @Valid Products products,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "add_product";
               }
     
                        
        products.add();
        addProduct(model);
        return "add_product";              
}
    
}
