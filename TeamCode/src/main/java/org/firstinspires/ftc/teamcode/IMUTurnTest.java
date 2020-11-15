package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

@Autonomous
@Disabled
public class IMUTurnTest extends Robot{

    public void op_mode(){
        waitForStart();
        reorientIMU(90, -0.5, 0.5, 1, 1.5, 0, 0);
    }
}
