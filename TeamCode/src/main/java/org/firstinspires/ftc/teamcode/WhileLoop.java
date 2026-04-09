package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class WhileLoop extends OpMode {

    @Override
    public void init() {
        double LeftTrigger = gamepad1.left_trigger;
        while (LeftTrigger < 1) {
            telemetry.addData("Left Trigger value is",LeftTrigger);
            LeftTrigger += 0.1;

        }

    }


    public void loop() {

    }
}
