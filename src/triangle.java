public class triangle {
    double area;
    int ht;
    int ln;
    void setarea(){
        area=(ht*ln)/2;
    }

    public static void main(String[] args) {
        int x=0;
        triangle[] ta= new triangle[4];
        while(x<4){
            ta[x]= new triangle();
            ta[x].ht=(x+1)*2;
            ta[x].ln=x+4;
            ta[x].setarea();
            System.out.print("triangle" + x + ", area");
            System.out.println("="+ta[x].area);
            x=x+1;
        }
    }
}
