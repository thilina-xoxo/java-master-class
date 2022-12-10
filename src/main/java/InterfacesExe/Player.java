package InterfacesExe;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private int hitPoints;
    private int Stregth;
    private String weapon;

    public Player(String name, int hitPoints, int stregth) {
        this.name = name;
        this.hitPoints = hitPoints;
        Stregth = stregth;
        this.weapon = "AK-47";
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStregth() {
        return Stregth;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStregth(int stregth) {
        Stregth = stregth;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", Stregth=" + Stregth +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    public List<String> save() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.Stregth);
        values.add(3,this.weapon);
        return values;
    }

    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size()>0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.Stregth = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
