package tech.aistar.dao.impl;

import tech.aistar.common.ConnectionManage;
import tech.aistar.dao.IHeroDao;
import tech.aistar.pojo.Hero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wubin
 * @date 2019/11/16
 * @本类用来演示：
 */
@SuppressWarnings("all")
public class HeroImpl implements IHeroDao {
    @Override
    public List<Hero> findhero() {

        List<Hero> list=new ArrayList<>();

        Connection conn= ConnectionManage.getConn();
        String sql="select id,uk_name,nickname,tiny_img,magic_power,physic_power,defence_power,hand_hard,roles from hero";

        try {
            PreparedStatement pre = conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next())
            {
                Hero hero  = new Hero();
                hero.setId(rs.getInt(1));
                hero.setUkName(rs.getString(2));
                hero.setNickName(rs.getString(3));
                hero.setTinyImg(rs.getString(4));
                hero.setMagicPower(rs.getInt(5));
                hero.setPhysicPower(rs.getInt(6));
                hero.setDefencePower(rs.getInt(7));
                hero.setRoles(rs.getString(8));
                list.add(hero);

            }
//
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally
        {

            ConnectionManage.closeConn(conn);
        }

        return list;
    }
}
