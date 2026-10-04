package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous
public class PracticeAutoSimple extends LinearOpMode {

    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;

    private ElapsedTime runtime = new ElapsedTime();


    @Override

    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();


        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
       backRight = hardwareMap.dcMotor.get("backRight");

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        runtime.reset();

        while (opModeIsActive()&&(runtime.seconds() < 4)){
            drive(0.2);

        }
        sleep(500);
        runtime.reset();
        while (opModeIsActive()&&(runtime.seconds()<4)){
            drive(-0.2);
        }


        brake();

    }

    public void drive(double speed){
        frontLeft.setPower(-speed);
        backLeft.setPower(-speed);
        frontRight.setPower(speed);
        backRight.setPower(speed);
    }

    public void brake(){
        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }
}
