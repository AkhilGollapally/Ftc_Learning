package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class DayClass extends LinearOpMode {

    DcMotor testMotor;
    Servo testServo;





    @Override


    public void runOpMode() throws InterruptedException{
        testMotor = hardwareMap.dcMotor.get("testMotor");
        testServo = hardwareMap.servo.get("TestServo");
        telemetry.addData("Robot Status","Initialized");
        telemetry.update();
        waitForStart();

        testServo.setPosition(1);

        sleep(2000);

        testServo.setPosition(0);


    }

}
