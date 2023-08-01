package Catalog;

import Ammunation.Ammunation;
import Ammunation.Jewelry.Amulet;
import Ammunation.Jewelry.Ring;
import Ammunation.SortType;
import Ammunation.Armor.Helm;
import Ammunation.Armor.Plate;
import Ammunation.Weapon.Axe;
import Ammunation.Weapon.Sword;
import WorksBD.DataBaseHelper;

import java.util.ArrayList;
import java.util.Collections;

public class Catalog {

    public static void catalog() {
        DataBaseHelper dbHelper = new DataBaseHelper();
        ArrayList<Ammunation> Ammo = dbHelper.getAmmo();
        ArrayList<Ammunation> Helms = dbHelper.getAmmoByType(Helm.class.getName());
        ArrayList<Ammunation> Plates = dbHelper.getAmmoByType(Plate.class.getName());
        ArrayList<Ammunation> Rings = dbHelper.getAmmoByType(Ring.class.getName());
        ArrayList<Ammunation> Amulets = dbHelper.getAmmoByType(Amulet.class.getName());
        ArrayList<Ammunation> Axes = dbHelper.getAmmoByType(Axe.class.getName());
        ArrayList<Ammunation> Swords = dbHelper.getAmmoByType(Sword.class.getName());

        Ammo.sort(new ComparableByParametres() {
        });

        Helms.sort(new ComparableByParametres() {
        });
        Ammunation maxAmmoHelm = Collections.max(Helms, new ComparableByParametres(SortType.DEFENSE));
        Ammunation maxAmmoHelmC = Collections.max(Helms, new ComparableByParametres(SortType.COST));
        Ammunation minAmmoHelmC = Collections.min(Helms, new ComparableByParametres(SortType.COST));
//        System.out.println(" ");
//        System.out.println("Best Helm: " + maxAmmoHelm);
//        System.out.println("THE COST: " + maxAmmoHelm.getCost());

        for (Ammunation aD : Helms) {
            System.out.println(aD);
        }

        Plates.sort(new ComparableByParametres() {
        });
        Ammunation maxAmmoPlates = Collections.max(Plates, new ComparableByParametres(SortType.DEFENSE));
        Ammunation maxAmmoPlatesC = Collections.max(Plates, new ComparableByParametres(SortType.COST));
        Ammunation minAmmoPlatesC = Collections.min(Plates, new ComparableByParametres(SortType.COST));
//        System.out.println(" ");
//        System.out.println("Best Plate: " + maxAmmoPlates);
//        System.out.println("THE COST: " + maxAmmoPlates.getCost());

        for (Ammunation aD : Plates) {
            System.out.println(aD);
        }

        Swords.sort(new ComparableByParametres() {
        });
        Ammunation maxAmmoSwords = Collections.max(Swords, new ComparableByParametres(SortType.DAMAGE));
        Ammunation maxAmmoSwordsC = Collections.max(Swords, new ComparableByParametres(SortType.COST));
        Ammunation minAmmoSwordsC = Collections.min(Swords, new ComparableByParametres(SortType.COST));
//        System.out.println(" ");
//        System.out.println("Best Sword: " + maxAmmoSwords);
//        System.out.println("THE COST: " + maxAmmoSwords.getCost());

        for (Ammunation aD : Swords) {
            System.out.println(aD);
        }

        Axes.sort(new ComparableByParametres() {
        });
        Ammunation maxAmmoAxes = Collections.max(Axes, new ComparableByParametres(SortType.DAMAGE));
        Ammunation maxAmmoAxesC = Collections.max(Axes, new ComparableByParametres(SortType.COST));
        Ammunation minAmmoAxesC = Collections.min(Axes, new ComparableByParametres(SortType.COST));
//        System.out.println(" ");
//        System.out.println("Best Axe: " + maxAmmoAxes);
//        System.out.println("THE COST: " + maxAmmoAxes.getCost());

        for (Ammunation aD : Axes) {
            System.out.println(aD);
        }

        Rings.sort(new ComparableByParametres() {
        });
        Ammunation maxAmmoRings = Collections.max(Rings, new ComparableByParametres(SortType.HEALTH));
        Ammunation maxAmmoRingsC = Collections.max(Rings, new ComparableByParametres(SortType.COST));
        Ammunation minAmmoRingsC = Collections.min(Rings, new ComparableByParametres(SortType.COST));
//        System.out.println(" ");
//        System.out.println("Best Ring: " + maxAmmoRings);
//        System.out.println("THE COST: " + maxAmmoRings.getCost());

        for (Ammunation aD : Rings) {
            System.out.println(aD);
        }

        Amulets.sort(new ComparableByParametres() {
        });
        Ammunation maxAmmoAmulets = Collections.max(Amulets, new ComparableByParametres(SortType.HEALTH));
        Ammunation maxAmmoAmuletsC = Collections.max(Amulets, new ComparableByParametres(SortType.COST));
        Ammunation minAmmoAmuletsC = Collections.min(Amulets, new ComparableByParametres(SortType.COST));
//        System.out.println(" ");
//        System.out.println("Best Amulet: " + maxAmmoAmulets);
//        System.out.println("THE COST: " + maxAmmoAmulets.getCost());

        for (Ammunation aD : Amulets) {
            System.out.println(aD);
        }

        int allCost = maxAmmoAmulets.getCost()
                + maxAmmoRings.getCost()
                + maxAmmoSwords.getCost()
                + maxAmmoAxes.getCost()
                + maxAmmoPlates.getCost()
                + maxAmmoHelm.getCost();

        System.out.println(" ");
        System.out.println("THE BEST EQUIPMENT: ");
        System.out.println("Best Amulet: " + maxAmmoAmulets);
        System.out.println("Best Ring: " + maxAmmoRings);
        System.out.println("Best Sword: " + maxAmmoSwords);
        System.out.println("Best Axe: " + maxAmmoAxes);
        System.out.println("Best Plate: " + maxAmmoPlates);
        System.out.println("Best Helm: " + maxAmmoHelm);
        System.out.println("ALL EQUIPMENT COST:  " + allCost);

        int allCostMax = maxAmmoAmuletsC.getCost()
                + maxAmmoRingsC.getCost()
                + maxAmmoSwordsC.getCost()
                + maxAmmoAxesC.getCost()
                + maxAmmoPlatesC.getCost()
                + maxAmmoHelmC.getCost();
        System.out.println("Expensive equipment cost is : " + allCostMax);

        int allCostMin = minAmmoRingsC.getCost()
                + minAmmoAmuletsC.getCost()
                + minAmmoSwordsC.getCost()
                + minAmmoAxesC.getCost()
                + minAmmoPlatesC.getCost()
                + minAmmoHelmC.getCost();
        System.out.println("Uncostly equipment cost is : " + allCostMin);
    }
}

