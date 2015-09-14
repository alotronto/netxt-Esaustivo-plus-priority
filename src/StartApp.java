
public class StartApp {

	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.out.println("Inserisci il numero di interventi da schedulare suddivisi per provincia"); 
		}
		else{
			Utility.initInterventiRandom(Integer.valueOf(args[0]),Integer.valueOf(args[1]),Integer.valueOf(args[2]));
			//Utility.initInterventi();
			Utility.initSquadre();
			long startTime = System.currentTimeMillis();
			int totalInt = Integer.valueOf(args[0]) + Integer.valueOf(args[1]) + Integer.valueOf(args[2]);
			Utility.getAllSolution(4, totalInt);
			long estimatedTime = System.currentTimeMillis() - startTime;
			System.out.println("Tempo impiegato:"+estimatedTime);
			Utility.openFile(Utility.dirName+"/execution_time");
			Utility.printToFile("Tempo impiegato:"+estimatedTime);
			Utility.closefile();
		}
	}
}
