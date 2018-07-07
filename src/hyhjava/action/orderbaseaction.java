package hyhjava.action;
import hyhjava.dao.didian;
import hyhjava.dao.Order;
import hyhjava.dao.OrderDAO;
public class orderbaseaction {
	private OrderDAO orderDAO;
	private String consignee;
	private Integer tel;
	private Integer amount;
	private Integer sum;
	private String address;
	private String mode;
	private String user;
	private Integer id;
	private String username;
	private Integer dd;
	private Integer price;
	private Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price=price;
	}
	public String insert()
	{//¹ºÂò
		orderbaseaction order;
		order.setAddress(address);
		order.setAmount(amount);
		order.setMode(mode);
		order.setTel(tel);
		order.setSum(sum);
		order.setUsername(username);
		order.setdidianid(dd);
		getOrderDAO().save(order);
		return SUCCESS;
	}
	public OrderDAO getOrderDAO() {
		return orderDAO;
	}
	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO=orderDAO;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee=consignee;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel=tel;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amonut) {
		this.amount=amount;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum=sum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode=mode;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user=user;
	}
	public Integer getdd() {
		return dd;
	}
	public void setdd(Integer dd) {
		this.dd=dd;
	}
	public Integer getId() {
		return dd;
	}
    public void setId(Integer id) {
    	this.id=id;
    }
    public String getUsername() {
    	return username;
    }
    public void setUsername(String username) {
    	this.username=username;
    }
}
