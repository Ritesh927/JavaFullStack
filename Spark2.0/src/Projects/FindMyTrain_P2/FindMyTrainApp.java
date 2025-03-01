package Projects.FindMyTrain_P2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {

        TrainSystem trainSystem = new TrainSystem();

        //adding stations
        Station station1 = new Station("S00333", "Agra");
        Station station2 = new Station("S00444", "Lucknow");

        //adding new trains
        Train train1 = new Train("12408", "Duranto Exp", "Express");
        Train train2 = new Train("12608", "Intercity", "Passenger");

        //adding platforms
        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);

        p1.setTrain(train1);
        p2.setTrain(train2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);

        station1.setPlatformList(platformList);
//        station2.setPlatformList(platformList);

        Schedule s1 = new Schedule(train1, station1, "9AM", "9:05AM", p1);
        Schedule s2 = new Schedule(train2, station2, "10AM", "10:02AM", p2);

        trainSystem.addStations(station1);
        trainSystem.addStations(station2);
        trainSystem.addTrains(train1);
        trainSystem.addTrains(train2);
        trainSystem.addSchedule(s1);
        trainSystem.addSchedule(s2);

        //let's find trains between stations
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source : ");
        String source = sc.nextLine();
        System.out.println("Enter the destination : ");
        String des = sc.nextLine();

        List<Schedule> myTrains = trainSystem.findMyTrains(source, des);
        System.out.println("Your Trains between " + source + " and " + des);

        for (Schedule schedule : myTrains) {
            System.out.println(schedule);
        }
    }
}