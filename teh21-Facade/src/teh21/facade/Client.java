/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teh21.facade;

/**
 *
 * @author koivi
 */
public class Client {

    /**
     * to get raw materials
     * @param args
     */
    public static void main(String[] args) {
        StoreKeeper keeper = new StoreKeeper();
        RawMaterialGoods rawMaterialGoods = keeper.getRawMaterialGoods();
        System.out.println(rawMaterialGoods.toString());
    }
}
