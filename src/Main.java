public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHeight(300);
        boss.setDamage(50);
        boss.weapon.setWeaponName(WeaponName.AK);
        boss.weapon.setWeaponType(WeaponType.FIRE);
        System.out.println(boss.info());
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHeight(300);
        skeleton1.setDamage(50);
        skeleton1.weapon.setWeaponName(WeaponName.AWM);
        skeleton1.weapon.setWeaponType(WeaponType.LAZER);
        skeleton1.setArrow(20);
        System.out.println("----------------------");
        System.out.println(skeleton1.info());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHeight(300);
        skeleton2.setDamage(25);
        skeleton2.weapon.setWeaponName(WeaponName.MACHINE_GUN);
        skeleton2.weapon.setWeaponType(WeaponType.WOOD);
        skeleton2.setArrow(20);
        System.out.println("----------------------");
        System.out.println(skeleton2.info());
    }
}