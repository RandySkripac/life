
/**
 * Goal Achieving application.
 *
 * This is a program developed to help the dumbass, Randy Skripac, achieve his
 * life goals. It uses an ArrayList and other global variables to determine what Randy
 * should do today.
 *
 * @author Randy Skripac
 *
 */
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Life {
    //arraylist that holds current life goals that need time
    public static ArrayList<String> goals = new ArrayList<String>();
    //Websites to check at beginning of day
    public static ArrayList<String> StartingSites = new ArrayList<String>();
    //The hours of the day:
    public static String[] hours = new String[24];
    //Workouts to get_big
    public static ArrayList<Workout> Exercises = new ArrayList<Workout>();
    //Courses
    public static ArrayList<String> Courses = new ArrayList<String>();
    
    /*This boolean determines if it's a work day or not. Not necessarily a week day or job day, but a day 
     * where I need 8 hours for a task.
     * */
    public static boolean WorkDay = false;
     
    //This method sets up goals and StartingSites
    public static void SetUp() {
        //these are broad or need extra planning
        goals.add("get_big");
        goals.add("eat_right");
      //these are available for randomness each day
        goals.add("golf");
        goals.add("grades/career");
        goals.add("music");
        goals.add("video_games");
        goals.add("punting");
        goals.add("movies");
        goals.add("baseball");
        goals.add("basketball");
        goals.add("soccer");
        //Courses
        Courses.add("Willow Run");
        Courses.add("Glenross");
        Courses.add("Raymond Memorial");
        Courses.add("Turnberry");
        Courses.add("Scarlet");
        Courses.add("New Albany Golf Links");
        Courses.add("Raccoon International");
        Courses.add("Natinal Golf Links");
        Courses.add("Wilson Road");
        Courses.add("Airport Golf Course");
        Courses.add("Safari Golf Club");
        Courses.add("Mentel");
        Courses.add("Rolling Meadows");
        Courses.add("Homestead Springs");
        Courses.add("The Links at Groveport");
        Courses.add("Willow Run");
        
        //Sleeping will be from midnight till 8am
        for (int i=0; i<8; i++) {
        	hours[i] = "Sleep";
        }
        //Morning routine
        hours[8]  = "Food/Clean/Brush/Stretch";
        //Lunch
        if (!WorkDay) {
        	hours[14] = "Lunch";
        	for (int i = 20; i<24;i++ ) {
        		hours[i] = "free";
        	}
        }else {
        	for(int i = 9;i<17;i++) {
        		hours[i] = "work";
        	}
        }
        hours[17] = "dinner";
        StartingSites.add("fantasy");
        StartingSites.add("eating");
        StartingSites.add("gmail");
        
        Workout splitSquat = new Workout("splitSquat",2,3,20,"Put one foot on a chair, and the other on the ground. While holding dumbells, do a squat");
        Exercises.add(splitSquat);
        Workout pushup = new Workout("pushup",1,4,80,"You know how to do pushups");
        Exercises.add(pushup);
        Workout curl = new Workout("curl",1,4,20,"10 each arm");
        Exercises.add(curl);
        Workout crunch = new Workout ("crunch",1,2,50,"dont let your lower back come off the ground. You should feel it in your upper abs.");
        Exercises.add(crunch);
        Workout sixInches = new Workout ("sixInches",1,2,60,"in seconds");
        Exercises.add(sixInches);
        Workout slDeadlift = new Workout ("slDeadlift",2,3,15,"straight legs, use lower back to lift up dumbells in hands.");
        Exercises.add(slDeadlift);
        // put all workouts in exercises array
        
    }

    //This class serves as a template for golf workouts
    public static class GolfWorkout {
        boolean atHome = false;
        String club = "";
        int time = -1;
        int shots = -1;
        ArrayList<String> tools = new ArrayList<String>();
        String instr = "";
    }

    //This method sets up golf workouts
    public static void GolfWorkouts() {
        ArrayList<GolfWorkout> golfWorkouts = new ArrayList<GolfWorkout>();
        //Create putting workout for in room
        GolfWorkout mattPutting = new GolfWorkout();
        mattPutting.atHome = true;
        mattPutting.club = "Putter";
        mattPutting.time = 15;
        mattPutting.tools.add("puttingMatt");
        mattPutting.instr = "Putt for 15 min. mix lengths";
        golfWorkouts.add(mattPutting);

    }

    
    
    //This class is for workouts to help with get_big
    public static class Workout{
    	
    	/* Day 1: arms/chest/abs
    	 * Day 2: legs legs back
    	 * Day 3 cardio
    	 * These three days are repeated and decided based on the day of the week
    	 * */
    	public String name;
    	public  int day;
    	public  int sets;
    	public  int reps;
    	public  String description;
		Workout (String name1, int day1 ,int sets1, int reps1, String description1){
			this.name = name1;
			this.day = day1;
			this.sets = sets1;
			this.reps = reps1;
			this.description = description1;
    	}
    }
    
    public static void main(String[] args) {
    	
    	//Determine if it's a workday (Again, doesn't need to be working at a job, just any task that takes up an entire day)
    	System.out.print("Is it a workday? (Y/N):  ");
    	Scanner in = new Scanner(System.in);
    	String input = in.nextLine();
    	while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("N") ) { 
    		System.out.print("Not correct input. Is it a workday? (Y/N)");
    		input = in.nextLine();
    	}
    	if (input.equalsIgnoreCase("Y")) {
    		WorkDay = true;
    	}
    	// call Setup
    	SetUp();
    	
    	//Course selection
    	String course = "";
    	
    	//Plan Workout
    	
    	int day = 0;
    	 Date today = new Date();
         SimpleDateFormat df = new SimpleDateFormat("E");
         if (df.format(today).contentEquals("Mon") || df.format(today).contentEquals("Thu")) {
         	day = 1;
         	hours[22] = "Workout";
         }else if (df.format(today).contentEquals("Tue") || df.format(today).contentEquals("Fri")) {
         	day = 2;
         	hours[22] = "Workout";
         }else if (df.format(today).contentEquals("Wed") || df.format(today).contentEquals("Sat")) {
         	day = 3;
         	hours[22] = "Workout";
         }else {
         	hours[22] = "free";
         }
    	
    	
    	//Decide which goals to pursue today
        
        
        
        int min = 2; 
        int max = goals.size() - 1;
        //First goal to be worked on
        int activity1 = (int) Math.floor(Math.random() * (((max - min) + 1)) + min);
        //If it's a workday and we're golfing, then we only have time for golf. 
        if (WorkDay) {
        	if(goals.get(activity1).equals("golf")){
        		for(int i = 17;i<22;i++) {
        			hours[i] = "golf";
        		}
        		hours[23] = "free";
        	//if it's not golf we'll have a little more free time
        	}else {
        		hours[18] = goals.get(activity1);
        		hours[19] = goals.get(activity1);
        		hours[20] = "free";
        	}
        }
        
        
        if (!WorkDay) {
        	//On non work days we have more time, so there's three activities
        	int activity2 = (int) Math.floor(Math.random() * (((max - min) + 1)) + min);
            while (activity1 == activity2) {
            	 activity2 = (int) Math.floor(Math.random() * (((max - min) + 1)) + min);
            }
            
            int activity3 = (int) Math.floor(Math.random() * (((max - min) + 1)) + min);
            while (activity3 == activity2 || activity3 == activity1) {
            	 activity3 = (int) Math.floor(Math.random() * (((max - min) + 1)) + min);
            }
            //All of that was to make sure we don't have two activities that are the same
            
        	if(goals.get(activity1).equals("golf") || (goals.get(activity2).equals("golf")) || (goals.get(activity3).equals("golf"))) {
        		int second;
        		int third;
        		if(goals.get(activity1).equals("golf")) {
        			second = activity2;
        			third = activity3;
        		}else if (goals.get(activity2).equals("golf")) {
        			second = activity1;
        			third = activity3;
        		}else {
        			second = activity1;
        			third = activity2;
        		}
        		int rand = (int) Math.floor(Math.random() * ((((Courses.size()-1) - 0) + 1)) + 0);
        		course = Courses.get(rand);
        		System.out.println(course);
        		hours[9] = "golf";
        		hours[10] = "golf";
        		hours[11] = "golf";
        		hours[12] = "golf";
        		hours[13] = "golf";
        		hours[14] = "lunch";
        		hours[15] = goals.get(second);
        		hours[16] = goals.get(second);
        		hours[18] = goals.get(third);
        		hours[19] = goals.get(third);
        		hours[20] = "free";
        		//All of this takes care of the occurrence of golf in any of the activities
        		
        	}else {
        		hours[9] = "free";
        		hours[10] = "free";
        		hours[11] = "free";
        		hours[12] = goals.get(activity1);
        		hours[13] = goals.get(activity1);
        		hours[14] = "lunch";
        		hours[15] = goals.get(activity2);
        		hours[16] = goals.get(activity2);
        		hours[18] = goals.get(activity3);
        		hours[19] = goals.get(activity3);
        	}
        }
        hours[21] = "free";
        hours[23] = "free";
       //All the hours are assigned a task at this point
        
        for (int i =0; i<24; i++) {
        	System.out.println(i + "--" + hours[i]);
        }
        
        if (day != 0) {
        	for(int i = 0; i<Exercises.size(); i++) {
        		if (Exercises.get(i).day == day) {
        			System.out.println(Exercises.get(i).name + ": " + Exercises.get(i).sets + " x " + Exercises.get(i).reps);
        		}
        	}
        }
        in.close();
    }
}
