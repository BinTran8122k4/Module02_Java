package ss4_class_doi_tuong_trong_java.bai_tap.stop_watch;

import java.util.Date;

public class Watch {
   private long startTime;
   private long endTime;



   public Watch() {
      this.startTime = new Date().getTime();
   }
   public void start(){
      this.startTime = new Date().getTime();
   }
   public void stop(){
      this.endTime = new Date().getTime();
   }
   public long getElapsedTime(){
      return this.endTime - this.startTime;
   }
}
