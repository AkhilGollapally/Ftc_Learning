package org.firstinspires.ftc.teamcode;

public class RobotLocationPractice {

    double angle;



    public RobotLocationPractice(double angle){
        this.angle=angle;
    }

public double getHeading(){
        double angle = this.angle;
        while (angle > 180){
            angle -= 360;
        }
        while(angle <= -180){
            angle += 360;
        }
        return angle;


    }

    public void turnRobot(double angleChange){
        angle += angleChange;
    }

    public void setAngle(double angle){
        this.angle = angle;

}

public double getAngle(){
        return this.angle;

}








}






