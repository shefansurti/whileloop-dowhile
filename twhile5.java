class test {
	public static void main(String[] args){
		int mysteryInt=1;
		int count=1;
		while(mysteryInt<3){
			mysteryInt=mysteryInt*count;
			count++;
		}
		System.out.println(mysteryInt);
	}
}