public class Solution {
    public static String whoLikesIt(String... names) {
        int length = names.length;
        switch (length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                return names[0] + ", " + names[1] + " and " + (length - 2) + " others like this";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt()); // no one likes this
        System.out.println(whoLikesIt("Peter")); // Peter likes this
        System.out.println(whoLikesIt("Jacob", "Alex")); // Jacob and Alex like this
        System.out.println(whoLikesIt("Max", "John", "Mark")); // Max, John and Mark like this
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max")); // Alex, Jacob and 2 others like this
    }
}


