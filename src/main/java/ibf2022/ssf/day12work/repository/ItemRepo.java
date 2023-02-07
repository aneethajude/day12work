package ibf2022.ssf.day12work.repository;

import java.util.ArrayList;
import java.util.List;
import ibf2022.ssf.day12work.model.Item;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepo {
    private List<Item> itemList = new ArrayList<>();
    public List<Item> getCartItems(){

        Item item = new Item();
        item.setItemName("Louis Vuitton");
        item.setQuantity(6);
        itemList.add(item);

         item = new Item();
        item.setItemName("Prada");
        item.setQuantity(10);
        itemList.add(item);

         item = new Item();
        item.setItemName("Hermes");
        item.setQuantity(15);
        itemList.add(item);

         item = new Item();
        item.setItemName("Bottega");
        item.setQuantity(5);
        itemList.add(item);

        return itemList;

    }
    
}
