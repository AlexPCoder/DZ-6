

public class Main {
    public static void main(String[] args) {

        String[] citiesArray = {"London", "Lviv", "New York"};
        String searchCity = "London";

        boolean resultArray = containsCity(citiesArray, searchCity);
        System.out.println("Результат для масиву: " + resultArray);


        List<String> citiesList = new ArrayList<>(List.of("London", "Lviv", "Lviv", "New York", "London"));
        removeDuplicatesAndPrint(citiesList);
    }


    public static boolean containsCity(String[] cities, String searchCity) {
        for (String city : cities) {
            if (city.equals(searchCity)) {
                return true;
            }
        }
        return false;
    }


    public static void removeDuplicatesAndPrint(List<String> cities) {

        Set<String> uniqueCities = new HashSet<>(cities);


        for (String city : uniqueCities) {
            System.out.println(city);
        }


        Iterator<String> iterator = uniqueCities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        for (String city : uniqueCities) {
            char[] charArray = city.toCharArray();
            System.out.print("Місто: " + city + " -> Символи: ");
            for (char c : charArray) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    }