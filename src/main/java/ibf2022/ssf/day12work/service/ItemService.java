package ibf2022.ssf.day12work.service;

import java.util.List;
import ibf2022.ssf.day12work.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibf2022.ssf.day12work.repository.ItemRepo;

@Service
public class ItemService {

    @Autowired
    ItemRepo itmRepo;

    public List<Item> retrieveItemList(){

           return itmRepo.getCartItems();
        
    }
    
}
