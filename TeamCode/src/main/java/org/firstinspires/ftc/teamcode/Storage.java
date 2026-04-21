package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Storage {
    DcMotor rightFrontMotor;
    DcMotor rightBackMotor;
    DcMotor leftFrontMotor;
    DcMotor leftBackMotor;

    public void config_teleop(){

        rightFrontMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        rightBackMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        rightBackMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightFrontMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftFrontMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        leftBackMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

    public void set_Motors(HardwareMap hwMap){
        rightBackMotor = hwMap.dcMotor.get("rightBackMotor");
        rightFrontMotor = hwMap.dcMotor.get("rightFrontMotor");
        leftBackMotor = hwMap.dcMotor.get("leftBackMotor");
        leftFrontMotor = hwMap.dcMotor.get("leftFrontMotor");
    }

    public void set_wheel_power(double rfPower, double rbPower, double lfPower, double lbPower){
        rightFrontMotor.setPower(rfPower);
        rightBackMotor.setPower(rbPower);
        leftFrontMotor.setPower(lfPower);
        leftBackMotor.setPower(lbPower);
    }

    public void stop_motors(){
        set_wheel_power(0,0,0,0);
    }

}
