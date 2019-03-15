import java.util.ArrayList;
import java.util.List;
public class History {

//List transactionlist =new ArrayList(5);
ArrayList <operation> historyarr =new ArrayList <operation>();
private int pos;
int index;
Transaction transaction =new Transaction();
operation oo=new operation("",0);
	public History(operation oo) {
	this.oo = oo;
	historyarr.size();

	if(historyarr.size()>5)
		historyarr.remove (0);
	historyarr.add(oo);
}
	
public next () {
	historyarr.get(index);
	
}
 public previous() {
	 
	historyarr.get(index) ;
	 
 }
	


	
	
}