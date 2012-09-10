package cz.cuni.mff.d3s.deeco.provider;

import java.util.List;

import cz.cuni.mff.d3s.deeco.invokable.SchedulableProcess;
import cz.cuni.mff.d3s.deeco.knowledge.ComponentKnowledge;
import cz.cuni.mff.d3s.deeco.knowledge.KnowledgeManager;

public abstract class AbstractDEECoObjectProvider {

	protected List<SchedulableProcess> processes;
	protected List<ComponentKnowledge> knowledges;	
	protected KnowledgeManager km;
	
	public void setKnowledgeManager(KnowledgeManager km) {
		if (km != this.km) {
			processes = null;
			knowledges = null;
			this.km = km;
		}
	}
	
	public KnowledgeManager getKnowledgeManager() {
		return km;
	}
	
	public List<SchedulableProcess> getProcesses() {
		if (processes == null)
			processProcesses();
		return processes;
	}
	
	public List<ComponentKnowledge> getKnowledges() {
		if (knowledges == null)
			processKnowledges();
		return knowledges;
	}
	
	abstract protected void processKnowledges();
	
	abstract protected void processProcesses();

}