/**
 * 
 */
package br.edu.cm.utfpr.scodetool.entities;

/**
 * @author Paulo
 *
 */
public class Event {
    private String label;
    private double times;
    private double termFrequency;
    private double inverseDocumentFrequency;
    private double termFrequencyInverseDocumentFrequency;
    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }
    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /**
     * @return the times
     */
    public double getTimes() {
        return times;
    }
    /**
     * @param times the times to set
     */
    public void setTimes(double times) {
        this.times = times;
    }
    /**
     * @return the termFrequency
     */
    public double getTermFrequency() {
        return termFrequency;
    }
    /**
     * @param termFrequency the termFrequency to set
     */
    public void setTermFrequency(double termFrequency) {
        this.termFrequency = termFrequency;
    }
    /**
     * @return the inverseDocumentFrequency
     */
    public double getInverseDocumentFrequency() {
        return inverseDocumentFrequency;
    }
    /**
     * @param inverseDocumentFrequency the inverseDocumentFrequency to set
     */
    public void setInverseDocumentFrequency(double inverseDocumentFrequency) {
        this.inverseDocumentFrequency = inverseDocumentFrequency;
    }
    /**
     * @return the termFrequencyInverseDocumentFrequency
     */
    public double getTermFrequencyInverseDocumentFrequency() {
        return termFrequencyInverseDocumentFrequency;
    }
    /**
     * @param termFrequencyInverseDocumentFrequency the termFrequencyInverseDocumentFrequency to set
     */
    public void setTermFrequencyInverseDocumentFrequency(
            double termFrequencyInverseDocumentFrequency) {
        this.termFrequencyInverseDocumentFrequency = termFrequencyInverseDocumentFrequency;
    }
    
    
}
