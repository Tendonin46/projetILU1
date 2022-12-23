package fac;
public class main {
	
	private static void init(String[][] tab, int i,Etudiant etudiant,Demande demande) {
		tab[i][0]=etudiant.getNom(); 
		tab[i][1]=etudiant.getPrenom();
		tab[i][2]=etudiant.getNumDossier();
		tab[i][3]=demande.getTypeDemande();
	}
	
	public static void main(String[] args) {
			final int LIGNE=2;
			final int COL = 4;
			
			String[][] tableau = new String[LIGNE][COL];
			Etudiant Pierre = new Etudiant("FILK","Pierre","456879");
			Etudiant Jack = new Etudiant("YANG","Jack","575421");
			Demande aideSociale = new Demande("aide sociale");
			
			for(int i=0;i<LIGNE;i++) {
				switch(i) {
					case 0:
						init(tableau,0,Pierre,aideSociale);
						break;
					case 1:
						init(tableau,1,Jack,aideSociale);
						break;
					default:
						System.out.println("Erreur initialisation");
						break;
				}
			}
			
			System.out.println("Nom"+"\t"+"Prenom"+"\t"+"N°Dos"+"\t"+"aide"+"\n");
			
			for(int i=0;i<tableau.length;i++) {
				for(int j=0;j<tableau[0].length;j++) {
					System.out.print(tableau[i][j]+"\t");
				}
				System.out.println();
			}
		
	}

}
