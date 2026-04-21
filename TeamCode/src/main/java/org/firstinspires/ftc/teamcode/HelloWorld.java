package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
/* Disabled means that the code will NOT show up on the driver base TeleOp.
However, it will still show up on TeamCode.
 */


@TeleOp /* This is the 2 minute driver controlled period where the team
members use gamepads to operate their robot, following the 30 second
Autonomous period. To code for autonomous, you would write @Autonomous
 in place of @TeleOp. */


public class HelloWorld extends OpMode {
    /* We wrote "HelloWorld extends OpMode." Basically, OpMode is the base class.
    Because we wrote "Extends", some traits are inherited from OpMode to
    HelloWorld class. For example, some methods such as public void init will
    come immediately, because they act as an inherited trait from OpMode to
    HelloWorld.
     */

    @Override
    /* This is @Override. This line of code's purpose is to override the existing
    code in the public void init method of OpMode. Since that method is inherited
    from OpMode to HelloWorld, the code in OpMode's public void init method will
    appear in HelloWorld's public void init method. We do not want this as we are trying
    to make our own original code for FTC. So, we input @Override to override the
    code from OpMode, which allows us to write our own code for the public void
    init method.
     */

    public void init() {
        /*The following code in this method will show up on the driver hub once
        the INIT function is pressed on the driver hub robot controller.
         */

        String MyName = "Akhil";
        telemetry.addData("Hello" , MyName);/* This will show up on
         the control hub under TeleOp INIT. */

        int number = 1;
        while(number<100){
            number++;
            System.out.println(number);
        }
    }


    public void loop() {
        /*This is code that runs over and over and over again. The robot will sense
        the environment first, then think what to do. For example, if the color is
        red, I will close my claw. Then the robot will act, which is actually
        closing the claw.
         */
        int x = 25;
        int y = 37;

    }
}
