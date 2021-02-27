package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> capsulesColorList = new ArrayList<>();

    public void addLast(String paraColor) {
        capsulesColorList.add(paraColor);
    }

    public void addFirst(String paraColor) {
        capsulesColorList.add(0, paraColor);
    }

    public void removeFirst() {
        capsulesColorList.remove(0);
    }

    public void removeLast() {
        capsulesColorList.remove(capsulesColorList.size() - 1);
    }

    public List<String> getColors() {
        return capsulesColorList;
    }

    public static void main(String[] args) {
        Capsules caps = new Capsules();
        caps.addFirst("kék");
        caps.addLast("piros");
        caps.addFirst("fehér");
        System.out.println(caps.getColors());
        caps.removeFirst();
        System.out.println(caps.getColors());
    }


}
