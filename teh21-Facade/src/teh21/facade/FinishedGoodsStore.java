/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teh21.facade;

public class FinishedGoodsStore implements Store {

 	public Goods getGoods() {
        FinishedGoods finishedGoods = new FinishedGoods();
        return finishedGoods;
        }
}