package controller;

import javax.validation.Valid;
import mod.Sale;
import mod.Products;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Purchase {
    
    
        
            @RequestMapping(value = "/purchase", method = RequestMethod.GET)
       public String addSale ( ModelMap model) throws ClassNotFoundException {
            model.addAttribute("sale",new Sale());
            model.addAttribute("listt",Products.listPro());
            
              return "purchase";
}
       
           @RequestMapping(value="/purchase",method=RequestMethod.POST)     
       public String add (@ModelAttribute("sale") @Valid Sale sale,BindingResult r,ModelMap model) throws ClassNotFoundException {
               if (r.hasErrors()) {
                   return "purchase";
               }
     
                        
        sale.purchase();
        sale.upd();
        addSale(model);
        return "purchase";              
}
    
}
