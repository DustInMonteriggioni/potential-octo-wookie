package data_center;

/** Provide a comparison between up to 3 bbkDetails, pos == 0, 1, 2 */
public class CompareCenter
{
	public BbkDetail[] compareList = {null, null, null};
	
	public CompareCenter() {}
	
	/** Specify a bbkName to inquire in the database, set it in the list and return */
	public BbkDetail assignDetail(String bbkName, int pos)
	{	
		BbkDetail bbkDetail = BbkDatabaseConnector.getDetailByName(bbkName);
		compareList[pos] = bbkDetail;
		return bbkDetail;
	}
	
	public BbkDetail getDetail(int pos)
	{	
		return compareList[pos];
	}
}
