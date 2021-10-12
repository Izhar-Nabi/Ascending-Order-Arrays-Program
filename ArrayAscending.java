class ArrayAscending{
	public static void main(String args[]){
	int A[]={0, 3, 5, 9, 7, 4, 8, 2, 1, 6};
	int i,temp;
	for ( i=0; i<A.length; i++){
	for(int j=i+1; j<A.length; j++){
	if(A[i]>A[j]){
	temp=A[i];
	A[i]=A[j];
	A[j]=temp;
	}
			}
		}
	for(int n : A){
	System.out.print(n+" ");}

	}
}