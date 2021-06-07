public class Reacao {

	private int a;
	private int b;
	private int c;
	private int recipienteC;


public Reacao(){

}
	public Reacao(int x, int y) {
		this.a = x;
		this.b = y;
		this.c = x + y;
	}

	public void adicionarA(int x) {
		this.a =+ x;
	} 

	public void adicionarB(int y) {
		this.b =+ y;	
	}
    
    public void agitar(){
		if((this.a + this.b) == this.c ){
				
      this.recipienteC =  ((this.a + this.b) / this.c);

			this.a = 0;
			this.b = 0;

		}else if((a + b) % c != 0){
				
      this.recipienteC = this.recipienteC + ((this.a + this.b)/this.c);
      
			this.a -= this.c;
			this.b -= - this.c - this.a;
			
    }
  }
	
		public int getC(){
			return this.recipienteC;
		}
}
	

  