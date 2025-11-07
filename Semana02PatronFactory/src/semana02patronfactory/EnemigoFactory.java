package semana02patronfactory;


import semana02patronfactory.Enemigo;
import semana02patronfactory.BulletBill;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-DOCENTE-C2A503
 */
public class EnemigoFactory {
    public Enemigo generarEnemigo(int codigoEnemigo){
        //el método generarEnemigo devuelve un objeto de la clase Enemigo
        //recibe como parámetro un código de enemigo
        switch(codigoEnemigo){
            case 1:
                return new Goomba(); //termina el método y devuelve un
                                    //enemigo tipo Goomba
            case 2:
                return new Koopa();
            case 3:
                return new BulletBill();
        }
        return null;
    }
}
