package ua.laposhko.part2;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CDPlayer {

    @Getter
    @Setter
    private CompactDisk compactDisk;

    @Autowired
    CDPlayer(CompactDisk compactDisk){
        this.compactDisk = compactDisk;
    }

    public void play() {
        log.info("Playing...{0}", compactDisk);
    }
}
