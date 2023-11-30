/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.List;
import model.User;

/**
 *
 * @author HAROLD
 */
public interface IUserDAO {
    public List listar();
    public User get(int id);
    public boolean add(User u);
    public boolean edit(User u);
    public boolean delete(int id);
}
