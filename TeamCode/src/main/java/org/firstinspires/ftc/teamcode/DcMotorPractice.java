package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.testBench;

@TeleOp
public class DcMotorPractice extends OpMode {
    testBench bench = new testBench();


    @Override
    public void init() {
        bench.init(hardwareMap);

    }

    @Override
    public void loop() {
        bench.setMotorSpeed(0.5);
        telemetry.addData("Motor Revs",bench.getMotorRevs());

    }
}
