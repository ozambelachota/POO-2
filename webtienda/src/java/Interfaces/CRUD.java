/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author Richard Bardales
 */
public interface CRUD {
    public List listar();
    public Usuario get(int id);
    public boolean add(Usuario u);
    public boolean edit(Usuario u);
    public boolean delete(int id);
    public Usuario login(String username);
}
