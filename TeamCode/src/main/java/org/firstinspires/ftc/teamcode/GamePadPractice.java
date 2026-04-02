package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;



@Disabled
@TeleOp
public class GamePadPractice extends OpMode {


    @Override
    public void init() {

    }

    @Override
    public void loop() {
        // runs 50 times a second
        double speedForward = -gamepad1.left_stick_y / 2;
        double Difference = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double Sum = gamepad1.left_trigger + gamepad1.right_trigger;
        double ProductX = gamepad1.left_stick_x * gamepad1.right_stick_x;
        double ProductY = gamepad1.left_stick_y * gamepad1.left_stick_y;


        telemetry.addData("lx",gamepad1.left_stick_x);
        telemetry.addData("ly",speedForward);
        telemetry.addData("a button" , gamepad1.a);
        telemetry.addData("rx",gamepad1.right_stick_x);
        telemetry.addData("ry",gamepad1.right_stick_y);
        telemetry.addData("b button", gamepad1.b);
        telemetry.addData("This is the difference between the left joystick x value and the right joystick x value.",Difference);
        telemetry.addData("This is the sum of the values of both triggers on the controllers.",Sum);
        telemetry.addData("This is the product of both X values of the joysticks.", ProductX);
        telemetry.addData("This is the product of both y values of the joysticks",ProductY);

    }
}
