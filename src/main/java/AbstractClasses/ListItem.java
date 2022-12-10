package AbstractClasses;

import java.util.List;

public abstract class ListItem {
    protected ListItem rightLink; // why protected; needs to be able access from concrete sub classes
    protected ListItem leftLink;  // subclasses in the same package can access these
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next(); // these methods can have any access modifier
    abstract ListItem setNext(ListItem listItem);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem listItem);
    abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
