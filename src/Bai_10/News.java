package Bai_10;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INew{
    private int Id;
    private String Title;
    private String PublishDate;
    private String Authur;
    private String Content;
    private float AverageRate;

    @Override
    public void Display() {
        System.out.println("Title: "+ getTitle());
        System.out.println("PublishDate: "+ getPublishDate());
        System.out.println("Authur: " + getAuthur());
        System.out.println("Content: " + getContent());
    }

    Scanner scanner =new Scanner(System.in);
    int[] RateList = new int[3];

    public float Calculate(int[] arr){
        int s = 0;
        for(int a: arr){
            s+=a;
        }
        AverageRate = (float)s/3;
        return AverageRate;
    }


    public News() {

    }

    public News(String title, String publishDate, String authur, String content) {
        this.Title = title;
        this.PublishDate = publishDate;
        this.Authur = authur;
        this.Content = content;
    }
    public void input(){
        System.out.println("nhap Title: ");
        Title = scanner.nextLine();
        System.out.println("Nhap PublishDate: ");
        PublishDate = scanner.nextLine();
        System.out.println("Nhap Authur: ");
        Authur = scanner.nextLine();
        System.out.println("Nhap Content: ");
        Content = scanner.nextLine();
    }
    public void inputRate(){
        for(int i=0; i<3; i++){
            System.out.printf(" nhap gia tri thu %d", i+1);
            int a= scanner.nextInt();
            RateList[i] = a;
        }
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publish) {
        PublishDate = publish;
    }

    public String getAuthur() {
        return Authur;
    }

    public void setAuthur(String authur) {
        Authur = authur;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

}
