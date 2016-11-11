package ua.laposhko.part3;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@Primary
public class PrimaryBean implements IBean {

    private String name;

}
