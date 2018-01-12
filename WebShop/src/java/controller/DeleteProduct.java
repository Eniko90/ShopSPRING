package controller;

import mod.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeleteProduct {
    
              @RequestMapping(value = "/delete_product", method = RequestMethod.GET)
       public String delProduct( ModelMap model) {
            model.addAttribute("products2",new Products() );
              return "delete_product";
}
       
           @RequestMapping(value="/delete_product",method=RequestMethod.POST)     
       public String delete1 (@ModelAttribute("products2") Products products2,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "delete_product";
               }
     
                        
        products2.delete();
        delProduct(model);
        return "delete_product";              
}
}
