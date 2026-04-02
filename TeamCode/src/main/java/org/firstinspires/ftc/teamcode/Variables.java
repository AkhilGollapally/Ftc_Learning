package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;



@Disabled
@Autonomous
public class Variables extends OpMode {

    @Override
    public void init() {
        int TeamNumber = 12345;
        String TeamName1 = "Beta Bionix";
        String TeamName2 = "Alpha Intelligence";
        float MotorSpeed = 0.75f;
        boolean ClawClosedStatus = false;
        int MotorAngle = 177;

        telemetry.addData("Team Number" , TeamNumber);
        telemetry.addData("The name of team 1 is" , TeamName1);
        telemetry.addData("The name of team 2 is" , TeamName2);
        telemetry.addData("The motor speed of Beta Bionix's robot is" , MotorSpeed);
        telemetry.addData("Is it true that Alpha Intelligence's claw closed?" , ClawClosedStatus);
        telemetry.addData("Beta Bionix's motor angle is at ", MotorAngle);





    }

    @Override
    public void loop() {

    }
}

