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
public class Goomba extends Enemigo{
    //Goomba es una clase hija de Enemigo
    public Goomba(){ //creamos un constructor con las características propias
                    //de esta clase hija
    this.setCodigoEnemigo(1);
    this.setNombreEnemigo("Goomba");
    this.setFuerzaEnemigo(5);
    }
    
}
