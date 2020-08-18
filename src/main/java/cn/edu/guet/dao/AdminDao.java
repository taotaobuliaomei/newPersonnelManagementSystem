package cn.edu.guet.dao;

import cn.edu.guet.domain.Admin;

import java.util.List;
import java.util.Map;

public interface AdminDao {

    public Admin login(Admin admin);
    /*根据条件查询管理员
    * @param map
    * @return
    **/
    public List<Admin> findAdmins(Map<String,Object> map);



    public Integer getCount(Map<String,Object> map);


    /** 添加管理员
     *
     * @param admin
     * @return
     */
    public Integer addAdmin(Admin admin);

    /** 修改管理员
     *
     * @param admin
     * @return
     */
    public Integer updateAdmin(Admin admin);

    /** 删除管理员
     *
     * @param id
     * @return
     */
    public Integer deleteAdmin(Integer id);
}
