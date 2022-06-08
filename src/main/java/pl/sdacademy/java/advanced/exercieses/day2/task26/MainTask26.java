package pl.sdacademy.java.advanced.exercieses.day2.task26;

import java.util.List;

public class MainTask26 {
    public static void main(String[] args) {

        Manufacturer benz = new Manufacturer("Benz", 1883);
        Manufacturer mercedes = new Manufacturer("Mercedes", 1901);
        Manufacturer volvo = new Manufacturer("Volvo", 1926);
        Manufacturer fiat = new Manufacturer("Fiat", 1899);

        Discription x500Story = new Discription("blabla",1.0,"Witek");
        Discription gls1Story = new Discription("blablagls1",1.0,"Witek");
        Discription gls2Story = new Discription("blablagls2",1.0,"Witek");
        Discription tmpStory = new Discription("blablatmptmptmptmptmptptmptmptmptmptm",1.0,"Witek");


        Car x500 = new Car("5setka","x500", List.of(fiat), "Cobrio", 2010, 140_000, x500Story);
        Car gls_1 = new Car("Glska1","GLS", List.of(mercedes), "Cabrio", 2020, 200_000, gls1Story);
        Car gls_2 = new Car("Glska2","GLS", List.of(mercedes), "Cabrio", 2015, 100_000, gls2Story);
        Car xc90_1 = new Car("Volvik","xc90", List.of(volvo) , "Cabrio", 2018, 180_000, tmpStory);
        Car xc90_2 = new Car("Volviak","xc90",List.of(volvo) ,"Sedan", 2022, 180_000, tmpStory);
        Car xc60 = new Car("Vol","xc60", List.of(volvo)     , "Sedan", 2022, 60_000, tmpStory);

        List<Car> carList = List.of(x500, gls_1, gls_2, xc90_1, xc90_2, xc60);

//        Task26.showAllCar(carList);
//        List<String> showAllModel = Task26.showAllModel(carList);
//        System.out.println(showAllModel);
//
//        List<String> showAllManufacturerName = Task26.showAllManufacturerName(carList);
//        List<Integer> showAllManufacturerFoundingYear = Task26.showAllManufacturerFoundingYear(carList);
//        System.out.println(showAllManufacturerName);
//        System.out.println(showAllManufacturerFoundingYear);
//
//        List<String> showAllModelName = Task26.showAllModelName(carList);
//        System.out.println(showAllModelName);

        List<Integer> showAllCarWithEvenYears = Task26.showAllCarWithEvenYears(carList);
        System.out.println(showAllCarWithEvenYears);

    }


}
