package service;

import org.springframework.data.relational.core.mapping.Table;

@Table("Branch")
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
}