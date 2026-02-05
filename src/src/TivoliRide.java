
public class TivoliRide {

    private int height;

    public TivoliRide(int height) {
        this.height = height;

    }

    public String getTivoliRide() {

        if ((height > 185)) {
            return "Enjoy the Ride.";

        } else if ((height < 185)) {
            return "Bare ærgeligt brormand";

        } else if ((height == 185)){
            return "Der var du heldig, det var lige før du ikke kom med. ";
        }

        return "Hjælp mig jeg har brug for en Lambo";
    }
}