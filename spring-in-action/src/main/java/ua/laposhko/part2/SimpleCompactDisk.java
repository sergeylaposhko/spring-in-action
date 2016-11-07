package ua.laposhko.part2;

import org.springframework.stereotype.Component;

@Component
public class SimpleCompactDisk implements CompactDisk {
    @Override
    public void play() {
        System.out.println("Playing");
    }
}
