package ua.laposhko.part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {

    private CompactDisk compactDisk;

    @Autowired
    CDPlayer(CompactDisk compactDisk){
        this.compactDisk = compactDisk;
    }

    public CompactDisk getCompactDisk() {
        return compactDisk;
    }

    public void setCompactDisk(CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }
}
