public class Product {
    int id;
    String name;
    String desc;
    int price;
    int stock;
    int lv1;
    int lv2;
    int lv3;
    String filename;
    int isDelete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getLv1() {
        return lv1;
    }

    public void setLv1(int lv1) {
        this.lv1 = lv1;
    }

    public int getLv2() {
        return lv2;
    }

    public void setLv2(int lv2) {
        this.lv2 = lv2;
    }

    public int getLv3() {
        return lv3;
    }

    public void setLv3(int lv3) {
        this.lv3 = lv3;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", lv1=" + lv1 +
                ", lv2=" + lv2 +
                ", lv3=" + lv3 +
                ", filename='" + filename + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
