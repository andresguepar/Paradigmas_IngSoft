package Programacion.Reactiva;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Tracking {
    private Map<String, Package> pck;

    public Tracking() {
        this.pck = new HashMap<>();
    }

    public Mono<Package> send(String id) {
        Package newpck = new Package(id);
        pck.put(id, newpck);
        return Mono.just(newpck);
    }

    public Flux<Package> trackPackage(String id) {
        return Flux.interval(Duration.ofSeconds(2))
                .map(seq -> {
                    Package pack = pck.get(id);
                    if (pack != null) {
                        updateStatusPackage(pack);
                    }
                    return pack;
                });
    }

    private void updateStatusPackage(Package pck) {
        Random rndm = new Random();
        int randomNum = rndm.nextInt(3);
        Status newStatus = Status.values()[randomNum];
        pck.updateStatus(newStatus, ramdomLocation());
        pck.updateStatus(newStatus,ramdomLocation());
    }

    private String ramdomLocation() {
        String[] locations = {"Origin", "Warehouse", "Distribution center", "Destination","Delivery route","On route"};
        Random random = new Random();
        int randomIndex = random.nextInt(locations.length);
        return locations[randomIndex];
    }

}
