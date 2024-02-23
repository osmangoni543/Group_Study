package com.automation.day3.CssSelector;

public class CssSelector {
	
	//     html[attribute = value] - cssSelector basic syntax
	//     Whenever there is an id attribute
	
	// # reperesents id
	// . represents class
	
	/*
	 * html#idvalue
	 * input#login1
	 * #login1
	 * 
	 * Whenever there is a class attribute
	 * html.classvalue1
	 * if it is a compound class
	 * html.val1.val2.val3.valn
	 * 
	 * <input class = ="btn btn-primary"
	 * input.btn.btn-primary
	 * 
	 * > use to traverse between child and parent
	 * space or + to traverse between siblings
	 * 
	 * relationships:
	 * nth-child(index)
	 * nth-of-type(index)
	 * 
	 * rootelement > html
	 * p#signin_info > a.signin
	 * 
	 * rediff signin
	 * 
	 * supposedly you are travesing from ancestor 
	 * lets say you are traversing from your parent
	 * lets say that parent has 3 kids 
	 * 
	 * <p
	 *   <a
	 *   <br
	 *   <a 
	 *   
	 * rootelementofparent > nth-child(1) -> this is okay
	 * rootelementofparent > nth-child(2/3) -> this is not okay  
	 * rootelementofparent > br:nth-child(2) -> this is okay
	 * 
	 * 
	 * 
	 * nth-child means child number what?
	 * 
	 * p#signin_info > a:nth-child(3)
	 * 
	 * p#signin_info > a:nth-of-type(2)
	 * 
	 * p#signin_info a:nth-child(1)
	 * p#signin_info br:nth-child(2)
	 * p#signin_info a:nth-child(3)
	 * p#signin_info a:nth-of-type(1)
	 * p#signin_info a:nth-of-type(2)
	 * p#signin_info br:nth-of-type(1)
	 * 
	 * siblings
	 * 
	 * p#signin_info a + br + a
	 * p#signin_info a.signin + br + a
	 * input#OAS_subsection + style + div + div.logobar > div.table > div:nth-child(3) > p#signin_info > a:nth-of-type(2)
	 * 
	 * parent to child
	 * sibling to sibling
	 * 
	 * between siblings use +
	 * parent to child > or a space
	 * 
	*/

	public static void main(String[] args) {
		
		

	}

}
