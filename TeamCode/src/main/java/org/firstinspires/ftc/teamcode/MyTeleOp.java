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

        armMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


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
                speedMultiplier =1.0;
            }


            double drive = -gamepad1.left_stick_y;
            double strafe = gamepad1.left_stick_x;
            double turn = gamepad1.right_stick_x;


            if(Math.abs(drive)<0.05) drive = 0.00;
            if (Math.abs(turn)<0.05) turn = 0.00;
            if(Math.abs(strafe)<0.05) strafe = 0.00;


            double leftFrontPower = drive+strafe+turn;
            double rightFrontPower= drive-strafe-turn;
            double leftBackPower = drive-strafe +turn;
            double rightBackPower = drive+strafe-turn;

                leftFrontPower *= speedMultiplier;
                leftBackPower *= speedMultiplier;
                rightFrontPower *= speedMultiplier;
                rightBackPower *= speedMultiplier;

                leftFrontMotor.setPower(leftFrontPower);
                leftBackMotor.setPower(leftBackPower);
                rightFrontMotor.setPower(rightFrontPower);
                rightBackMotor.setPower(rightBackPower);





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
