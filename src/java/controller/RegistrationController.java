package controller;

import validator.RegistrationValidation;
import domain.Registration;
import java.util.Locale;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import utility.Message;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private RegistrationValidation registrationValidation;
    
    //@Autowired
    //private MessageSource messageSource;

    // Display the form on the get request
    @RequestMapping(method = RequestMethod.GET)
    public String showRegistration(Model model) {
        Registration registration = new Registration();
        model.addAttribute("registration", registration);
        return "registrationForm";
    }

    // Process the form.
    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@Valid Registration registration,
            BindingResult result, Model model, Locale locale) {

        registrationValidation.validate(registration, result);

        if (result.hasErrors()) {

    
           /* 
            model.addAttribute("message",
                    new Message("error",
                            messageSource.getMessage("contact_save_fail",
                                    new Object[]{}, locale)));
          */
            return "registrationForm";
        }

        registration.setConfirmPassword(null);
        registration.setPassword(null);

        return "registrationSuccess";
    }
}
