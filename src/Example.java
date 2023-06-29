import java.util.ArrayList;

public class Example {

    ArrayList<Double> numberArray;
    public Example(){
        numberArray = new ArrayList<>();
    }

    public void addNumber(Double number){
        this.numberArray.add(number);
    }

    public void removeNumberById(int idNumber){
        this.numberArray.remove(idNumber);
    }

    public void removeNumberByContent(Double removeNumber) {
        this.numberArray.remove(removeNumber);
    }

    public void listALl(){
        this.numberArray.forEach(System.out::println);
    }

}
