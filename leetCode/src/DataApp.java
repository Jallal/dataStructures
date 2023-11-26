import java.lang.*;
import java.util.*;
import DataArray;

public class DataApp {


public static void main(String[] args) {

int maxSize = 1000;

DataArray dataArray = new DataArray(maxSize);

dataArray.insertPerson("Evans", "Patty", 24);
dataArray.insertPerson("Smith", "Lorraine", 37);
dataArray.insertPerson("Yee", "Tom", 43);
dataArray.insertPerson("Adams", "Henry", 63);
dataArray.insertPerson("Hashimoto", "Sato", 21);
dataArray.insertPerson("Stimson", "Henry", 29);
dataArray.insertPerson("Velasquez", "Jose", 72);
dataArray.insertPerson("Lamarque", "Henry", 54);
dataArray.insertPerson("Vang", "Minh", 22);
dataArray.insertPerson("Creswell", "Lucinda", 18);
dataArray.displyArr();


}
}
