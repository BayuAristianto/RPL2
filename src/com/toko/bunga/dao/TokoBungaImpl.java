/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.toko.bunga.dao;

import com.toko.bunga.model.TokoBunga;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bayu
 */
@Repository
public class TokoBungaImpl implements TokoBungaDao {
    @Autowired
    private SessionFactory sessionFactory;
//
//    public TokoBungaImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
    

    @Override
    public void save(TokoBunga tokobunga) {
        sessionFactory.getCurrentSession().save(tokobunga);
//        Session  session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            session.save(tokobunga);
//            session.getTransaction().commit();
//        }catch(Exception e){
//            System.err.println("Tidak Dapat Menyimpan Data Bunga");
//            session.getTransaction().rollback();
//        }finally{
//            session.close();
//        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(TokoBunga tokobunga) {
        sessionFactory.getCurrentSession().update(tokobunga);
//        Session  session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            session.update(tokobunga);
//            session.getTransaction().commit();
//        }catch(Exception e){
//            System.err.println("Tidak Dapat Mengupdate Data Bunga");
//            session.getTransaction().rollback();
//        }finally{
//            session.close();
//        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(TokoBunga tokobunga) {
        sessionFactory.getCurrentSession().delete(tokobunga);
//        Session  session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            session.delete(tokobunga);
//            session.getTransaction().commit();
//        }catch(Exception e){
//            System.err.println("Tidak Dapat Menghapus Data Bunga");
//            session.getTransaction().rollback();
//        }finally{
//            session.close();
//        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public TokoBunga get(String kd_bunga) {
//        Session  session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            TokoBunga tokobunga = (TokoBunga) session.get(TokoBunga.class, kd_bunga);
//            session.getTransaction().commit();
//            return tokobunga;
//        }catch(Exception e){
//            System.err.println("Tidak Dapat Menampilkan Data Bunga");
//            session.getTransaction().rollback();
//            return null;
//        }finally{
//            session.close();
//        }
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public List<TokoBunga> getList() {
        return sessionFactory.getCurrentSession().createCriteria(TokoBunga.class).list();
//        Session  session = sessionFactory.openSession();
//        try{
//            session.beginTransaction();
//            List<TokoBunga> listbunga = session.createCriteria(TokoBunga.class).list();
//            session.getTransaction().commit();
//            return listbunga;
//        }catch(Exception e){
//            System.err.println("Tidak Ada List Bunga");
//            session.getTransaction().rollback();
//            return null;
//        }finally{
//            session.close();
//        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
