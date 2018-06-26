package com.encapsulation.java;

/*
Değişkenler private olarak tanımlandığı için direk olarak değiştirilemez.
Bunun yerine public erişim belirtecine sahip getter ve setter metotları aracılığı ile değiştirilip kullanılabilir.
Bu da bizim veri güncellerken veya kullanırken yaşanabilecek karışıklıkların önüne geçmemizi sağlar.
*/

public class Test
{
    private String name;
    private int age;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
}
