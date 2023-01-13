public class WhoLikesIt {
    public static void main(String[] args) {
//                []                                -->  "no one likes this"
//                ["Peter"]                         -->  "Peter likes this"
//                ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//                ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//                ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
        String[] names = {};
        String[] names1 = {"Peter"};
        String[] names2 = {"Jacob", "Alex"};
        String[] names3 = {"Max", "John", "Mark"};
        String[] names4 = {"Alex", "Jacob", "Mark", "Max"};
        System.out.println(likes(names));
        System.out.println(likes(names1));
        System.out.println(likes(names2));
        System.out.println(likes(names3));
        System.out.println(likes(names4));

    }
    public static String likes(String [] names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }
}
