package ua.laposhko.part3;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AdvancedBean
@Component
public class ExtraBean implements IBean {

    private String name;

}
