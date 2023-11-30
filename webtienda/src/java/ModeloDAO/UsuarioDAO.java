/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Interfaces.CRUD;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import config.Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard Bardales
 */
public class UsuarioDAO implements CRUD {

    //Conexion cn;
    PreparedStatement ps;
    ResultSet rs;
    Usuario u;
    Connection con;
    Conexion cn;

    public UsuarioDAO() {
        cn = new Conexion();
        u = new Usuario();
    }

    @Override
    public List listar() {
        ArrayList<Usuario> list = new ArrayList<>();
        String sql = "select * from usuario";
        try {

            u = new Usuario();
            this.con = this.cn.getConexion();
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Usuario utemp = new Usuario();
                utemp.setIdUsuario(rs.getInt("idUsuario"));
                utemp.setUsername(rs.getString("username"));
                utemp.setPass(rs.getString("password"));
                list.add(utemp);
                System.out.println(utemp.getIdUsuario() + " " + utemp.getUsername());
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public Usuario get(int id) {

        String sql = "select * from usuario " + " where idUsuario=" + id;
        Usuario utemp = new Usuario();
        try {
            this.con = this.cn.getConexion();
            ps = this.con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                utemp.setIdUsuario(rs.getInt("idUsuario"));
                utemp.setUsername(rs.getString("username"));
                utemp.setPass(rs.getString("password"));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utemp;
    }

    @Override
    public boolean add(Usuario u) {
        boolean respuesta = false;

        String sql = "insert into usuario (username, password) values('" + u.getUsername() + "','" + u.getPass() + "')";
        try {
            this.con = this.cn.getConexion();
            ps = this.con.prepareStatement(sql);
            int exec = ps.executeUpdate();
            if (exec > 0) {
                respuesta = true;
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public boolean edit(Usuario u) {
        boolean respuesta = false;

        String sql = "update usuario set username='" + u.getUsername() + "'," + "password='" + u.getPass() + "' where idUsuario=" + u.getIdUsuario();
        try {
            this.con = this.cn.getConexion();
            ps = this.con.prepareStatement(sql);
            int exec = ps.executeUpdate();

            if (exec > 0) {
                respuesta = true;
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public boolean delete(int id) {
        boolean respuesta = false;

        String sql = "delete from usuario " + " where idUsuario=" + id;
        try {
            this.con = this.cn.getConexion();
            ps = this.con.prepareStatement(sql);
            int exec = ps.executeUpdate();

            if (exec > 0) {
                respuesta = true;
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public Usuario login(String username) {
        String sql = "select * from usuario " + " where username=" + username;

        Usuario utemp = new Usuario();
        try {
            this.con = this.cn.getConexion();            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                utemp.setIdUsuario(rs.getInt("id"));
                utemp.setUsername(rs.getString("username"));
                utemp.setPass(rs.getString("pass"));
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return utemp;
    }
}
