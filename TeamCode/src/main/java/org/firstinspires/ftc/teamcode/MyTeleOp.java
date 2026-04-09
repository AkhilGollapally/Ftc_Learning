package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp (name = "MyTeleOp")


public class MyTeleOp extends LinearOpMode {

    private DcMotor leftFrontMotor;
    private DcMotor rightFrontMotor;
    private DcMotor rightBackMotor;
    private DcMotor leftBackMotor;
    private DcMotor armMotor;


    @Override
    public void runOpMode() throws InterruptedException {



        leftFrontMotor = hardwareMap.get(DcMotor.class,"leftFrontMotor");
        rightFrontMotor = hardwareMap.get(DcMotor.class,"rightFrontMotor");
        rightBackMotor = hardwareMap.get(DcMotor.class,"rightBackMotor");
        leftBackMotor = hardwareMap.get(DcMotor.class,"leftBackMotor");
        armMotor = hardwareMap.get(DcMotor.class,"armMotor");

        leftFrontMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightFrontMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightBackMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftBackMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        armMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftFrontMotor.setDirection(DcMotor.Direction.REVERSE);
        leftBackMotor.setDirection(DcMotor.Direction.REVERSE);


        waitForStart();
        if (isStopRequested()) return;

        while(opModeIsActive()){

            double speedMultiplier = 0.75;
            if (gamepad1.right_bumper){ //slow mode
                speedMultiplier = 0.4;
            }
            else if (gamepad1.left_bumper){ // fast mode
                speedMultiplier =0.8;
            }


            double drive = -gamepad1.left_stick_y;
            double turn = gamepad1.right_stick_x;

            if(Math.abs(drive)<0.05){
                drive = 0.0;

            }
            if (Math.abs(turn)<0.05){
                turn = 0.0;
            }

            double leftPower = drive+turn;
            double rightPower= drive-turn;

             leftPower = Math.max(-1,Math.min(1,leftPower));
             rightPower = Math.max(-1,Math.min(1,rightPower));

            leftFrontMotor.setPower(leftPower * speedMultiplier);
            leftBackMotor.setPower(leftPower * speedMultiplier);
            rightFrontMotor.setPower(rightPower * speedMultiplier);
            rightBackMotor.setPower(rightPower * speedMultiplier);

            if(gamepad1.a){
                armMotor.setPower(0.7);
            }
            else if(gamepad1.b){
                armMotor.setPower(-0.7);
            }
            else{
                armMotor.setPower(0);
            }


        }


    }
}
