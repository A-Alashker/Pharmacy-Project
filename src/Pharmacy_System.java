/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class Pharmacy_System  {
    
        private String drug_name;
        private int id;
        private double price;
        private String category;
        private int available_quantity ;
        public static int num_of_drugs = 0;
        public static int capacity= 7;
        static ArrayList<Pharmacy_System>drug_container=new ArrayList<>();
        static ArrayList<Double>price_of_order=new ArrayList<Double>();
        public Pharmacy_System(String name, int id, double price, String category, int quantity) {
            this.drug_name = name;
            this.id = id;
            this.price = price;
            this.category = category;
            this.available_quantity = quantity;
        }
        public Pharmacy_System(){


        }
        public String getDrug_name() {
            return drug_name;
        }

        public void setDrug_name(String drug_name) {
            this.drug_name = drug_name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getAvailable_quantity() {
            return available_quantity;
        }

        public void setAvailable_quantity(int available_quantity) {
            this.available_quantity = available_quantity;

        }
        public void setcapacity(int capacity) {
            this.capacity = capacity;
        }

        public void add_drug(String drugname , int id , double price , String category , int available_quantity){
//            num_of_drugs=0;
            if(num_of_drugs<capacity) {
                Pharmacy_System drug=new Pharmacy_System(drugname, id, price, category, available_quantity);
                drug_container.add(drug);
                num_of_drugs++ ;
                JOptionPane.showMessageDialog(null, "The drug added successfuly = "+ num_of_drugs, "info", JOptionPane.INFORMATION_MESSAGE);

            }
            else
            {
                  JOptionPane.showMessageDialog(null, "The capacity is full ", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }



    public static void remove_drug(int id) {
        if (num_of_drugs > 0) {
            boolean removed = drug_container.removeIf(drug -> drug.getId() == id);
            if (removed) {
                num_of_drugs--;
                JOptionPane.showMessageDialog(null, "The removing drug process has succeeded", "Remove_drug", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "There is no existence for this ID ", "Remove_drug", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "There is not any drug to remove", "Remove_drug", JOptionPane.WARNING_MESSAGE);
        }
    }
        

        public   void order(int id  , int Rec_quantity ){
            double total_price;
            boolean flag=false;
            for(int i=0;i<num_of_drugs;i++)
            {Pharmacy_System obj= drug_container.get(i);
                if(obj.getId()==id)
                {
                    double price_unit=obj.getPrice();
                    String category_unit=obj.getCategory();
                    
                    if(category_unit.equals("Cosmetics"))
                    {
                        price_unit=price_unit*1.2;
                        JOptionPane.showMessageDialog(null, "The price of the drug"+ price_unit , "Drug_Price", JOptionPane.INFORMATION_MESSAGE);    
                    }
                        flag=true;

                    if(category_unit.equals("Prescription drugs"))
                    {
                        JOptionPane.showMessageDialog(null, "Please give me the prescription of the drug" , "Drug_Prescription", JOptionPane.INFORMATION_MESSAGE);

                            
                    }

                        int quantity = Rec_quantity ;
                        if(obj.getAvailable_quantity()<quantity)
                        {
                             JOptionPane.showMessageDialog(null, "The available quantity is not enough" , "Drug_Quantity", JOptionPane.WARNING_MESSAGE);
                        }
                        else
                        {   obj.setAvailable_quantity(obj.getAvailable_quantity()-quantity);
                            total_price=price_unit*quantity;
                            price_of_order.add(total_price);
                            JOptionPane.showMessageDialog(null, "The order done successfuly" , "Drug_Order", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                }

            }
            if(flag==false)
            { JOptionPane.showMessageDialog(null, "The Drug not found" , "Drug_Order", JOptionPane.WARNING_MESSAGE);
            }

            
            
          
            
            
            
            
        }
        public double calculate_sales_foroneday(){
            double price_oneday=0.0;
            for(int i=0;i<price_of_order.size();i++)
            {
                price_oneday+=price_of_order.get(i);
            }
            price_of_order.clear();
            return price_oneday;
        }

    
//      do{
//      String response = JoptionPane.showInputDialog("Enter The Capacity of the Pharmacy");
//      int cap = Integer.parseInt(response);
//      if (cap!=5){
//      JoptionPane.showmessageDialog(null, "Wrong Capacity")
//      }
//      }
//      while (cap!= 5);
//      

        public int checkCapacity() {
        int cap = 0;
        do {
            try {
                String response = JOptionPane.showInputDialog("Enter The Capacity of the Pharmacy");
                if (response == null) {
                    // Handle the case where the user cancels the input dialog
                    JOptionPane.showMessageDialog(null, "Operation cancelled");
                    return 0;
                }
                cap = Integer.parseInt(response);
                if (cap != 5) {
                    JOptionPane.showMessageDialog(null, "Wrong Capacity");
                }
            } catch (NumberFormatException ex) {
                // Handle the case where the input is not a valid integer
                JOptionPane.showMessageDialog(null, "Please enter a valid integer" ,"Erorr" ,JOptionPane.ERROR_MESSAGE);
            }
        } while (cap != 5);
        return cap ;
    }

//     public 




    
    
}
