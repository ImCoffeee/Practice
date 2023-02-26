package HandsOnAct;
class Exam {
    String message;
    public Exam(){
        message = "Good luck";
    }

    public Exam(String period, String level){

    }
    double getPrice;

    public double getGetPrice() {

        return getPrice;
    }

    public void setGetPrice(double getPrice){
        this.getPrice = getPrice;
    }

    boolean isFinished;

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean isFinished){
        this.isFinished = isFinished;
    }

    protected void message() {
    }
}
class Midterm extends Exam {
    public Midterm(){
        System.out.print(message);
    }
    public Midterm(String period, String level) {

        super(period, level);
    }


    @Override
    public double getGetPrice() {
        return super.getGetPrice();
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
class Essay extends Midterm {

    public Essay() {
        super.message();
        System.out.print(" Exam has started.");
    }
    public Essay(String period, String level) {
        super(period, level);
    }


    @Override
    public double getGetPrice() {
        return super.getGetPrice();
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
public class Quiz {

    public static void main(String[] args) {
        Essay essay = new Essay();
        essay.message();
    }

}

