package ibf2022.ssf.day12work.controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ibf2022.ssf.day12work.service.ItemService;
import java.util.ArrayList;
import java.util.List;
import ibf2022.ssf.day12work.model.Item;
@Controller
@RequestMapping(path={"/shoppingCart"})
public class ItemController {
    @Autowired
    ItemService itmSvc;
    @GetMapping(produces = "text/html")
    public String displayCart(Model model){
        List<Item> items = itmSvc.retrieveItemList();
        model.addAttribute("cartItems",items);
        return "cartList";

    }



    
}
