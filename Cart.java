public class Cart {
	private int qtyOrdered;
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc){
		if (qtyOrdered == 20) {
	
			System.out.println("cart is almost full");
		}else {
			this.itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc " + disc.getTitle() +" has been added");
			System.out.println("number of DVD in Cart: "+ qtyOrdered);
		}
	}
	
	public double totalCost() {
		double sum = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum; 	
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i;
		int count = 0;
		for (i = 0; i < qtyOrdered; i++) {
			if (disc == this.itemsOrdered[i]) 
			{	
				Scanner x = new Scanner(System.in); 
				
				System.out.println("The disc " + disc.getTitle() + " has found. Are you sure to remove it?");
				String choice = x.nextLine();
				
				if (choice.equals("y")) {
					for (int j = i;  j< qtyOrdered - 1 ; j++) {
						this.itemsOrdered[j] = this.itemsOrdered[j+1];
					}
					this.itemsOrdered[qtyOrdered -1] = null;
					qtyOrdered--;
					count++;
				}
			}
		}
		System.out.println("number of DVD removed: " + count);
		System.out.println("number of remaining DVD in Cart: "+ qtyOrdered);
	}
	
	
	
	
	
	public void checkquantity() {
		System.out.println("number of items in Cart: " + qtyOrdered);
		for (int i = 0; i < qtyOrdered;  i++) {
			System.out.println( (i+1)+ " " + itemsOrdered[i].getTitle());
		}
	}
}