package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Autonomous

public class CavanTalk extends OpMode {
    @Override
    public void init() {
        if (gamepad1.a){
            telemetry.addData("Cavan","Is not talking to me!");

            if (gamepad1.right_trigger < 0.9 && gamepad1.b){
                telemetry.addData("Cavan", "Is still not talking to me!");

            }


            String name = "Daksha";
            String SchoolName  = "Beaver Lake Middle School";
            telemetry.addData("Cavan forced me to make", name ,"as a string variable!");



        }

    }

    @Override
    public void loop() {

    }
}
