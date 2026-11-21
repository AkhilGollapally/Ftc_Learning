package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp

public class RunMotor extends OpMode {
    public DcMotor motor;

    public boolean bPressed = false;
    @Override
    public void init(){

        hardwareMap.get(DcMotor.class, "motor");
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);





    }
    @Override
    public void loop(){
        if(gamepad1.a){
            motor.setPower(1);
        }
        else{
            motor.setPower(0);
        }

        bPressed = gamepad1.b;

        telemetry.addData("bPressed",bPressed);

    }
}
