package hyhjava.action;
import java.util.List;
import hyhjava.hibernate.dao.didian;
import hyhjava.hibernate.dao.didianDAO;
import com.opensymphony.xwork2.ActionContext;
public class baseaction {
	private static final long serialVersionUID=7205874080340119551L;
	private Integer id;
	private didianDAO didianDAO;
	private String name;
	private String address;
	private Integer price;
	public String insert()throws Exception{//��ӵص���Ϣ
		clearErrorsAndMessages();
		try {
			System.out.println("try()");
			didian dd=new didian();
			dd.setAddress(address);
			dd.setName(name);
			dd.setPrice(price);
			getdidianDAO().save(dd);
			System.out.println("try()");
			return SUCCESS;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("catch");
			return INPUT;
		}
	}
public String load()
{//ҳ����ص���
	clearErrorsAndMessages();
	List list()=getdidianDAO().findByProperty("address","֣��")��
	List list()=getdidianDAO().findByProperty("address","����")��
	List list()=getdidianDAO().findByProperty("address","����")��
	List list()=getdidianDAO().findByProperty("address","����")��
	System.out.println("load");
	setSession("address0",list0);
	setSession("address1",list1);
	setSession("address2",list2);
	System.out.println(list0);
	return "load";
}
public String buy()
{//���������ת������ҳ
	clearErrorsAndMessages();
	if(ActionContext.getContext().getSession().get("login")!=null)
{
		System.out.println("buy if" );
		setSession("didianid",id);
		return "buy";
}
	else
	{
		System.out.println("buy else");
		return LOGIN;
	}
}
//�鿴����
public String view()
{
	clearErrorsAndMessages();
	didian jd=(didian)getdidianDAO().findById(id);
	setSession("didian",dd);
	return "view";
}
public didianDAO getdidianDAO() {
	return didianDAO;
}
public void setdidianDAO(didianDAO didianDAO) {
	this.didianDAO=didianDAO;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address=address;
}
public Integer getPrice() {
	return price;
}
public void setPrice(Integer price) {
	this.price=price;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id=id;
}
}
