class Main {
    public String name = "Black Rabbit";
    public int id = 12;
    public int age = 2;
    public void nameRabbit() {
        System.out.println("Nama: " +name);
    }
    public void idRabbit() {
        System.out.println("Id " +id);
    }
    public void umurRabbit() {
        System.out.println("Umur: " +age);
    }

    public static void main(String[] args) {
        Main kelinci = new Main();
        kelinci.nameRabbit();
        kelinci.idRabbit();;
        kelinci.umurRabbit();
    }
}