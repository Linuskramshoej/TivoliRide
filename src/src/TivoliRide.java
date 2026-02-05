
public class TivoliRide {

    private int height;
    private int rideHeight;

    public TivoliRide(int height, int rideHeight) {
        this.height = height;
        this.rideHeight = rideHeight;
    }

    public String getTivoliRide() {

        if ((height > rideHeight)) {
            return "Enjoy the Ride.";

        } else if ((height < rideHeight)) {
            return "Bare ærgeligt brormand";

        } else if ((height == rideHeight)){
            return "Der var du heldig, det var lige før du ikke kom med. ";
        }

        return "Hjælp mig jeg har brug for en Lambo";
    }
}