package entity;

import logic.INew;

public class New implements INew {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    int[] RateList = new int[3] ;

    public float Calculate(int a[]){
        int s=0;
        for(int i =0; i<a.length; i++){
            s +=a[i];
        }
        AverageRate = (float) s/(a.length);
        return AverageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
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


    @Override
    public void Display() {
        System.out.println("Id: \n" + getID() + "PublishDate \n:"+ getPublishDate() + "Author: \n"
        + getAuthor() + "Content: " + getContent());
    }

}
