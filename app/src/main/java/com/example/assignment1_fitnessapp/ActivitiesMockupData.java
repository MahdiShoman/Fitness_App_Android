package com.example.assignment1_fitnessapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class ActivitiesMockupData {


        List<Activity> activities = new ArrayList<>();
        Context context ;
        ActivitiesMockupData (){
            activities.add(new Activity("Push Up",2,"1. Start Position:\n" +
                    "\n" +
                    "Get on the floor with your hands a little wider than your shoulders.\n" +
                    "Keep your body in a straight line from head to heels.\n" +
                    "2. Lower Down:\n" +
                    "\n" +
                    "Bend your elbows to slowly lower your chest toward the floor.\n" +
                    "Stop when your chest is just above the ground.\n" +
                    "3. Push Up:\n" +
                    "\n" +
                    "Push through your hands to lift your body back up to the starting position." , R.drawable.img_1 , "https://i.pinimg.com/originals/fd/bb/09/fdbb092b58863e5c86fdb8bb1411fcea.gif"));

            activities.add(new Activity("Squat  ",1,
                    "1. Stand with feet a little wider than hip-width, toes slightly pointing out.\n" +
                            "2. Reach your arms forward to help you balance.\n" +
                            "3. Bend your knees and push your hips back like you're sitting down in a chair.\n" +
                            "4. Keep your chest up and look forward.\n" +
                            "5. Go down until your thighs are parallel to the floor, or as low as you can comfortably go.\n" +
                            "6. Push through your heels to stand back up.", R.drawable.img_2 ,"https://i.pinimg.com/originals/39/6e/b8/396eb8e10ae03320e718152d6a743206.gif"));

            activities.add(new Activity("Plank",5,"Get in Position:\n" +
                    "\n" +
                    "Lie face down on the floor.\n" +
                    "Place your forearms on the ground, with elbows directly under your shoulders.\n" +
                    "Lift your body so you're balancing on your forearms and toes.\n" +
                    "Hold the Position:\n" +
                    "\n" +
                    "Keep your body in a straight line from head to heels.\n" +
                    "Tighten your core and don’t let your hips drop or rise.\n" +
                    "Breathe and Hold:\n" +
                    "\n" +
                    "Hold this position for as long as you can while keeping good form.\n" +
                    "Start with 20–30 seconds, and work your way up as you get stronger." , R.drawable.img_3 , "https://hips.hearstapps.com/hmg-prod/images/workouts/2016/08/plankup-1472132527.gif"));


            activities.add(new Activity("jumping jack ",3,"Start Position:\n" +
                    "\n" +
                    "Stand up straight with your feet together and arms by your sides.\n" +
                    "Jump and Spread:\n" +
                    "\n" +
                    "Jump up and spread your feet out wide.\n" +
                    "At the same time, raise your arms over your head.\n" +
                    "Jump Back:\n" +
                    "\n" +
                    "Jump again to bring your feet back together.\n" +
                    "Lower your arms back to your sides.\n" +
                    "Repeat:\n" +
                    "\n" +
                    "Keep jumping and bringing your arms and legs out and in." , R.drawable.img_4 ,"https://media0.giphy.com/media/Q99GBwBKFB5I3AhR9Z/giphy.gif"));

        }
/*
    Activity getActivity(int activityNumber){

        return
    }*/





}
