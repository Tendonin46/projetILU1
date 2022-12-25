package main;

import fac.Demande;
import fac.Etudiant;

public class Main {
	private void affichage(String[][] tableau,int annee) {
		System.out.println("Année "+annee+": \n");
		System.out.println("Nom"+"\t"+"Prenom"+"\t"+"N°Dos"+"\t"+"aide"+"\t\t"+"budget"+"\n");
		for(int i=0;i<tableau.length;i++) {
			for(int j=0;j<tableau[0].length;j++) {
				System.out.print(tableau[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private void init(String[][] tab, int i,Etudiant etudiant,Demande demande,String budget) {
		tab[i][0]=etudiant.getNom(); 
		tab[i][1]=etudiant.getPrenom();
		tab[i][2]=etudiant.getNumDossier();
		tab[i][3]=demande.getTypeDemande();
		tab[i][4]=budget;
	}
	private int calculbudget(String[][] tableau) {
		int budget=0;
		for(int i=0;i<tableau.length;i++) {
			budget+=Integer.parseInt(tableau[i][4]);
		}
		assert budget>0:"budget inchangé";
		return budget;
	}
	public static void main(String[] args) {
			int LIGNE=4;
			final int COL = 5;
			String[][] tableau2020 = new String[LIGNE][COL];
			Etudiant pierre = new Etudiant("FILK","Pierre","456879");
			Etudiant jack = new Etudiant("YANG","Jack","575421");
			Etudiant francis = new Etudiant("PAGE","Francis","154329");
			Etudiant wendi = new Etudiant("ITTES","Wendi","251332");
			Demande aideSociale = new Demande("aide sociale");
			Demande aideLogement = new Demande("aide logement");
			Demande aideProjet = new Demande("aide projet");
			Main main = new Main();
			for(int i=0;i<LIGNE;i++) {
				switch(i) {
					case 0:
						main.init(tableau2020,0,pierre,aideSociale,"1024");
						break;
					case 1:
						main.init(tableau2020,1,jack,aideSociale,"1240");
						break;
					case 2:
						main.init(tableau2020,2,francis,aideLogement,"975");
						break;
					case 3:
						main.init(tableau2020,3,wendi,aideProjet,"1200");
						break;
					default:
						System.out.println("Erreur initialisation");
						break;
				}
			}
			
			main.affichage(tableau2020,2020);
			System.out.println("budget alloué en 2020: "+main.calculbudget(tableau2020)+"€\n");
			
		LIGNE=5;

		String[][] tableau2021 = new String[LIGNE][COL];
		Etudiant crystal = new Etudiant("MANDA","Crystal","124832");
		Etudiant myriam = new Etudiant("SEYMOUR","Myriam","742132");
		Etudiant savino = new Etudiant("DELFA","Savino","212344");
		Etudiant clohe = new Etudiant("MAIRE","Clohe","231354");
		Etudiant gui = new Etudiant("OMY","Gui","801137");
		
		for(int i=0;i<LIGNE;i++) {
			switch(i) {
				case 0:
					main.init(tableau2021,0,crystal,aideSociale,"2000");
					break;
				case 1:
					main.init(tableau2021,1,myriam,aideLogement,"945");
					break;
				case 2:
					main.init(tableau2021,2,savino,aideProjet,"800");
					break;
				case 3:
					main.init(tableau2021,3,clohe,aideSociale,"1300");
					break;
				case 4:
					main.init(tableau2021,4,gui,aideProjet,"705");
					break;
					
				default:
					System.out.println("Erreur initialisation");
					break;
			}
		}
		
		main.affichage(tableau2021, 2021);
		System.out.println("budget alloué en 2021: "+main.calculbudget(tableau2021)+"€\n");
		
		LIGNE = 6;
		String[][] tableau2022 = new String[LIGNE][COL];
		Etudiant janis = new Etudiant("ERIK","Janis","543871");
		Etudiant renan = new Etudiant("XERC","Renan","521054");
		Etudiant ingrid = new Etudiant("HAL","Ingrid","206431");
		Etudiant stacey = new Etudiant("JOPL","Stacey","231054");
		Etudiant richard = new Etudiant("GING","Richard","962042");
		Etudiant nicolau = new Etudiant("GWEN","Nicolau","710241");
		
		for(int i=0;i<LIGNE;i++) {
			switch(i) {
				case 0:
					main.init(tableau2022,0,janis,aideProjet,"1000");
					break;
				case 1:
					main.init(tableau2022,1,renan,aideLogement,"786");
					break;
				case 2:
					main.init(tableau2022,2,ingrid,aideLogement,"620");
					break;
				case 3:
					main.init(tableau2022,3,stacey,aideSociale,"2100");
					break;
				case 4:
					main.init(tableau2022,4,richard,aideLogement,"500");
					break;
				case 5:
					main.init(tableau2022,5,nicolau,aideSociale,"1100");
					break;
					
				default:
					System.out.println("Erreur initialisation");
					break;
			}
		}
		
		main.affichage(tableau2022, 2022);
		System.out.println("budget alloué en 2022: "+main.calculbudget(tableau2022)+"€");
	}

}
