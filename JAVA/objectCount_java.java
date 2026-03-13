class objectCount{
	public static void main(String args[]){
	counter c1=new counter();
	counter c2=new counter();
	counter c3=new counter();
	counter c4=new counter();
	c4.getCount();
	
	}
}

class counter{
	static int count=0;
	 counter(){
		count++;
	}
	public void getCount(){
		System.out.println("Number of objects created:"+count);
	}
}
	