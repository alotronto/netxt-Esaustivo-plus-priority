
public class StartApp {

	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Inserisci il numero di interventi da schedulare"); 
		}
		else{
			Utility.initInterventiRandom(Integer.valueOf(args[0]));
			//Utility.initInterventi();
			Utility.initSquadre();
			long startTime = System.currentTimeMillis();
			Utility.getAllSolution(4, Integer.valueOf(args[0]));
			long estimatedTime = System.currentTimeMillis() - startTime;
			System.out.println("Tempo impiegato:"+estimatedTime);
			Utility.openFile(Utility.dirName+"/execution_time");
			Utility.printToFile("Tempo impiegato:"+estimatedTime);
			Utility.closefile();
		}
	}
}
