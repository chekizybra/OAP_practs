public class nasledstvo_ne_poluchite_vse_perepishu_na_sobaku {
    public static void main(String[] args){
        pointPlane gog = new pointPlane(12,54);
        gog.show();
        pointSpace gag = new pointSpace(1,1,12);
        gag.show();
        gag.showSpace();

        System.out.println("----------------------------------------------------------");

        rectangle prymougolnik = new rectangle("прямоугольник",23,34);
        prymougolnik.figuredisplay();
        prymougolnik.ploshad();
        prymougolnik.perimetr();

        System.out.println("----------------------------------------------------------");

        triangle treugolnik = new triangle("двухугольник",1,3,4);
        treugolnik.figuredisplay();
        treugolnik.ploshad();
        treugolnik.perimetr();

        System.out.println("----------------------------------------------------------");

        circle krug = new circle("михаил",13);
        krug.figuredisplay();
        krug.ploshad();
        krug.perimetr();

        function func = new function(23);
        func.y();
        System.out.println("-------------------------");
        line line = new line(3,4,3);
        line.y();
        System.out.println("-------------------------");
        kub kub = new kub(4,2,5,12);
        kub.y();
        System.out.println("-------------------------");
        hyperbola hyperbola = new hyperbola(3,6,12);
        hyperbola.y();
    }

}

class pointPlane{
    int x;
    int y;
    public pointPlane(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void show()
    {
        System.out.println("координата x : "+ x +" координата y : " + y);
    }
}
class pointSpace extends pointPlane{
    int z;
    pointSpace(int x, int y, int z)
    {
        super(x, y);
        this.z=z;
    }
    public void showSpace()
    {
        System.out.println("координата x : "+x+" координата y : "+y+" координата z : "+z);
    }
}

class figure{
    String name;
    figure(String name){
        this.name = name;
    }
    void figuredisplay(){
        System.out.println("имя фигуры: "+ name);
    }
}
class rectangle extends figure{
    int a;
    int b;
    rectangle(String name,int a,int b){
        super(name);
        this.a = a;
        this.b = b;
    }
    void ploshad(){
        System.out.println("площадь "+ name+" равняется : "+ a*b);
    }
    void perimetr(){
        System.out.println("периметр "+ name+" равняется : "+ (a*2+b*2));
    }
}
class circle extends figure{
    int r;
    int d;
    circle(String name,int r){
        super(name);
        this.r = r;
        this.d = r*2;
    }
    void perimetr(){
        double res = 2*(3.14*r);
        System.out.println("длинна окружности "+ name+" равняется : "+ res);
    }
    void ploshad(){
        double res = 3.14 * Math.pow(r,2);
        System.out.println("периметр "+ name+" равняется : "+ res);
    }
}
class triangle extends figure{
    int a;
    int b;
    int c;
    triangle(String name,int a,int b,int c){
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    void ploshad(){
        int p = a+b+c;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("площадь "+ name+" равняется : "+ S);
    }
    void perimetr(){
        int p = a+b+c;
        System.out.println("периметр "+ name+" равняется : "+ p);
    }
}

class function{
    int x ;

    function(int x ){
        this.x = x;
    }

    void y(){
        System.out.println("y = f(x)"+"="+x);
    }
}
class line extends function{
    int a;
    int b;
    line(int a,int b,int x) {
        super(x);
        this.a = a;
        this.b = b;
    }
    @Override
    void y(){
        System.out.println("y = f(ax+b)"+"="+((a*x)+b));
    }
}
class kub extends function{
    int a;
    int b;
    int c;
    kub(int a, int b, int c, int x) {
        super(x);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    void y(){
        double res = Math.pow(a*x,2)+(b*x)+c;
        System.out.println("y=f(ax↑2+bx+c)"+"="+res);
    }
}
class hyperbola extends function{
    int a;
    int b;
    hyperbola(int a, int b, int x) {
        super(x);
        this.a = a;
        this.b = b;
    }
    @Override
    void y(){
        double res = (a/x)+b;
        System.out.println("y=f(a/x+b)"+"="+res);
    }
}
