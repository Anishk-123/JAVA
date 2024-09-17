class Shape{
    public void draw(){
        System.out.println("Drawing a shape");}
    public void erase() {
         System.out.println("Erasing the shape");}}
class Circle extends Shape{ 
public void draw(){
        System.out.println("Drawing a circle");}
    public void erase() {
         System.out.println("Erasing the circle");}}


class Triangle extends Shape{
public void draw(){
        System.out.println("Drawing a triangle");}
    public void erase() {
         System.out.println("Erasing the triangle");}}


class Square extends Shape{
public void draw(){
        System.out.println("Drawing a square");}
    public void erase() {
         System.out.println("Erasing the square");}}


public class J10{
    public static void main(String[]args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        
        
        for (int i=0;i<shapes.length;i++){
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("_ _ _ _ _ _ _ ");}}}
    
    


 


