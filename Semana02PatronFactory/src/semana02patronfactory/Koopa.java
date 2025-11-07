package semana02patronfactory;


import semana02patronfactory.Enemigo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class Koopa extends Enemigo{
    public Koopa(){ //creamos un constructor con las características propias
                    //de esta clase hija
    this.setCodigoEnemigo(2);
    this.setNombreEnemigo("Koopa");
    this.setFuerzaEnemigo(10);
    }
}
