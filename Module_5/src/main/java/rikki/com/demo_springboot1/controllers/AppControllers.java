package rikki.com.demo_springboot1.controllers;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
        import rikki.com.demo_springboot1.model.UserProduct;
        import rikki.com.demo_springboot1.service.ProductService;

        import java.util.List;

@Controller
public class AppControllers {
    @Autowired
    private ProductService service;
    @RequestMapping("/")
    public  String viewHomePage(Model model){
        List<UserProduct> listProducts = service.listAll();
        model.addAttribute("listProducts",listProducts);
        return "index";
    }
}
