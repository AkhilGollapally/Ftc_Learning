package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Something")

public class tank_Drive extends LinearOpMode {
    private DcMotor rightFrontMotor;
    private DcMotor leftFrontMotor;
    private DcMotor rightBackMotor;
    private DcMotor leftBackMotor;

    @Override
    public void runOpMode() throws InterruptedException {

        rightFrontMotor = hardwareMap.dcMotor.get("rightFrontMotor");
        rightBackMotor = hardwareMap.dcMotor.get("rightFrontMotor");
        leftBackMotor = hardwareMap.dcMotor.get("rightFrontMotor");
        leftFrontMotor = hardwareMap.dcMotor.get("rightFrontMotor");

        waitForStart();
        if(isStopRequested())return;

        while(opModeIsActive()){

            if(gamepad1.left_stick_y<-0.05){
                rightFrontMotor.setPower(0.5);
                rightBackMotor.setPower(0.5);
                leftBackMotor.setPower(0.5);
                leftFrontMotor.setPower(0.5);
            }

            else if(gamepad1.left_stick_y>0.05){
                rightFrontMotor.setPower(-0.5);
                rightBackMotor.setPower(-0.5);
                leftBackMotor.setPower(-0.5);
                leftFrontMotor.setPower(-0.5);
            }

            else{
                rightFrontMotor.setPower(0);
                rightBackMotor.setPower(0);
                leftFrontMotor.setPower(0);
                leftBackMotor.setPower(0);
            }
        }


    }
}

