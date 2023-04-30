//this file defines the effort log
package database;

//captalized the class name because it bothered me - im sorry -AK
public class EffortLog extends Log {
    public String name; //added the name attribute -AK
    public String projTitle;
    public String lifeCycleStep;
    public String category;
    public String deliverable;
    public String userStoryComments;
    public int storyPoints;

    public EffortLog(){
        this.name = "";//changed null to empty string cuz it made more sense -AK
        this.projTitle = "";
        this.lifeCycleStep = "";
        this.category = "";
        this.deliverable = "";
        this.userStoryComments = "";
        this.storyPoints = -1;
    }

    public EffortLog(String name, String projTitle, String lifeCycle, String category, String deliverable, String userStory, int storyPoints){
        this.name = name; //initializing the name attribute -AK
        this.projTitle = projTitle;
        this.lifeCycleStep = lifeCycle;
        this.category = category;
        this.deliverable = deliverable;
        this.userStoryComments = userStory;
        this.storyPoints = storyPoints;
    }

    
    public EffortLog editLog(String name, String projTitle, String lifeCycle, String category, String deliverable, String userStory, int storyPoints){
        EffortLog updatedLog = new EffortLog(name, projTitle, lifeCycle, category, deliverable, userStory, storyPoints);
        return updatedLog;
    }

    public String returnName() //added a getter for name -AK
    {
        return this.name;
    }

    public String returnProjectTitle() {
        return projTitle;
    }

    public String returnLifeCycleStep() {
        return lifeCycleStep;
    }

    public String returnCategory() {
        return category;
    }

    public String returnDeliverable() {
        return deliverable;
    }

    public String returnUserStoryComments() {
        return userStoryComments;
    }

    public int returnStoryPoints() {
        return storyPoints;
    }
}

