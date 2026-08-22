package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class GamepadRefresh extends OpMode {

    @Override
    public void init() {
        if(gamepad1.b && -gamepad1.left_stick_y>0.5){

        }

    }



    @Override
    public void loop() {




        telemetry.addData("x",gamepad1.left_stick_x);
        telemetry.addData("y",gamepad1.left_stick_y);
        telemetry.addData("a button",gamepad1.a);
        telemetry.addData("b button",gamepad1.b);
    }
}
