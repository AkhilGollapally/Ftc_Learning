package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;





@Disabled
@TeleOp
public class IfPractice extends OpMode {


    @Override
    public void init() {



    }

    @Override
    public void loop() {
        double motorSpeed = gamepad1.left_stick_y;


        if(!gamepad1.a){
            motorSpeed *= 2;
            telemetry.addData("A button", "Not Pressed!");
        }
        else if (gamepad1.a && gamepad1.b){
            motorSpeed *= 0.25;
            telemetry.addData("A button and B button", "Have been pressed!");

        }
        else if (gamepad1.b && gamepad1.left_trigger_pressed){
            motorSpeed *= 0.125;
            telemetry.addData("B Button and left trigger","Have been pressed!");
        }
        else if (gamepad1.b && gamepad1.right_trigger_pressed){
            motorSpeed *= 8;
            telemetry.addData("B button and right trigger", "Have been pressed!");
        }
        else if (gamepad1.left_trigger>0.1 && gamepad1.right_trigger>0.1){
            telemetry.addData("Hi","I did something random!!");
        }
        else {
            motorSpeed *= 0.5;
        }









        telemetry.addData("Left Stick value", motorSpeed);

    }
}
