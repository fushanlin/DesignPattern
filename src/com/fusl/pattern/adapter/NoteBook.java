package com.fusl.pattern.adapter;

public class NoteBook {
	private ThreePlugIf plug;
	public NoteBook(ThreePlugIf plug){
		this.plug = plug;
	}
	
	//使用插座充电，
	public void charge(){
		plug.powerWithThree();
	}
	
	public static void main(String[] args) {
		GBTwoPlug gbTwoPlug = new GBTwoPlug();
		ThreePlugIf threePlugIf = new TwoPlugAdapter(gbTwoPlug);
		NoteBook book = new NoteBook(threePlugIf);
		book.charge();
		
		ThreePlugIf three = new TwoPlugAdapterExtends();
		NoteBook bbook = new NoteBook(three);
		bbook.charge();
	}

}
