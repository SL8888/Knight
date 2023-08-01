package WorksBD;

import Ammunation.Ammunation;
import Ammunation.Armor.Helm;
import Ammunation.Armor.Plate;
import Ammunation.Jewelry.Ring;
import Ammunation.Weapon.Axe;
import Ammunation.Weapon.Sword;
import Ammunation.Jewelry.Amulet;

import java.util.ArrayList;

public class DataBaseHelper {
    ArrayList<Ammunation> Ammo = new ArrayList<>();

    public DataBaseHelper() {
        setData();
    }

    public void setData() {

        Ammo.add(new Helm(10, 15, 100, "Helm"));
        Ammo.add(new Helm(15, 15, 85, "Helm"));
        Ammo.add(new Helm(17, 25, 95, "Helm"));
        Ammo.add(new Helm(15, 25, 89, "Helm"));

        Ammo.add(new Plate(10, 15, 99, "Plate"));
        Ammo.add(new Plate(148, 150, 99, "Plate"));
        Ammo.add(new Plate(14, 43, 9, "Plate"));
        Ammo.add(new Plate(10, 17, 89, "Plate"));

        Ammo.add(new Ring(13, 27, 89, "Ring"));
        Ammo.add(new Ring(10, 17, 81, "Ring"));
        Ammo.add(new Ring(104, 127, 69, "Ring"));
        Ammo.add(new Ring(114, 171, 100, "Ring"));

        Ammo.add(new Axe(114, 171, 100, "Axe"));
        Ammo.add(new Axe(144, 271, 90, "Axe"));
        Ammo.add(new Axe(166, 371, 89, "Axe"));
        Ammo.add(new Axe(189, 401, 100, "Axe"));

        Ammo.add(new Sword(189, 441, 70, "Sword"));
        Ammo.add(new Sword(209, 501, 99, "Sword"));
        Ammo.add(new Sword(306, 561, 100, "Sword"));
        Ammo.add(new Sword(169, 476, 100, "Sword"));

        Ammo.add(new Amulet(130, 270, 50, "Amulet"));
        Ammo.add(new Amulet(99, 17, 77, "Amulet"));
        Ammo.add(new Amulet(144, 127, 49, "Amulet"));
        Ammo.add(new Amulet(194, 371, 100, "Amulet"));
    }

    public ArrayList<Ammunation> getAmmo() {
        return Ammo;
    }

    public ArrayList<Ammunation> getAmmoByType(String typeOfClass) {
        ArrayList<Ammunation> tempAmmo = new ArrayList<>();
        for (Ammunation aD : Ammo) {
            if (aD.getClass().getName().equals(typeOfClass)) {
                tempAmmo.add(aD);
            }
        }
        return tempAmmo;
    }
}
