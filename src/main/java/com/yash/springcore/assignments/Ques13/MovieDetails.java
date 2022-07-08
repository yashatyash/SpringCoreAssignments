package com.yash.springcore.assignments.Ques13;

public class MovieDetails {

    String movieName;
    String showTime;
    int ticketPrice;
    String businessInCore;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getBusinessInCore() {
        return businessInCore;
    }

    public void setBusinessInCore(String businessInCore) {
        this.businessInCore = businessInCore;
    }

    public void show() {
        System.out.println("movie name = "+ movieName);
        System.out.println("show time = "+showTime);
        System.out.println("Price of ticket = "+ticketPrice);
        System.out.println("Business score is = "+ businessInCore);
    }
}
