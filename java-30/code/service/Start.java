package service;

import java.util.LinkedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Start
{
    public static void main(String[] data)
    {
        var context = SpringApplication.run(Setup.class);
        LinkedList w = context.getBean(LinkedList.class);
        System.out.println(w);
    }
}

//Application Context จะเก็บข้อมูลของ Bean ทั้งหมดเอาไว้ใน table
// Code จะเห็น Application Context ได้ใน main เท่านั้น
// Bean หรือ Spring Bean ถูกสร้าง(เป็น instance)จาก class ไหนก็ได้
//หลักการของSpringApplicationจะเรียกMethod ใน Configuration Class ทีละ method เลย แล้วเก็บ Address Type, Name and Class ของ ฺBean ไว้

@SpringBootApplication
class Setup
{
    @Bean LinkedList create ()
    {
        LinkedList a = new LinkedList();
        a.add("Latte");
        a.add("Mocha");
        a.add("Cappucino");
        return a;
    }
    @Bean DriverManagerDataSource connect()
    {
        return new DriverManagerDataSource(source);
       
    }
    String source = "jdbc:mysql://127.0.0.1" +"/sample_august_2023" +"?user=frank&password=lampard";
    /*@Bean BranchStorage create2()
    {
        return new BranchStorage();
    } */
}

@RestController
class Sample
{
    @RequestMapping("api/get-products")
    LinkedList m1()
    {
        return products;
    }
    @RequestMapping("/api/get-branch")
    Iterable m2()
    {
        return bs.findAll();
    }
    @Autowired LinkedList products;
    @Autowired BranchStorage bs;
}
//Spring มี Database เกี่ยวกับ Library หลายตัว แต่ละตัวมีชื่อคล้ายกัน
//Sping Boot Data JDBC (ต่างจาก Spring Data JDBC)
//เริ่มต้นมาต้องมี Entity Class ควรจะมีชื่อ Field ตรงกับ Column ใน table
/*@Table("Branch")
class Branch
{
    public int number;       //ถ้่าไม่ public ค่าจะไม่ขึ้น
    public double area;       //ถ้่าไม่ public ค่าจะไม่ขึ้น
    public String name;     //ถ้่าไม่ public ค่าจะไม่ขึ้น    
    public String getName()
    {
        return name;
    }
    public double getArea()
    {
        return area;
    }
}*/

// let's review about Diamond Symbol = Type Parameter >>>>> LinkedList<String>
// or Map<String, Branch> m = new HashMap<>();

//@Repository //ถ้าจะอ่านเขียนฐานข้อมุล ต้องใช้ @Repository เพราะมันมีหน้าที่ อ่านเขียนข้อมูล
@Service      // แต่ในกรณีนี้สามารถใ่ช้แบบนี้แทนได้  
interface BranchStorage extends CrudRepository<Branch, Integer>
{
    
}

//@RestController ใช้ทำ Web Services
//@Controller ใช้่ทำ MVC Web Application Framework

@Controller 
class Home
{
    @RequestMapping("/")
    String m1()
    {
     return "home"; //`คำว่่า home จะไปรวมกับ .html กลายเป็นชื่อ view   
    }       // Model เป็นคำเก่ายุค 70, model is "data"
            // in SpringBoot, we commonly use " Parameter Injection Method"
            // Column แรกใน Java เรียกว่า Attribute ภาษาอื่นเรียกว่า Key
            // Column หลังเรียกว่า Value
            // Attribute    Value
            // brand        iCoffee
            // location     Bangkok
            // products     {"Latte", "Mocha", "Cappucino"}
    
    @RequestMapping({"display", "/summary"})
    String m2(org.springframework.ui.Model m)
        {
         String[] a =  {"Latte", "Mocha", "Cappucino"};
         m.addAttribute("products", a);
         m.addAttribute("brand", "iCoffee");
         m.addAttribute("location", "Bangkok");
         m.addAttribute("branches", b.findAll());
         return "report"; // refer to report.html
        }
    
    @Autowired BranchStorage b; // Autowired will search for b to become BranchStorage
    
    
    }
