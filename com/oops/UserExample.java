package com.oops;

class User
{
	//Instance variables
	private long userId;
	private String password;
	private String userName;
	private String email;
	
	
	//default constructor - helps to create an empty object of the class
	public User() {
	
	}

    //Parameterized Constructor - helps to create and initialise the properties of an object
	public User(long userId, String password, String userName, String email) {
		
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.email = email;
		
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    void addProductToCart()
    {
    	System.out.println("addProductToCart method invoked!!");
    }
     	
}

public class UserExample {

	public static void main(String[] args) {
		
		User user=new User();
		user.setUserId(12345);
		user.setUserName("Raman");
		user.setPassword("ABC123");
		user.setEmail("user@gmail.com");
		
		System.out.println(user.getUserId()+" " +user.getUserName()+" "+user.getPassword()+ " "+user.getEmail());
	
		
		User user1=new User(8972,"xyz123","Mohan","user1@gmail.com");
		System.out.println(user1.getUserId()+" " +user1.getUserName()+" "+user1.getPassword()+ " "+user1.getEmail());

		user1.addProductToCart();
	}

}
