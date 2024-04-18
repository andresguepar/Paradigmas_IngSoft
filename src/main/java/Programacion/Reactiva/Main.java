package Programacion.Reactiva;

public class Main {

        public static void main(String[] args) {
            Tracking tracking = new Tracking();

            tracking.send("102").subscribe(pck -> {
                System.out.println("Package send: " + pck);
            });

            tracking.trackPackage("102").subscribe(pck -> {
                System.out.println("Actualización de estado: " + pck);
            });
        }

}
