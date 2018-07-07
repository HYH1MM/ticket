package hyhjava.action;
package hyhjava.action;
import hyhjava.hibernate.dao.User;
import hyhjava.hibernate.dao.UserDAO;
public class registerbaseaction {
	private static final long serialVersionUID=8339753385060136481L;
	private String username;
	private String password;
	private String realname;
	private String virtualname;
	private Integer cardnumber;
	private Integer role;
	private UserDAO userDAO;
	public String register() {
		clearErrorsAndMessages();
		if(getUserDAO().isExit(username)) {
			addFieldError("isexit","username is exits");
			return "register";
		}else {
			User user=new User();
			user.setUsername(username);
			user.setPassword(password);
			System.out.println(virtualname);
			user.setVirtualname(virtualname);
			user.setRealname(realname);
			user.setCardnumber(cardnumber);
			user.setRole(role);
			getUserDAO().save(user);
			return "login";
			}
	}

	//用户信息修改
	public String update()throws Exception{
		clearErrorsAndMessages();
		User user=(User)getUserDAO().findByProperty("username",username).get(0);
		user.setPassword(password);
		user.setCardnumber(cardnumber);
		user.setRealname(realname);
		user.setVirtualname(virtualname);
		getUserDAO().update(user);
		return SUCCESS;
	}
	//删除用户
	public String delete()throws Exception{
		clearErrorsAndMessages();
		User user=(User)getUserDAO().findByProperty("username",username);
		getUserDAO().delete(user);
		return SUCCESS;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname=realname;
	}
	public String getVirtualname() {
		return virtualname;
	}
	public void setVirtualname(String virtualname) {
		this.virtualname=virtualname;
	}
	public Integer getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(Integer cardnumber) {
		this.cardnumber=cardnumber;
	}
	public Integer isRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role=role;
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO=userDAO;
	}
	