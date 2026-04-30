package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Storage {
    DcMotor rightFrontMotor;
    DcMotor rightBackMotor;
    DcMotor leftFrontMotor;
    DcMotor leftBackMotor;
    DcMotor armMotor;

    public void config_teleop(){

        rightFrontMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        rightBackMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        rightBackMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightFrontMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftFrontMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftBackMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        armMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

    public void set_Motors(HardwareMap hwMap){
        rightBackMotor = hwMap.get(DcMotor.class,"rightBackMotor");
        rightFrontMotor = hwMap.get(DcMotor.class,"rightFrontMotor");
        leftBackMotor = hwMap.get(DcMotor.class,"leftBackMotor");
        leftFrontMotor = hwMap.get(DcMotor.class,"leftFrontMotor");
        armMotor = hwMap.get(DcMotor.class,"armMotor");
    }

    public void set_power(double rfPower, double rbPower, double lfPower, double lbPower, double aPower){


        rightFrontMotor.setPower(rfPower);
        rightBackMotor.setPower(rbPower);
        leftFrontMotor.setPower(lfPower);
        leftBackMotor.setPower(lbPower);
        armMotor.setPower(aPower);
    }

    public void stop_motors(){
        set_power(0,0,0,0,0);
    }

}
