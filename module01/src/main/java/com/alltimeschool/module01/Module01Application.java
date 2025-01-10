package com.alltimeschool.module01;

import com.alltimeschool.module01.coffeshop.*;
import com.alltimeschool.module01.coffeshopwithlog.BaristaLog;
import com.alltimeschool.module01.coffeshopwithlog.CoffeeMakerLog;
import com.alltimeschool.module01.coffeshopwithlog.InventoryManagerLog;
import com.alltimeschool.module01.corecomponents.MyComponent;
import com.alltimeschool.module01.corecomponents.MyRepository;
import com.alltimeschool.module01.corecomponents.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module01Application {

    public static void main(String[] args) {

     //   SpringApplication.run(Module01Application.class, args);
        var context = SpringApplication.run(Module01Application.class, args);

        // Fetch beans from context
//        MyComponent myComponent = context.getBean(MyComponent.class);
//        MyService myService = context.getBean(MyService.class);
//        MyRepository myRepository = context.getBean(MyRepository.class);
//
//        // Output bean methods
//        System.out.println(myComponent.greet());
//        System.out.println(myService.process());
//        System.out.println(myRepository.fetchData());

        System.out.println("==========================Coffee Shop=================================");

//        Barista barista=context.getBean(Barista.class);
//        CoffeeMaker coffeeMaker=context.getBean(CoffeeMaker.class);
//        InventoryManager inventoryManager=context.getBean(InventoryManager.class);
//        OnlineOrderSystem onlineOrderSystem=context.getBean(OnlineOrderSystem.class);
//           System.out.println(barista.prepareCoffee());
//        System.out.println(coffeeMaker.brewCoffee());
//        System.out.println(inventoryManager.checkStock());
//        System.out.println(onlineOrderSystem.placeOrder());


        System.out.println("============================Coffee Shop with LOG==================");
        // Fetch beans from context
        BaristaLog barista = context.getBean(BaristaLog.class);
        CoffeeMakerLog coffeeMaker = context.getBean(CoffeeMakerLog.class);
        InventoryManagerLog inventoryManager = context.getBean(InventoryManagerLog.class);

        // Use beans to trigger lifecycle logs
        barista.prepareCoffee();
        coffeeMaker.brewCoffee();
        inventoryManager.checkStock();


        System.out.println("========================================Available Beans=======================================================");
        String[] beanNames = context.getBeanDefinitionNames();

        // Print out each bean name
        System.out.println("Available Beans in the ApplicationContext:");
        int i=0;
        for (String beanName : beanNames) {
            System.out.println(++i+" "+beanName);
            System.out.println("===========================================================================");
        }

        System.out.println("====================Get all beans of a specific type (e.g., Barista)=============================");
        String[] baristaBeans = context.getBeansOfType(Barista.class).keySet().toArray(new String[0]);

        System.out.println("Barista Beans in the ApplicationContext:");
        for (String beanName : baristaBeans) {
            System.out.println(beanName);
        }

        System.out.println("======================Custom Beans in the ApplicationContext:===============================");

        // Get all beans of a specific type (excluding internal Spring beans)
        String[] customBeanNames = context.getBeanDefinitionNames();

        // Filter custom beans based on class name pattern (or your own custom logic)
        for (String beanName : customBeanNames) {
            Object bean = context.getBean(beanName);
            if (bean.getClass().getPackageName().startsWith("com.alltimeschool.module01")) {  // replace with your package name
                System.out.println(beanName);
            }
        }
    }

}
