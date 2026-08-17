package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp (name = "CoolTeleOp")
public class CoolTeleOp extends LinearOpMode{

    private Storage Storage;

    @Override
    public void runOpMode() throws InterruptedException{

        double drive, turn, strafe;
        double rbPower, rfPower, lbPower, lfPower,aPower;


        Storage = new Storage();
        Storage.set_Motors(hardwareMap);
        Storage.config_teleop();

        waitForStart();
        if (isStopRequested()) return;

        while (opModeIsActive()){


            drive = gamepad1.left_stick_y * -1;
            turn = gamepad1.right_stick_x;
            strafe = gamepad1.left_stick_x;

            rbPower = drive -turn + strafe;
            rfPower = drive - turn - strafe;
            lbPower = drive + turn - strafe;
            lfPower = drive + turn + strafe;


            


            if (gamepad1.a){
                aPower = 0.7;
            }
            else if (gamepad1.b){
                aPower = -0.7;
            }
            else{
                aPower = 0;
            }

            Storage.set_power(rfPower,rbPower,lfPower,lbPower,aPower);
        }
        Storage.stop_motors();
    }
}