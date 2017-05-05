package cn.yjxxclub.ssm.entity;

/**
 * Author: 遇见小星
 * Email: tengxing7452@163.com
 * Date: 17-5-4
 * Time: 下午9:40
 * Describe: 书 实体类
 */
public class Book implements java.io.Serializable{
    private Integer id;//id
    private String bookname;//书名
    private String author;//作者
    private String publish;//出版社
    private double price;//价格
    private String time; //出版时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
