/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Cristian Hernandez
 * @param <Generic>
 */
public interface metodos <Generic> {

    public boolean create(Generic g);

    public boolean delete(Object Key);

    public boolean update(Generic c);

    public Generic read(Object key);

    public ArrayList<Generic> readAll();
}
