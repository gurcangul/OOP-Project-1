package mainpackage;
/*An interface is implicitly abstract. We do not need to use the abstract keyword while declaring an interface.*/
public interface ISearchable {

	void searchInArchitect(String word);//parameterized method
	void searchInArtist(String word);
	void searchInArchitecture(String word);
	void searchInSculpture(String word);
	void searchInPaintingt(String word);

}
