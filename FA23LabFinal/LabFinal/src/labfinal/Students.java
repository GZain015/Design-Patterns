/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labfinal;

/**
 *
 * @author Zain
 */
class Students implements AdmissionObserver {
    @Override
    public void update() {
        System.out.println("Students: Received update");
    }
}
