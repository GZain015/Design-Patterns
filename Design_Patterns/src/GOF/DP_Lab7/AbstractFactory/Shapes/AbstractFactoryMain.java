/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.DP_Lab7.AbstractFactory.Shapes;

/**
 *
 * @author fa20-bse-017
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
      //get shape factory
//      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
      AbstractFactory shapeFactory = FactoryProducer.getFactory("Rounded");
      //get an object of Shape Rectangle
      Shape shape1 = shapeFactory.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape1.draw();
      //get an object of Shape Square 
      Shape shape2 = shapeFactory.getShape("SQUARE");
      //call draw method of Shape Square
      shape2.draw();
      //get shape factory
//      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory("DoubleBordered");
      //get an object of Shape Rectangle
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape3.draw();
      //get an object of Shape Square 
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      //call draw method of Shape Square
      shape4.draw();
      
      ///get shape factory
      AbstractFactory shapeFactory2 = FactoryProducer.getFactory("Simple");
      //get an object of Shape Rectangle
      Shape shape5 = shapeFactory2.getShape("RECTANGLE");
      //call draw method of Shape Rectangle
      shape5.draw();
      //get an object of Shape Square 
      Shape shape6 = shapeFactory2.getShape("SQUARE");
      //call draw method of Shape Square
      shape6.draw();
      
   }
}
