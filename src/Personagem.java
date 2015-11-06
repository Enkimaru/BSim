public class Personagem {
	private int MAXHP;
	private int HPATUAL;
	private int DANOATUAL;
	private int BLOQATUAL;
	private double ATK;
	private double DEF;
	private double CRIT;
	private String Name;
	private double ATKB;
	private boolean ACCRIT;
	private int ULTIMODANO;
	
	public Personagem(int mAXHP, double aTK, double dEF, double cRIT,
			String name) {
		setMAXHP(mAXHP);
		setATK(aTK);
		setDEF(dEF);
		setCRIT(cRIT);
		setName(name);
	}
	public int getMAXHP() {
		return MAXHP;
	}
	public void setMAXHP(int mAXHP) {
		HPATUAL = mAXHP;
		if (mAXHP < 0)
			MAXHP = 1;
		else
			MAXHP = mAXHP;
	}
        public void renovaHP() {
        HPATUAL = MAXHP;
        }
	public void setHPATUAL (int dano_op){
		BLOQATUAL = (int) (Math.random()*2 + DEF);
		ULTIMODANO = - (BLOQATUAL - dano_op);
		if (ULTIMODANO < 0)
			ULTIMODANO = 0;
		HPATUAL = HPATUAL - ULTIMODANO;
		if (HPATUAL < 0)
			HPATUAL = 0;
	}
	public int getHPATUAL(){
			return HPATUAL;
	}
	public double getATK() {
		return ATK;
	}
	public void setATK(double aTK) {
		if (aTK < 1)
			ATK = 1;
		else
			ATK = aTK;
	}
	public double getDEF() {
		return DEF;
	}
	
	public void setDEF(double dEF) {
		if (dEF < 0)
			DEF = 0;
		else
			DEF = dEF;
	}
	public double getCRIT() {
		return CRIT;
	}
	public void setCRIT(double cRIT) {
		if(cRIT > 100) 
			CRIT = 100;
		else if(cRIT < 0)
			CRIT = 0.1;
		else
			CRIT = cRIT;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		if (!name.equals(""))
			Name = name;
		else
			Name = "Fulano";
	}
	public double getATKB() {
		return ATKB;
	}
	
	public boolean getACCRIT(){
		return ACCRIT;
	}
	@Override
	public String toString() {
		return "########\nPersonagem [" + Name + "] : \n • MAXHP = " + MAXHP + "\n • ATK = " + ATK + "\n • DEF = " + DEF
				+ "\n • Chance de Crítico = " + CRIT + "%\n";
	}
	
	public int getDANOATUAL(){
		return DANOATUAL;
	}
	public int getBLOQATUAL(){
		return BLOQATUAL;
	}
	public int dano(){
		ATKB = Math.random()*5;
		double danoInicial = ATK + ATKB;
		if (Math.random()*100 >= 100 - CRIT) {
			ACCRIT = true;
			DANOATUAL = (int) Math.floor(danoInicial*2);
		}
		else {
			ACCRIT = false;
			DANOATUAL = (int) Math.floor(danoInicial);
		}
			return DANOATUAL;
	}
        public int getULTIMODANO(){
            return ULTIMODANO;
        }

	
	
}
