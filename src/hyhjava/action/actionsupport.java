package hyhjava.action;
import hyhjava.hibernate.dao.UserDAO;
import com.opensymphony.xwork2.ActionContext;
public class  actionsupport {
private static final String SUCCESS = null;
private static final String INPUT = null;
private int id;
private String username;
private String password;
private UserDAO userDAO;
private String getSession;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id=id;
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
public String login()throws Exception{
	clearErrorsAndMessages();
	if(getUserDAO)().login(username,password))
{
	ActionContext.getContext().getSession().put("login",username);
	return SUCCESS;
}
else {
	return INPUT;
}
}
public String loginout()
{ActionContext.getContext().getSession().clear();
return "exit";
}
public UserDAO getUserDAO() {
	return userDAO;
}
public void setUserDAO(UserDAO userDAO) {
	this.userDAO=userDAO;
}
}
