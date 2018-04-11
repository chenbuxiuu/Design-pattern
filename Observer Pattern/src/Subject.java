import java.util.ArrayList;
import java.util.List;

public class Subject {
    
   private List<Observer> observers 
      = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }
   // 状态更新时通知所有订阅者
   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   // 订阅
   public void attach(Observer observer){
      observers.add(observer);        
   }
   // 通知
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   }     
}