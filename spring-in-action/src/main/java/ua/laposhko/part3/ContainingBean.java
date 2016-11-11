package ua.laposhko.part3;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ContainingBean {

    @Autowired
    private IBean primaryBean;

    @Autowired
    @Qualifier("secondaryBean")
    private IBean secondaryBean;

    @Autowired
    @Qualifier("secondary")
    private IBean secondaryBeanCustomQualifier;

    @Autowired
    @AdvancedBean
    private IBean advancedBean;

}
