
/**
 * Goal Achieving application.
 *
 * This is a program developed to help the dumbass, Randy Skripac, achieve his
 * life goals. It uses an ArrayList and other global variables to determine what Randy
 * should do today.
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
    
    public static int day = 0;
     
    //This method sets up goals and StartingSites
    public static void SetUp() {
        //these are broad or need extra planning
        goals.add("get_big");
        goals.add("eat_right");
        //these are available for randomness each day
        goals.add("golf");
        //goals.add("grades/career");
        //goals.add("music");
        goals.add("video_games");
        //goals.add("punting");
        goals.add("movies");
        goals.add("baseball");
        //goals.add("basketball");
        //goals.add("soccer");
        //goals.add("Bally");
        goals.add("Soma");
        //goals.add("League");
        //goals.add("TV");
        goals.add("somethingNew");
        //goals.add("discGolf");
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
       
        
        //Sleeping will be from 22 till 6
        for (int i=0; i<6; i++) {
        	hours[i] = "Sleep";
        }
        for (int i=22; i<24; i++) {
        	hours[i] = "Sleep";
        }
        if (!WorkDay) {
        	for (int i = 9; i<16;i++ ) {
        		hours[i] = "free";
        	}
        }else {
        	for(int i = 9;i<16;i++) {
        		hours[i] = "work";
        	}
        	
        }
        
        
        if (day ==2) {
		    //Got to work out in the morning so that equipment is available. 
		    hours[6]  = "Abs/Food/Clean/Brush/Stretch";
		    hours[7] = "workout";
		    hours[8] = "workout";
		    
        }else if (day == 1) {
		    //Morning routine
		    hours[6]  = "sleepIn";
		    hours[7] = "sleepIn";
		    hours[8] = "sleepIn";
		    hours[9] = "Food/Clean/Brush/Stretch";
		    hours[11]  =  "Pushups";
        }else if (day == 3) {
		    //Morning routine
		    hours[6]  = "sleepIn";
		    hours[7] = "sleepIn";
		    hours[8] = "Food, Brush, Clean, Stretch";
		    hours[10] = "Pushups";
        }else if (day == 4) {
		    //Morning routine
		    hours[6]  = "sleepIn";
		    hours[7] = "Food, Brush, Clean, Stretch";
		    hours[8] = "Workout";
		    hours[9] = "Workout";
        }else if (day == 5) {
		    //Morning routine
		    hours[6]  = "sleepIn";
		    hours[7] = "sleepIn";
		    hours[8] = "food, brush, clean, stretch";
		    hours[9] = "Workout";
		    hours[10] = "Workout";
        }else {
        	for(int i = 6;i<8;i++) {
        		hours[i] = "sleepIn";
        	}
        	hours[8] = "Abs/Food/Clean/Brush/Stretch";
        	
        }
        hours[16] = "free";
        hours[12] = "Lunch";
        hours[17] = "dinner";
        hours[20] = "free";
        hours[21] = "read";
        StartingSites.add("fantasy");
        StartingSites.add("eating");
        StartingSites.add("gmail");
        

        Workout warmUp = new Workout("hips, quads, hams",2,3,8,"");
        Exercises.add(warmUp);
        Workout snatchPulls = new Workout("snatchPulls",2,3,6,"keep your back straight, do a deadlift and jump with a shoulder shrug.\n");
        Exercises.add(snatchPulls);
        Workout backSquat = new Workout("backSquat",2,4,8,"go lower, do less weight.\n");
        Exercises.add(backSquat);
        Workout lunges = new Workout("lunges",2,4,8,"be explosive. Do cycle lunges after with no weight (alternate quilckly).\n");
        Exercises.add(lunges);
        Workout jumpSquat = new Workout("backSquat",2,4,10,"jump with dumbells (jump directly into next rep)\n");
        Exercises.add(jumpSquat);
        Workout pushup = new Workout("pushup",1,4,50,"You know how to do pushups\n");
        Exercises.add(pushup);
        Workout pushup2 = new Workout("pushup",3,4,50,"You know how to do pushups\n");
        Exercises.add(pushup2);
        Workout bicepts = new Workout("bicepts",5,4,12,"do any bicept workouts\n");
        Exercises.add(bicepts);
        Workout back = new Workout("back",5,4,12,"do any back workouts\n");
        Exercises.add(back);
        //Workout abs = new Workout ("crunch",2,2,50,"dont let your lower back come off the ground. You should feel it in your upper abs.");
        //Exercises.add(crunch);
        //Workout sixInches = new Workout ("sixInches",2,2,60,"in seconds");
        //Exercises.add(sixInches);
        Workout warmUp2 = new Workout("hips, quads, hams",4,3,8,"");
        Exercises.add(warmUp2);
        Workout splitSquat = new Workout("splitSquat",4,3,12,"While holding dumbells, do a squat w/ one leg. Split cycle jumps in between.\n");
        Exercises.add(splitSquat);
        Workout boxJumps = new Workout("boxJumps",4,4,12,"jump up and do the one where you fall and then jump\n");
        Exercises.add(boxJumps);
        //Workout cardio = new Workout ("cardio",3,1,60,"go do something");
        //Exercises.add(cardio);
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
    	
    	//Determine if it's a workday (Again, doesn't need to be working at a job, just any task that improves me at something)
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
    	
    	
    	//Course selection
    	String course = "";
    	
    	//Plan Workout
    	
    	 
    	 Date today = new Date();
         SimpleDateFormat df = new SimpleDateFormat("E");
         if (df.format(today).contentEquals("Mon") ) {
         	day = 1;
         	
         }else if (df.format(today).contentEquals("Tue") ) {
         	day = 2;
         	
         }else if (df.format(today).contentEquals("Thu")){
        	 day = 3;
    	 }else if (df.format(today).contentEquals("Fri") ) {
         	day = 4;
         	
         }else if (df.format(today).contentEquals("Sat") ) {
          	day = 5;
         	
         } 
        // call Setup
     	SetUp();
    	//Decide which goals to pursue today
        
        
        
        int min = 2; 
        int max = goals.size() - 1;
        //First goal to be worked on
        int activity1 = (int) Math.floor(Math.random() * (((max - min) + 1)) + min);
        //If it's a workday and we're golfing, then we only have time for golf. 
        if (WorkDay) {
        	if(goals.get(activity1).equals("golf")){
        		for(int i = 15;i<19;i++) {
        			hours[i] = "golf";
        		}
        		if (day == 0) {
        			hours[19] = "free";
        		}else {
        			hours[19] = "workout";
        		}
        		
        	//if it's not golf we'll have a little more free time
        	}else {
        		hours[17] = goals.get(activity1);
        		hours[18] = goals.get(activity1);
        		hours[19] = "free";
        		
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
        		
        		hours[7] = "workout";
        		hours[8] = "workout";
        		hours[9] = "golf";
        		hours[10] = "golf";
        		hours[11] = "golf";
        		hours[12] = "golf";
        		hours[13] = "golf";
        		hours[14] = "lunch";
        		hours[16] = goals.get(second);
        		hours[17] = goals.get(second);
        		hours[18] = goals.get(third);
        		hours[19] = goals.get(third);
        		
        		//All of this takes care of the occurrence of golf in any of the activities
        		
        	}else {
        		
        		hours[10] = "free";
        		hours[11] = "free";
        		hours[13] = goals.get(activity1);
        		hours[14] = goals.get(activity1);
        		hours[16] = goals.get(activity2);
        		hours[17] = goals.get(activity2);
        		hours[18] = goals.get(activity3);
        		hours[19] = goals.get(activity3);
        		
        	}
        }
        
       //All the hours have been assigned a task at this point, so we can just print them to the console
        
        for (int i =0; i<24; i++) {
        	System.out.println(i + "--" + hours[i]);
        }
        
        
        //This prints out what workout I have to do today if any
        if (day != 0) {
        	for(int i = 0; i<Exercises.size(); i++) {
        		if (Exercises.get(i).day == day) {
        			System.out.println(Exercises.get(i).name + ": " + Exercises.get(i).sets + " x " + Exercises.get(i).reps);
        			System.out.println(Exercises.get(i).description);
        		}
        	}
        	
        }
        System.out.println("Do the app's abs exercises every other day");
        in.close();
    }
}
