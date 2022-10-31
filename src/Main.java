public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("levTolstoy.getName() = " + levTolstoy.getName());
        System.out.println("levTolstoy.getSurname() = " + levTolstoy.getSurname());
        Book warAndPeace = new Book("War and peace",levTolstoy,1956);
        System.out.println("WarAndPeace.getBookName() = " + warAndPeace.getBookName());
        System.out.println("WarAndPeace.getAuthor() = " + warAndPeace.getAuthor());
        System.out.println("WarAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());
        warAndPeace.setPublishingYear(1987);
        System.out.println("WarAndPeace.getPublishingYear() = " + warAndPeace.getPublishingYear());

        Author alexanderPushkin = new Author("Alexander", "Pushkin");
        Book eugeneOnegin = new Book("Eugene Onegin", alexanderPushkin, 1965);
        System.out.println("eugeneOnegin.getBookName() = " + eugeneOnegin.getBookName());
        System.out.println("eugeneOnegin.getAuthor() = " + eugeneOnegin.getAuthor());
        System.out.println("eugeneOnegin.getPublishingYear() = " + eugeneOnegin.getPublishingYear());

        System.out.println(eugeneOnegin);
        System.out.println("levTolstoy.hashCode() = " + levTolstoy.hashCode());
        System.out.println("warAndPeace.equals(eugeneOnegin) = " + warAndPeace.equals(eugeneOnegin));
        Book eugeneOnegin2 = new Book("Eugene Onegin", alexanderPushkin, 1965);
        System.out.println("eugeneOnegin.equals(eugeneOnegin) = " + eugeneOnegin.equals(eugeneOnegin));


    }
}