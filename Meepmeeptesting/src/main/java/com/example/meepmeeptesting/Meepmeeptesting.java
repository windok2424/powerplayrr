package com.example.meepmeeptesting;
import com.acmerobotics.roadrunner.geometry.*;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;


/* Notes:
when adding displacement marker code remove the .waitSeconds() functions
Make seperate trajectory for the cycle, not just copy and paste
Make the path backward smooth
Add displacement marker code
Optimize path if it runs into a ground junction
*/


public class Meepmeeptesting {
    public static void main(String[] args) {


        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)

                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-35, -62, 0))
                                .strafeLeft(15)
                                .waitSeconds(0.5)
                                .strafeLeft(1)
                                .addDisplacementMarker(() -> {
                                    // color sensor code

                                })
                                .splineToConstantHeading(new Vector2d(-30, 0), Math.toRadians(40))
                                .addDisplacementMarker(() -> {
                                    // drop cone code
                                })
                                .waitSeconds(0.5)
                                .setReversed(true)
                                .addDisplacementMarker(() -> {
                                    // turn claw backward code
                                    // move linear slide down to cone level code
                                })
                                .splineToConstantHeading(new Vector2d(-45, -12), Math.toRadians(170))
                                .back(17)
                                .addDisplacementMarker(() -> {
                                    // grab cone code
                                })
                                .waitSeconds(1)
                                .forward(17)
                                .splineToConstantHeading(new Vector2d(-30, 0), Math.toRadians(60))
                                .addDisplacementMarker(() -> {
                                    // drop cone code
                                })
                                .waitSeconds(0.5)










                                .addDisplacementMarker(() -> {
                                    // turn claw backward code
                                    // move linear slide down to cone level code
                                })
                                .splineToConstantHeading(new Vector2d(-45, -12), Math.toRadians(170))
                                .back(17)
                                .addDisplacementMarker(() -> {
                                    // grab cone code
                                })
                                .waitSeconds(1)
                                .forward(17)
                                .splineToConstantHeading(new Vector2d(-30, 0), Math.toRadians(60))
                                .addDisplacementMarker(() -> {
                                    // drop cone code
                                })
                                .waitSeconds(0.5)
                                .addDisplacementMarker(() -> {
                                    // turn claw backward code
                                    // move linear slide down to cone level code
                                })
                                .splineToConstantHeading(new Vector2d(-45, -12), Math.toRadians(170))
                                .back(17)
                                .addDisplacementMarker(() -> {
                                    // grab cone code
                                })
                                .waitSeconds(1)
                                .forward(17)
                                .splineToConstantHeading(new Vector2d(-30, 0), Math.toRadians(60))
                                .addDisplacementMarker(() -> {
                                    // drop cone code
                                })
                                .waitSeconds(0.5)
                                .addDisplacementMarker(() -> {
                                    // turn claw backward code
                                    // move linear slide down to cone level code
                                })
                                .splineToConstantHeading(new Vector2d(-45, -12), Math.toRadians(170))
                                .back(17)
                                .addDisplacementMarker(() -> {
                                    // grab cone code
                                })
                                .waitSeconds(1)
                                .forward(17)
                                .splineToConstantHeading(new Vector2d(-30, 0), Math.toRadians(60))
                                .addDisplacementMarker(() -> {
                                    // drop cone code
                                })



                                .back(5)
                                .strafeRight(34)
                                .forward(23)
                                .waitSeconds(3)









                                .build()
                );



        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }




}

