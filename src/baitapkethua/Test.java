package baitapkethua;

public class Test {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Vifast", "Việt Nam");
        HangSanXuat h2 = new HangSanXuat("Honda", "Nhật bản");
        HangSanXuat h3 = new HangSanXuat("Tetla", "USA");

        PhuongTienDiChuyen p1 = new XeOto(h1, "Trường hải");
        PhuongTienDiChuyen p3 = new XeDap(h3);
        MayBay p2 = new MayBay(h2, "Xăng");

        System.out.println("Lấy hãng sản xuất");
        System.out.println("p1" + p1.layTenHangSanXuat());

        System.out.println("Bắt đầu: ");
        p2.batDau();

        System.out.println("Lấy vận tốc");
        System.out.println("p1" + p1.layVanToc());
        System.out.println("p2" + p2.layVanToc());
        System.out.println("p3" + p3.layVanToc());
        System.out.println("Cất cánh");
        p2.catCanh();
        p2.haCanh();
    }
}
