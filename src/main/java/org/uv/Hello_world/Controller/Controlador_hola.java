/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.Hello_world.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author yacruz
 */
@Controller
public class Controlador_hola {
    
    @RequestMapping("/hola")
    @ResponseBody
    String home(){
        return "Hola mundo desde Springboot";
    }
    
    
}
