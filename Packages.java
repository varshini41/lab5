package pack1;
public class pack1 {

    public static void main(String[] args) {
        pack1class obj=new pack1class();
        System.out.println("Inside level 1 package:"+obj.display());
    }
    }
package pack1;
public class pack1class {
    public int display()
    {
          int x=1;
          return x;
    }
}
package pack1.pack2;

import pack1.pack1class;

public class pack2 {

    public static void main(String[] args) {
       pack2class obj=new pack2class();
       System.out.println("Inside level 2 package:"+obj.display());
       
       pack1class obj1=new pack1class();
       System.out.println("Inside level 1 package:"+obj1.display());
    }
    }
package pack1.pack2;

public class pack2class {
    
    public int display()
    {
        int y=2;
        return y;
    }    
}
package pack1.pack2.pack3;
import pack1.pack1class;
import pack1.pack2.pack2class;

public class pack3 {
    public static void main(String[] args) {
        pack3class obj=new pack3class();
        System.out.println("Inside level 3 package:"+obj.display());
        pack2class obj1=new pack2class();
        System.out.println("Inside level 2 package:"+obj1.display());
        pack1class obj2=new pack1class();
        System.out.println("Inside level 1 package:"+obj2.display());
    }
    
}
package pack1.pack2.pack3;
public class pack3class {
    public int display()
    {
        int z=3;
        return z;
    }
}
