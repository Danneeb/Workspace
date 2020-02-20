package db222pt_assign1.Exercise2;

public class DefineStack implements StringStack{
	protected String[] arr;
	protected int theSize = 0;
	protected int size = 0;
	protected String[] tmpArr;
	
	public DefineStack(int theSize) {
		arr = new String[theSize];
	}
	public void resize() {
		String[] tmp = new String[2*arr.length];
		System.arraycopy(arr, 0, tmp, 0, arr.length);
		arr = tmp;
	}
	public void add(String n) {
		arr[size++] = n;
		if(size == arr.length) {
			resize();
		}
	}
	
	public boolean isEmpty() {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] != null) {
				return false;
			}
			
		}
		return true;
		

	}

	
	public void push(String element) {
		arr[size++] = element;
		if(size == arr.length) {
			resize();
		}
		
	}
	public void setPop() {
		
	}
	
	public String pop() {
		String[] popArr = new String[arr.length];
		
		System.arraycopy(arr, 1, popArr, 0, arr.length-1);
		arr = popArr;
		String str = arr[0];
		return str;
	}

	
	public String peek() {
		String str = arr[0];
		return str;
	}
	
	public int size() {
		int sz = arr.length;
		return sz;
	}

}