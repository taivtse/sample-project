package poly.app.core.daoimpl;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import poly.app.core.dao.NhanVienDao;
import poly.app.core.data.daoimpl.AbstractDao;
import poly.app.core.entities.NhanVien;

public class NhanVienDaoImpl extends AbstractDao<String, NhanVien> implements NhanVienDao{

    @Override
    public boolean checkLogin(String maNv, String matKhau) {
        Session session = this.getSession();
        try {
            Criteria cr = session.createCriteria(this.getPersistenceClass());
            cr.add(Restrictions.eq("maNv", maNv));
            cr.add(Restrictions.eq("matKhau", matKhau));
            return cr.list().size() > 0;
        } catch (Exception ex) {
            throw ex;
        }finally{
            session.close();
        }
    }

    @Override
    public NhanVien getNhanVienByEmail(String email) {
        NhanVien nhanVien;
        Session session = this.getSession();
        try {
            Criteria cr = session.createCriteria(this.getPersistenceClass());
            cr.add(Restrictions.eq("email", email));
            List<NhanVien> list = cr.list();
            nhanVien = list.size() > 0 ? list.get(0) : null;
        } catch (Exception ex) {
            throw ex;
        }finally{
            session.close();
        }
        return nhanVien;
    }
    
}