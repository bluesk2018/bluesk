package net.bluesk.files;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(HttpServletRequest request,@RequestParam(value = "file",required=false) MultipartFile[] files){
        System.out.println(files);
        return "0";
    }
}
