public class FindBigestNo {
	public static void main(String[] args) {
		int [] arr={5,45,45,33,5,6,66};
		int big=0;
		for(int no:arr) {
			if(no>big) big=no;
		}
        System.out.println(big);
    }

}

// output :

// 66