package ua.laposhko.part2;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class XMLCompactDisk implements CompactDisk {

    @Getter
    @Setter
    private String name;

    public XMLCompactDisk(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        log.info("Playing xml compact disk");
    }
}
