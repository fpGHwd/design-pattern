/**
 * 
 */
package pattern.iterator;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 6:19:28 PM
 */
public class NameRepository implements Container {

	private String[] names = {"Robert" , "John" ,"Julie" , "Lora"};
	
	/* (non-Javadoc)
	 * @see pattern.iterator.Container#getIterator()
	 */
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {
		 
	      int index;
	 
	      @Override
	      public boolean hasNext() {
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }
	 
	      @Override
	      public Object next() {
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }     
	   }

}
