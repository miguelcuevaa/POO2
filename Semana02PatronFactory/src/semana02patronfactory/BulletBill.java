package semana02patronfactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class BulletBill extends Enemigo{
    public BulletBill(){ //creamos un constructor con las características propias
                    //de esta clase hija
    this.setCodigoEnemigo(3);
    this.setNombreEnemigo("Bullet Bill");
    this.setFuerzaEnemigo(15);
    }
}
