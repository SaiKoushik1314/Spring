package voting.practice;

public class VotingMachineService {

	VotingInterface voting;

	public void getVoting() {
		System.out.println(voting.showVotingMachine());	}

	public void setVoting(VotingInterface votinga) {
		this.voting = votinga;
	}
	
	
}
