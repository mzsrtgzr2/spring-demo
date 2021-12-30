package org.vaadin.example.ui;

import java.util.LinkedList;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.example.backend.entity.Company;
import org.vaadin.example.backend.entity.Contact;
/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */

 @Route("")
public class MainView extends VerticalLayout {
    
    private final Button button = new Button("click me");
    private final DatePicker datePicker = new DatePicker("Pick a date");

    public MainView() {
        Company company = new Company("ba", new LinkedList<Contact>());
        company.setName("buhes");
        

        HorizontalLayout layout = new HorizontalLayout(button, datePicker);
        layout.setDefaultVerticalComponentAlignment(Alignment.END);
        add(layout);

        button.addClickListener(click->add(new Paragraph("Clicked" + datePicker.getValue())));
        
    }
    
}
