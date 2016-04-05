package ch.ffhs.dua.binSearch;


public class BinSearch 
{
	/**
	 * Findet fÃ¼r einen aufsteigend geordneten Array zu einer Zahl value
	 * den kleinsten und den grÃ¶ssten Index.
	 * @param array
	 * @param value
	 * @return Ein Paar mit kleinestem und grÃ¶sstem Index oder null.
	 */
	public static Pair search(int[] array, int value)
	{
		
		// TODO
		if (array.length == 0) { 
			return null; 
        }
		
		int start = 0;
		int end = array.length - 1;
		
		int mid = 0;
		
		while(start <= end)
		{
					
			mid = ((end + start)  / 2);
						
			if(value < array[mid])
				end = mid - 1;
			else if(value > array[mid])
				start = mid + 1;
			else
				if (value == array[mid])
				{	
					start = mid - 1;
					end = mid + 1;
				}
				else
				{
				Pair p = new Pair(start,end);
				return p;}
			}
		
				
		return null;
	}
	


}
