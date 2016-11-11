package ua.laposhko.part3;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
@Qualifier("secondary")
public class SecondaryBean implements IBean {

    private String name;

}
