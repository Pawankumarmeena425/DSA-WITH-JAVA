/*  YOu have to create a Package named Com.Codewithharry.shape
This package should have individual classes for Rectangle,Square , Circle, Cylinder,Sphere.
These Classes Should use inheritance to properly mangae the code!
INclude methods like volume, surface area and getters and setters for dimension,
----->>>>>>> Use VS Code ------------------->>>>>>>>>>>>>>>>>>>>>>>
*/

package Com.Codewithharry;



public class Exercise05{
    public static void main(String[] args)
    {
Rectangle r = new Rectangle();
r.setDimention(3,6);
System.out.println(r.area);
System.out.println(r.volume);
    }
}