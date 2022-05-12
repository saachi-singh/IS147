package project;

interface Food {
    void food();
    void water();
}

class FeedPet implements Food{

    @Override
    public void food() {
        System.out.println("Pet has been fed.");
    }

    @Override
    public void water() {
        System.out.println("Pet drank water.");
    }
}
