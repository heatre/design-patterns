package iterator;

/**
 * Created by Swin on 2016/5/30.
 */
public class DinerIterator implements MyIterator {
    private MenuItem[] items;
    private int position = 0;

    public DinerIterator(MenuItem[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }
}
