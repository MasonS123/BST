public class symbolTable implements Comparable<Node>{

	private Node left;
	private Node right;
	private Key k;
	private Val v;
	
	public Node(Key k, Val v){
		k = k;
		v = v;
	}
	public Node left(){
		
	}
	public Node right(){
		
	}
		
	public void Put(Value v, Key k){
		root = put(root,v,k);
	}
	private Node Put(Node n, Value v, Key k){
		if(n==null) return new Node(v, k);
		int cmp = k.compareTo(n.key);
		if(cmp < 0 ) n.left = put(n.left,v,k);
		else if(cmp < 0) n.right = Put(n.right,v,k)
		else n.value = v;
		return n;
	}
	public V get(Key k){
		return get(root, k);
	}
	private V get(Node n, Key k){
		if(n==null) return null;
		int cmp = k.compareTo(n.key);
		if(cmp<0)return get(n.left,k)
		if(cmp<0)return get(n.right,k);
		return n.val;		
	}