public class Main {

    public static void main(String[] args) {
        var nesbo = new Author("Jo Nesbo");
        Book snowman = new Book(0, "Snowman", 2019, nesbo);

        System.out.println(snowman);

        snowman.setYearPublisher(2022);
        System.out.println("Перевыпуск публикаци в " + snowman.getYearPublisher() + " году");

        var remark = new Author("Remark");
        Book blackObelisk = new Book(1, "Black Obelisk", 1956, remark);

        System.out.println(blackObelisk);


        System.out.println(nesbo.hashCode() == remark.hashCode());
        System.out.println(nesbo.equals(remark));
    }

}