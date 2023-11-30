/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import config.Conexion;
import interfaces.IUserDAO;
import java.util.List;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author HAROLD
 */
public class UserDAO implements IUserDAO {

    Conexion conexion;
    PreparedStatement ps;
    ResultSet rs;
    User user;
    Connection conn = null;

    public UserDAO() {
        conexion = new Conexion();

        user = new User();
    }

    @Override
    public List listar() {
        ArrayList<User> list = new ArrayList<>();
        String sql = "select * from user";

        try {

            this.conn = conexion.getConexion();

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User userTemp = new User();
                userTemp.setIdUser(rs.getInt("id_user"));
                userTemp.setUserName(rs.getString("user_name"));
                userTemp.setPassword(rs.getString("user_password"));
                list.add(userTemp);
            }
            this.conn.close();

        } catch (SQLException ex) {
            System.out.println("" + ex.getMessage());
        }
        return list;
    }

    @Override
    public User get(int id) {
        String sql = "select * from user where id_user=" + id;
        try {
            this.conn = conexion.getConexion();

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                this.user.setIdUser(rs.getInt("id_user"));
                this.user.setUserName(rs.getString("user_name"));
                this.user.setPassword(rs.getString("user_password"));
            }
            this.conn.close();
        } catch (SQLException ex) {
            System.out.println("");
        }
        return user;
    }

    @Override
    public boolean add(User u) {
        String sql = "insert into user(user_name,user_password) values(?,?)";

        boolean resp = false;
        try {
            this.conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            if (u.getUserName() != null && u.getPassword() != null) {
                ps.setString(1, u.getUserName());
                ps.setString(2, u.getPassword());
                int exec = ps.executeUpdate();
                if (exec > 0) {
                    resp = true;
                }
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(""+ex.getMessage());

        }
        return resp;
    }

    @Override
    public boolean edit(User u) {
        String sql = "update user set user_name=?, user_password=? where id_user="+u.getIdUser();

        boolean resp = false;
        try {
            this.conn = conexion.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, u.getUserName());
            ps.setString(2, u.getPassword());
            int exec = ps.executeUpdate();
            if (exec > 0) {
                resp = true;
            }
            this.conn.close();
        } catch (SQLException ex) {
            System.out.println("");

        }
        return resp;
    }

    @Override
    public boolean delete(int id) {
        String sql = "delete from user where id_user=?";
        boolean resp = false;
        try {
            this.conn = conexion.getConexion();

            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int exec = ps.executeUpdate();
            if (exec > 0) {
                resp = true;
            }
            this.conn.close();
        } catch (SQLException ex) {
            System.out.println("");

        }
        return resp;

    }

}
