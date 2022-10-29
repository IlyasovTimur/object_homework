public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("levTolstoy.getName() = " + levTolstoy.getName());
        System.out.println("levTolstoy.getSurname() = " + levTolstoy.getSurname());
        Book WarAndPeace = new Book("War and peace",levTolstoy,1956);
        System.out.println("WarAndPeace.getBookName() = " + WarAndPeace.getBookName());
        System.out.println("WarAndPeace.getAuthor() = " + WarAndPeace.getAuthor());
        System.out.println("WarAndPeace.getPublishingYear() = " + WarAndPeace.getPublishingYear());
        WarAndPeace.setPublishingYear(1987);
        System.out.println("WarAndPeace.getPublishingYear() = " + WarAndPeace.getPublishingYear());

        Author alexanderPushkin = new Author("Alexander", "Pushkin");
        Book eugeneOnegin = new Book("Eugene Onegin", alexanderPushkin, 1965);
        System.out.println("eugeneOnegin.getBookName() = " + eugeneOnegin.getBookName());
        System.out.println("eugeneOnegin.getAuthor() = " + eugeneOnegin.getAuthor());
        System.out.println("eugeneOnegin.getPublishingYear() = " + eugeneOnegin.getPublishingYear());


    }
}